package typingsSlinky.node.cryptoMod

import typingsSlinky.node.anon.FormatType
import typingsSlinky.node.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X25519KeyPairOptions[PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] extends js.Object {
  
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
  implicit class X25519KeyPairOptionsOps[Self <: X25519KeyPairOptions[_, _], PubF /* <: KeyFormat */, PrivF /* <: KeyFormat */] (val x: Self with (X25519KeyPairOptions[PubF, PrivF])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrivateKeyEncoding(value: BasePrivateKeyEncodingOptions[PrivF] with `0`): Self = this.set("privateKeyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyEncoding(value: FormatType[PubF]): Self = this.set("publicKeyEncoding", value.asInstanceOf[js.Any])
  }
}
