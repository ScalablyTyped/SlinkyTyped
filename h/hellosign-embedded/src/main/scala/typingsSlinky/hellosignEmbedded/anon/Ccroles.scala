package typingsSlinky.hellosignEmbedded.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ccroles extends js.Object {
  var cc_roles: js.Array[NameString] = js.native
  var message: String = js.native
  var signer_roles: js.Array[Name] = js.native
  var title: String = js.native
}

object Ccroles {
  @scala.inline
  def apply(cc_roles: js.Array[NameString], message: String, signer_roles: js.Array[Name], title: String): Ccroles = {
    val __obj = js.Dynamic.literal(cc_roles = cc_roles.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signer_roles = signer_roles.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ccroles]
  }
  @scala.inline
  implicit class CcrolesOps[Self <: Ccroles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCc_roles(value: js.Array[NameString]): Self = {
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
    def withSigner_roles(value: js.Array[Name]): Self = {
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

