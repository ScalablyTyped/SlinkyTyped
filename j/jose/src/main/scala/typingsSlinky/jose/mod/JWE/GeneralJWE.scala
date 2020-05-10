package typingsSlinky.jose.mod.JWE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralJWE extends JWEJSON {
  var recipients: js.Array[JWERecipient] = js.native
}

object GeneralJWE {
  @scala.inline
  def apply(ciphertext: String, iv: String, recipients: js.Array[JWERecipient], tag: String): GeneralJWE = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralJWE]
  }
  @scala.inline
  implicit class GeneralJWEOps[Self <: GeneralJWE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipients(value: js.Array[JWERecipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

