package typingsSlinky.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthernetProperties[M /* <: ManagedObject */] extends js.Object {
  /** The authentication used by the Ethernet network. Possible values are None and 8021X. */
  var Authentication: js.UndefOr[EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]] = js.native
  /** Whether the Ethernet network should be connected automatically. */
  var AutoConnect: js.UndefOr[Boolean | ManagedBoolean] = js.native
  /** Network's EAP settings. Required for 8021X authentication. */
  var EAP: js.UndefOr[EAPProperties] = js.native
}

object EthernetProperties {
  @scala.inline
  def apply[M](): EthernetProperties[M] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EthernetProperties[M]]
  }
  @scala.inline
  implicit class EthernetPropertiesOps[Self[m] <: EthernetProperties[m], M] (val x: Self[M]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[M] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[M] with Other]
    @scala.inline
    def withAuthentication(value: EthernetAuthenticationType | ManagedType[EthernetAuthenticationType]): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthentication: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoConnect(value: Boolean | ManagedBoolean): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withEAP(value: EAPProperties): Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEAP: Self[M] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(js.undefined)
        ret
    }
  }
  
}

