package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CustomInfoType extends StObject {
  
  /** Set of detection rules to apply to all findings of this CustomInfoType. Rules are applied in order that they are specified. Not supported for the `surrogate_type` CustomInfoType. */
  var detectionRules: js.UndefOr[js.Array[GooglePrivacyDlpV2DetectionRule]] = js.native
  
  /** A list of phrases to detect as a CustomInfoType. */
  var dictionary: js.UndefOr[GooglePrivacyDlpV2Dictionary] = js.native
  
  /** If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding to be returned. It still can be used for rules matching. */
  var exclusionType: js.UndefOr[String] = js.native
  
  /**
    * CustomInfoType can either be a new infoType, or an extension of built-in infoType, when the name matches one of existing infoTypes and that infoType is specified in
    * `InspectContent.info_types` field. Specifying the latter adds findings to the one detected by the system. If built-in info type is not specified in `InspectContent.info_types` list
    * then the name is treated as a custom info type.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * Likelihood to return for this CustomInfoType. This base value can be altered by a detection rule if the finding meets the criteria specified by the rule. Defaults to `VERY_LIKELY`
    * if not specified.
    */
  var likelihood: js.UndefOr[String] = js.native
  
  /** Regular expression based CustomInfoType. */
  var regex: js.UndefOr[GooglePrivacyDlpV2Regex] = js.native
  
  /** Load an existing `StoredInfoType` resource for use in `InspectDataSource`. Not currently supported in `InspectContent`. */
  var storedType: js.UndefOr[GooglePrivacyDlpV2StoredType] = js.native
  
  /** Message for detecting output from deidentification transformations that support reversing. */
  var surrogateType: js.UndefOr[js.Any] = js.native
}
object GooglePrivacyDlpV2CustomInfoType {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CustomInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CustomInfoType]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CustomInfoTypeMutableBuilder[Self <: GooglePrivacyDlpV2CustomInfoType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectionRules(value: js.Array[GooglePrivacyDlpV2DetectionRule]): Self = StObject.set(x, "detectionRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectionRulesUndefined: Self = StObject.set(x, "detectionRules", js.undefined)
    
    @scala.inline
    def setDetectionRulesVarargs(value: GooglePrivacyDlpV2DetectionRule*): Self = StObject.set(x, "detectionRules", js.Array(value :_*))
    
    @scala.inline
    def setDictionary(value: GooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setExclusionType(value: String): Self = StObject.set(x, "exclusionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionTypeUndefined: Self = StObject.set(x, "exclusionType", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setLikelihood(value: String): Self = StObject.set(x, "likelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikelihoodUndefined: Self = StObject.set(x, "likelihood", js.undefined)
    
    @scala.inline
    def setRegex(value: GooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setStoredType(value: GooglePrivacyDlpV2StoredType): Self = StObject.set(x, "storedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredTypeUndefined: Self = StObject.set(x, "storedType", js.undefined)
    
    @scala.inline
    def setSurrogateType(value: js.Any): Self = StObject.set(x, "surrogateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurrogateTypeUndefined: Self = StObject.set(x, "surrogateType", js.undefined)
  }
}
