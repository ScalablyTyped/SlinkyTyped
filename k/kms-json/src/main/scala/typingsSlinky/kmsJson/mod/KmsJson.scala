package typingsSlinky.kmsJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KmsJson extends js.Object {
  def decrypt(cipherText: String): js.Object = js.native
  def encrypt(inputJson: js.Object): String = js.native
}

object KmsJson {
  @scala.inline
  def apply(decrypt: String => js.Object, encrypt: js.Object => String): KmsJson = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[KmsJson]
  }
  @scala.inline
  implicit class KmsJsonOps[Self <: KmsJson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecrypt(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncrypt(value: js.Object => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

