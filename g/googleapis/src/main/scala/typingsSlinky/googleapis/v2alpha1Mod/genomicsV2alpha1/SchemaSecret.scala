package typingsSlinky.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Holds encrypted information that is only decrypted and stored in RAM by the
  * worker VM when running the pipeline.
  */
@js.native
trait SchemaSecret extends StObject {
  
  /**
    * The value of the cipherText response from the `encrypt` method. This
    * field is intentionally unaudited.
    */
  var cipherText: js.UndefOr[String] = js.native
  
  /**
    * The name of the Cloud KMS key that will be used to decrypt the secret
    * value. The VM service account must have the required permissions and
    * authentication scopes to invoke the `decrypt` method on the specified
    * key.
    */
  var keyName: js.UndefOr[String] = js.native
}
object SchemaSecret {
  
  @scala.inline
  def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  @scala.inline
  implicit class SchemaSecretMutableBuilder[Self <: SchemaSecret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCipherText(value: String): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherTextUndefined: Self = StObject.set(x, "cipherText", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
  }
}
