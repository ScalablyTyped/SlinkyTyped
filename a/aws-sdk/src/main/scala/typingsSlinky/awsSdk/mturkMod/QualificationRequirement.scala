package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualificationRequirement extends js.Object {
  
  /**
    *  Setting this attribute prevents Workers whose Qualifications do not meet this QualificationRequirement from taking the specified action. Valid arguments include "Accept" (Worker cannot accept the HIT, but can preview the HIT and see it in their search results), "PreviewAndAccept" (Worker cannot accept or preview the HIT, but can see the HIT in their search results), and "DiscoverPreviewAndAccept" (Worker cannot accept, preview, or see the HIT in their search results). It's possible for you to create a HIT with multiple QualificationRequirements (which can have different values for the ActionGuarded attribute). In this case, the Worker is only permitted to perform an action when they have met all QualificationRequirements guarding the action. The actions in the order of least restrictive to most restrictive are Discover, Preview and Accept. For example, if a Worker meets all QualificationRequirements that are set to DiscoverPreviewAndAccept, but do not meet all requirements that are set with PreviewAndAccept, then the Worker will be able to Discover, i.e. see the HIT in their search result, but will not be able to Preview or Accept the HIT. ActionsGuarded should not be used in combination with the RequiredToPreview field. 
    */
  var ActionsGuarded: js.UndefOr[HITAccessActions] = js.native
  
  /**
    * The kind of comparison to make against a Qualification's value. You can compare a Qualification's value to an IntegerValue to see if it is LessThan, LessThanOrEqualTo, GreaterThan, GreaterThanOrEqualTo, EqualTo, or NotEqualTo the IntegerValue. You can compare it to a LocaleValue to see if it is EqualTo, or NotEqualTo the LocaleValue. You can check to see if the value is In or NotIn a set of IntegerValue or LocaleValue values. Lastly, a Qualification requirement can also test if a Qualification Exists or DoesNotExist in the user's profile, regardless of its value. 
    */
  var Comparator: typingsSlinky.awsSdk.mturkMod.Comparator = js.native
  
  /**
    *  The integer value to compare against the Qualification's value. IntegerValue must not be present if Comparator is Exists or DoesNotExist. IntegerValue can only be used if the Qualification type has an integer value; it cannot be used with the Worker_Locale QualificationType ID. When performing a set comparison by using the In or the NotIn comparator, you can use up to 15 IntegerValue elements in a QualificationRequirement data structure. 
    */
  var IntegerValues: js.UndefOr[IntegerList] = js.native
  
  /**
    *  The locale value to compare against the Qualification's value. The local value must be a valid ISO 3166 country code or supports ISO 3166-2 subdivisions. LocaleValue can only be used with a Worker_Locale QualificationType ID. LocaleValue can only be used with the EqualTo, NotEqualTo, In, and NotIn comparators. You must only use a single LocaleValue element when using the EqualTo or NotEqualTo comparators. When performing a set comparison by using the In or the NotIn comparator, you can use up to 30 LocaleValue elements in a QualificationRequirement data structure. 
    */
  var LocaleValues: js.UndefOr[LocaleList] = js.native
  
  /**
    *  The ID of the Qualification type for the requirement.
    */
  var QualificationTypeId: String = js.native
  
  /**
    *  DEPRECATED: Use the ActionsGuarded field instead. If RequiredToPreview is true, the question data for the HIT will not be shown when a Worker whose Qualifications do not meet this requirement tries to preview the HIT. That is, a Worker's Qualifications must meet all of the requirements for which RequiredToPreview is true in order to preview the HIT. If a Worker meets all of the requirements where RequiredToPreview is true (or if there are no such requirements), but does not meet all of the requirements for the HIT, the Worker will be allowed to preview the HIT's question data, but will not be allowed to accept and complete the HIT. The default is false. This should not be used in combination with the ActionsGuarded field. 
    */
  var RequiredToPreview: js.UndefOr[Boolean] = js.native
}
object QualificationRequirement {
  
  @scala.inline
  def apply(Comparator: Comparator, QualificationTypeId: String): QualificationRequirement = {
    val __obj = js.Dynamic.literal(Comparator = Comparator.asInstanceOf[js.Any], QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualificationRequirement]
  }
  
  @scala.inline
  implicit class QualificationRequirementOps[Self <: QualificationRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparator(value: Comparator): Self = this.set("Comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeId(value: String): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsGuarded(value: HITAccessActions): Self = this.set("ActionsGuarded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsGuarded: Self = this.set("ActionsGuarded", js.undefined)
    
    @scala.inline
    def setIntegerValuesVarargs(value: Integer*): Self = this.set("IntegerValues", js.Array(value :_*))
    
    @scala.inline
    def setIntegerValues(value: IntegerList): Self = this.set("IntegerValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValues: Self = this.set("IntegerValues", js.undefined)
    
    @scala.inline
    def setLocaleValuesVarargs(value: Locale*): Self = this.set("LocaleValues", js.Array(value :_*))
    
    @scala.inline
    def setLocaleValues(value: LocaleList): Self = this.set("LocaleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleValues: Self = this.set("LocaleValues", js.undefined)
    
    @scala.inline
    def setRequiredToPreview(value: Boolean): Self = this.set("RequiredToPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredToPreview: Self = this.set("RequiredToPreview", js.undefined)
  }
}
