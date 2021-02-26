package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pseudonymization method that generates surrogates via cryptographic
  * hashing. Uses SHA-256. The key size must be either 32 or 64 bytes. Outputs
  * a base64 encoded representation of the hashed output (for example,
  * L7k0BHmF1ha5U3NfGykjro4xWi1MPVQPjhMAZbSV9mM=). Currently, only string and
  * integer values can be hashed. See
  * https://cloud.google.com/dlp/docs/pseudonymization to learn more.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CryptoHashConfig extends StObject {
  
  /**
    * The key used by the hash function.
    */
  var cryptoKey: js.UndefOr[SchemaGooglePrivacyDlpV2CryptoKey] = js.native
}
object SchemaGooglePrivacyDlpV2CryptoHashConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CryptoHashConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CryptoHashConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CryptoHashConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2CryptoHashConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptoKey(value: SchemaGooglePrivacyDlpV2CryptoKey): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoKeyUndefined: Self = StObject.set(x, "cryptoKey", js.undefined)
  }
}
