package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeDetail extends js.Object {
  /**
    * Local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
}

object PortProbeDetail {
  @scala.inline
  def apply(): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortProbeDetail]
  }
  @scala.inline
  implicit class PortProbeDetailOps[Self <: PortProbeDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

