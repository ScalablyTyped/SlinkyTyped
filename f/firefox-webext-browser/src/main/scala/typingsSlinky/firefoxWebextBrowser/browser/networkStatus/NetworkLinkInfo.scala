package typingsSlinky.firefoxWebextBrowser.browser.networkStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* networkStatus types */
@js.native
trait NetworkLinkInfo extends js.Object {
  /** If known, the network id or name. */
  var id: js.UndefOr[String] = js.native
  /** Status of the network link, if "unknown" then link is usually assumed to be "up" */
  var status: NetworkLinkInfoStatus = js.native
  /** If known, the type of network connection that is avialable. */
  var `type`: NetworkLinkInfoType = js.native
}

object NetworkLinkInfo {
  @scala.inline
  def apply(status: NetworkLinkInfoStatus, `type`: NetworkLinkInfoType): NetworkLinkInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkLinkInfo]
  }
  @scala.inline
  implicit class NetworkLinkInfoOps[Self <: NetworkLinkInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: NetworkLinkInfoStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: NetworkLinkInfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

