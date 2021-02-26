package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningConfigurationOverrides extends StObject {
  
  /**
    * A specified override of the default encryption algorithm that is used in a code signing job.
    */
  var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.native
  
  /**
    * A specified override of the default hash algorithm that is used in a code signing job.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.native
}
object SigningConfigurationOverrides {
  
  @scala.inline
  def apply(): SigningConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningConfigurationOverrides]
  }
  
  @scala.inline
  implicit class SigningConfigurationOverridesMutableBuilder[Self <: SigningConfigurationOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setHashAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
  }
}
