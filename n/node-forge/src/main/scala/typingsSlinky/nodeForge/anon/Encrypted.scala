package typingsSlinky.nodeForge.anon

import typingsSlinky.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encrypted extends js.Object {
  var encrypted: Boolean = js.native
  var safeBags: js.Array[Bag] = js.native
}

object Encrypted {
  @scala.inline
  def apply(encrypted: Boolean, safeBags: js.Array[Bag]): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  @scala.inline
  implicit class EncryptedOps[Self <: Encrypted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeBags(value: js.Array[Bag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeBags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

