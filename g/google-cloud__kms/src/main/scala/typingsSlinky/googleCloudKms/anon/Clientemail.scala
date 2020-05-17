package typingsSlinky.googleCloudKms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientemail extends js.Object {
  var client_email: js.UndefOr[String] = js.native
  var private_key: js.UndefOr[String] = js.native
}

object Clientemail {
  @scala.inline
  def apply(): Clientemail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clientemail]
  }
  @scala.inline
  implicit class ClientemailOps[Self <: Clientemail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_email(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_email")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(js.undefined)
        ret
    }
  }
  
}

