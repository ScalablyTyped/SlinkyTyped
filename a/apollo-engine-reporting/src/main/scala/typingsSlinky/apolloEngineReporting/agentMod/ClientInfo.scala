package typingsSlinky.apolloEngineReporting.agentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientInfo extends js.Object {
  var clientName: js.UndefOr[String] = js.native
  var clientReferenceId: js.UndefOr[String] = js.native
  var clientVersion: js.UndefOr[String] = js.native
}

object ClientInfo {
  @scala.inline
  def apply(): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientInfo]
  }
  @scala.inline
  implicit class ClientInfoOps[Self <: ClientInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientName")(js.undefined)
        ret
    }
    @scala.inline
    def withClientReferenceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientReferenceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientReferenceId")(js.undefined)
        ret
    }
    @scala.inline
    def withClientVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientVersion")(js.undefined)
        ret
    }
  }
  
}

