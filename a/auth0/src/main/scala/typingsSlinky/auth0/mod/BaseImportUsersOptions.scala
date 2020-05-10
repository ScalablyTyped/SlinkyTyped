package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseImportUsersOptions extends js.Object {
  var connection_id: String = js.native
  var external_id: js.UndefOr[String] = js.native
  var send_completion_email: js.UndefOr[Boolean] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object BaseImportUsersOptions {
  @scala.inline
  def apply(connection_id: String): BaseImportUsersOptions = {
    val __obj = js.Dynamic.literal(connection_id = connection_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImportUsersOptions]
  }
  @scala.inline
  implicit class BaseImportUsersOptionsOps[Self <: BaseImportUsersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSend_completion_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_completion_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend_completion_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send_completion_email")(js.undefined)
        ret
    }
    @scala.inline
    def withUpsert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsert")(js.undefined)
        ret
    }
  }
  
}

