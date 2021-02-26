package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ValueFrequency extends StObject {
  
  /** How many times the value is contained in the field. */
  var count: js.UndefOr[String] = js.native
  
  /** A value contained in the field in question. */
  var value: js.UndefOr[GooglePrivacyDlpV2Value] = js.native
}
object GooglePrivacyDlpV2ValueFrequency {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ValueFrequency]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ValueFrequencyMutableBuilder[Self <: GooglePrivacyDlpV2ValueFrequency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
