package typingsSlinky.hellosignEmbedded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCcroles extends js.Object {
  var cc_roles: js.Array[AnonNameString] = js.native
  var message: String = js.native
  var signer_roles: js.Array[AnonName] = js.native
  var title: String = js.native
}

object AnonCcroles {
  @scala.inline
  def apply(
    cc_roles: js.Array[AnonNameString],
    message: String,
    signer_roles: js.Array[AnonName],
    title: String
  ): AnonCcroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCcroles]
  }
  @scala.inline
  implicit class AnonCcrolesOps[Self <: AnonCcroles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCc_roles(value: js.Array[AnonNameString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc_roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigner_roles(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signer_roles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

