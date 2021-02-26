package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TimePartConfig extends StObject {
  
  /** The part of the time to keep. */
  var partToExtract: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2TimePartConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TimePartConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TimePartConfigMutableBuilder[Self <: GooglePrivacyDlpV2TimePartConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartToExtract(value: String): Self = StObject.set(x, "partToExtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartToExtractUndefined: Self = StObject.set(x, "partToExtract", js.undefined)
  }
}
