package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiMAXProperties[M /* <: ManagedObject */, B] extends js.Object {
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.native
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.native
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.native
}

object WiMAXProperties {
  @scala.inline
  def apply[M, B](): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
  @scala.inline
  implicit class WiMAXPropertiesOps[Self[m, b] <: WiMAXProperties[m, b], M, B] (val x: Self[M, B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[M, B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[M, B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[M, B]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[M, B]) with Other]
    @scala.inline
    def withAutoConnect(value: B): Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoConnect: Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withEAP(value: EAPProperties): Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEAP: Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EAP")(js.undefined)
        ret
    }
    @scala.inline
    def withSignalStrength(value: integer): Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignalStrength: Self[M, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignalStrength")(js.undefined)
        ret
    }
  }
  
}

