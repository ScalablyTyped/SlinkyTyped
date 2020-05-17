package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.device__
import typingsSlinky.chromeApps.chromeAppsStrings.endpoint_
import typingsSlinky.chromeApps.chromeAppsStrings.interface_
import typingsSlinky.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DEVICE extends js.Object {
  var DEVICE: device__ = js.native
  var ENDPOINT: endpoint_ = js.native
  var INTERFACE: interface_ = js.native
  var OTHER: other_ = js.native
}

object DEVICE {
  @scala.inline
  def apply(DEVICE: device__, ENDPOINT: endpoint_, INTERFACE: interface_, OTHER: other_): DEVICE = {
    val __obj = js.Dynamic.literal(DEVICE = DEVICE.asInstanceOf[js.Any], ENDPOINT = ENDPOINT.asInstanceOf[js.Any], INTERFACE = INTERFACE.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEVICE]
  }
  @scala.inline
  implicit class DEVICEOps[Self <: DEVICE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEVICE(value: device__): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEVICE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENDPOINT(value: endpoint_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENDPOINT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTERFACE(value: interface_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTERFACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOTHER(value: other_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OTHER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

