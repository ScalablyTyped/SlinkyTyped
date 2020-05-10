package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPNProperties[M /* <: ManagedObject */, B, S] extends js.Object {
  /** Whether the VPN network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.native
  /** The VPN host. */
  var Host: js.UndefOr[S] = js.native
  /**
    * The VPN type.
    * This cannot be an enum because of 'L2TP-IPSec'.
    * This is optional for NetworkConfigProperties which is passed to
    * *setProperties* which may be used to set only specific properties.
    */
  var Type: js.UndefOr[S] = js.native
}

object VPNProperties {
  @scala.inline
  def apply[M, B, S](): VPNProperties[M, B, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VPNProperties[M, B, S]]
  }
  @scala.inline
  implicit class VPNPropertiesOps[Self[m, b, s] <: VPNProperties[m, b, s], M, B, S] (val x: Self[M, B, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, B, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, B, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, B, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, B, S]) with Other]
    @scala.inline
    def withAutoConnect(value: B): Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: S): Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: S): Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[M, B, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

