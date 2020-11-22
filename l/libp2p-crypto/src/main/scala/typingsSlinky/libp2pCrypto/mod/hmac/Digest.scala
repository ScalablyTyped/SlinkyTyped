package typingsSlinky.libp2pCrypto.mod.hmac

import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`20`
import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`32`
import typingsSlinky.libp2pCrypto.libp2pCryptoNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HMAC Digest.
  */
@js.native
trait Digest extends js.Object {
  
  def digest(data: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  
  var length: `20` | `32` | `64` | Double = js.native
}
object Digest {
  
  @scala.inline
  def apply(
    digest: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array],
    length: `20` | `32` | `64` | Double
  ): Digest = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction1(digest), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digest]
  }
  
  @scala.inline
  implicit class DigestOps[Self <: Digest] (val x: Self) extends AnyVal {
    
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
    def setDigest(value: js.typedarray.Uint8Array => js.Promise[js.typedarray.Uint8Array]): Self = this.set("digest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: `20` | `32` | `64` | Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
