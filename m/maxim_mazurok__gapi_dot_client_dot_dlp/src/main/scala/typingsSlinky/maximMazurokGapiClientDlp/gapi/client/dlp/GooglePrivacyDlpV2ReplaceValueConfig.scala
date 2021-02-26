package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ReplaceValueConfig extends StObject {
  
  /** Value to replace it with. */
  var newValue: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
}
object GooglePrivacyDlpV2ReplaceValueConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ReplaceValueConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ReplaceValueConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ReplaceValueConfigMutableBuilder[Self <: GooglePrivacyDlpV2ReplaceValueConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
  }
}
