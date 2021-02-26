package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InspectionRule extends StObject {
  
  /** Exclusion rule. */
  var exclusionRule: js.UndefOr[GooglePrivacyDlpV2ExclusionRule] = js.native
  
  /** Hotword-based detection rule. */
  var hotwordRule: js.UndefOr[GooglePrivacyDlpV2HotwordRule] = js.native
}
object GooglePrivacyDlpV2InspectionRule {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectionRule]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InspectionRuleMutableBuilder[Self <: GooglePrivacyDlpV2InspectionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusionRule(value: GooglePrivacyDlpV2ExclusionRule): Self = StObject.set(x, "exclusionRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionRuleUndefined: Self = StObject.set(x, "exclusionRule", js.undefined)
    
    @scala.inline
    def setHotwordRule(value: GooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
