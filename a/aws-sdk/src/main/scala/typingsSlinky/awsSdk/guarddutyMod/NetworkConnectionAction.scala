package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConnectionAction extends js.Object {
  /**
    * Network connection blocked information.
    */
  var Blocked: js.UndefOr[Boolean] = js.native
  /**
    * Network connection direction.
    */
  var ConnectionDirection: js.UndefOr[String] = js.native
  /**
    * Local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  /**
    * Network connection protocol.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
  /**
    * Remote port information of the connection.
    */
  var RemotePortDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.RemotePortDetails] = js.native
}

object NetworkConnectionAction {
  @scala.inline
  def apply(): NetworkConnectionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConnectionAction]
  }
  @scala.inline
  implicit class NetworkConnectionActionOps[Self <: NetworkConnectionAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocked")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalIpDetails(value: LocalIpDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalIpDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalIpDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalIpDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalPortDetails(value: LocalPortDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPortDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalPortDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalPortDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteIpDetails(value: RemoteIpDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteIpDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteIpDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoteIpDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withRemotePortDetails(value: RemotePortDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemotePortDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemotePortDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemotePortDetails")(js.undefined)
        ret
    }
  }
  
}

