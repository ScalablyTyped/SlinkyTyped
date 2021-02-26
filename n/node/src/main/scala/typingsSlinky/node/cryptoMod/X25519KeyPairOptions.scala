package typingsSlinky.node.cryptoMod

import typingsSlinky.node.anon.FormatType
import typingsSlinky.node.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X25519KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends StObject {
  
  var privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0` = js.native
  
  var publicKeyEncoding: FormatType[PubF] = js.native
}
object X25519KeyPairOptions {
  
  @scala.inline
  def apply[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */](
    privateKeyEncoding: BasePrivateKeyEncodingOptions[PrivF] with `0`,
    publicKeyEncoding: FormatType[PubF]
  ): X25519KeyPairOptions[PubF, PrivF] = {
    val __obj = js.Dynamic.literal(privateKeyEncoding = privateKeyEncoding.asInstanceOf[js.Any], publicKeyEncoding = publicKeyEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[X25519KeyPairOptions[PubF, PrivF]]
  }
  
  @scala.inline
  implicit class X25519KeyPairOptionsMutableBuilder[Self <: X25519KeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (X25519KeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `0`): Self = StObject.set(x, "privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = StObject.set(x, "publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
