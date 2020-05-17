package typingsSlinky.nodePushnotifications.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clientid extends js.Object {
  var client_id: js.UndefOr[String] = js.native
  var client_secret: js.UndefOr[String] = js.native
}

object Clientid {
  @scala.inline
  def apply(): Clientid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clientid]
  }
  @scala.inline
  implicit class ClientidOps[Self <: Clientid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(js.undefined)
        ret
    }
  }
  
}

