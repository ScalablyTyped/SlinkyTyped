package typingsSlinky.pkijs.anon

import typingsSlinky.pkijs.certificateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientCertificate extends js.Object {
  var recipientCertificate: default = js.native
  var recipientPrivateKey: js.typedarray.ArrayBuffer = js.native
}

object RecipientCertificate {
  @scala.inline
  def apply(recipientCertificate: default, recipientPrivateKey: js.typedarray.ArrayBuffer): RecipientCertificate = {
    val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientCertificate]
  }
  @scala.inline
  implicit class RecipientCertificateOps[Self <: RecipientCertificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipientCertificate(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientCertificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipientPrivateKey(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientPrivateKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

