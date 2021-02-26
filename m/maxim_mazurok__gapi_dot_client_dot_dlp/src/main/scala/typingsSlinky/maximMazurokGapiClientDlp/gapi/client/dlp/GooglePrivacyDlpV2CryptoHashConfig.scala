package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2CryptoHashConfig extends StObject {
  
  /** The key used by the hash function. */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2CryptoKey] = js.native
}
object GooglePrivacyDlpV2CryptoHashConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2CryptoHashConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2CryptoHashConfigMutableBuilder[Self <: GooglePrivacyDlpV2CryptoHashConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKey(value: GooglePrivacyDlpV2CryptoKey): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
