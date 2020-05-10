package typingsSlinky.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringSecretBox extends js.Object {
  var cipher: String = js.native
  var mac: String = js.native
}

object StringSecretBox {
  @scala.inline
  def apply(cipher: String, mac: String): StringSecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSecretBox]
  }
  @scala.inline
  implicit class StringSecretBoxOps[Self <: StringSecretBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCipher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cipher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMac(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mac")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

