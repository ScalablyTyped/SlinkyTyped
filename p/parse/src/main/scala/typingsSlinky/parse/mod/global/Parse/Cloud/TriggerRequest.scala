package typingsSlinky.parse.mod.global.Parse.Cloud

import typingsSlinky.parse.mod.global.Parse.Attributes
import typingsSlinky.parse.mod.global.Parse.Object
import typingsSlinky.parse.mod.global.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerRequest extends js.Object {
  var headers: js.Any = js.native
  var installationId: js.UndefOr[String] = js.native
  var ip: String = js.native
  var log: js.Any = js.native
  var master: js.UndefOr[Boolean] = js.native
  var `object`: Object[Attributes] = js.native
  var original: js.UndefOr[Object[Attributes]] = js.native
  var triggerName: String = js.native
  var user: js.UndefOr[User[Attributes]] = js.native
}

object TriggerRequest {
  @scala.inline
  def apply(headers: js.Any, ip: String, log: js.Any, `object`: Object[Attributes], triggerName: String): TriggerRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerRequest]
  }
  @scala.inline
  implicit class TriggerRequestOps[Self <: TriggerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: Object[Attributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaster(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginal(value: Object[Attributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: User[Attributes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

