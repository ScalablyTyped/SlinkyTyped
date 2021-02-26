package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A compliance rule condition which is satisfied if there exists any matching
  * NonComplianceDetail for the device. A NonComplianceDetail matches a
  * NonComplianceDetailCondition if all the fields which are set within the
  * NonComplianceDetailCondition match the corresponding NonComplianceDetail
  * fields.
  */
@js.native
trait SchemaNonComplianceDetailCondition extends StObject {
  
  /**
    * The reason the device is not in compliance with the setting. If not set,
    * then this condition matches any reason.
    */
  var nonComplianceReason: js.UndefOr[String] = js.native
  
  /**
    * The package name of the app that&#39;s out of compliance. If not set,
    * then this condition matches any package name.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * The name of the policy setting. This is the JSON field name of a
    * top-level Policy field. If not set, then this condition matches any
    * setting name.
    */
  var settingName: js.UndefOr[String] = js.native
}
object SchemaNonComplianceDetailCondition {
  
  @scala.inline
  def apply(): SchemaNonComplianceDetailCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNonComplianceDetailCondition]
  }
  
  @scala.inline
  implicit class SchemaNonComplianceDetailConditionMutableBuilder[Self <: SchemaNonComplianceDetailCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonComplianceReason(value: String): Self = StObject.set(x, "nonComplianceReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonComplianceReasonUndefined: Self = StObject.set(x, "nonComplianceReason", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setSettingName(value: String): Self = StObject.set(x, "settingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingNameUndefined: Self = StObject.set(x, "settingName", js.undefined)
  }
}
