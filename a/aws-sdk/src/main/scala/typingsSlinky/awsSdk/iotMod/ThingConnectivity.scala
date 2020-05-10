package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingConnectivity extends js.Object {
  /**
    * True if the thing is connected to the AWS IoT service; false if it is not connected.
    */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been disconnected for more than a few weeks, the time value might be missing.
    */
  var timestamp: js.UndefOr[ConnectivityTimestamp] = js.native
}

object ThingConnectivity {
  @scala.inline
  def apply(): ThingConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingConnectivity]
  }
  @scala.inline
  implicit class ThingConnectivityOps[Self <: ThingConnectivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: ConnectivityTimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

