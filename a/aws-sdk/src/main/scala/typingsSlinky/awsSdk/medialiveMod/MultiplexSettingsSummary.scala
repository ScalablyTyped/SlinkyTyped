package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiplexSettingsSummary extends js.Object {
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: js.UndefOr[integerMin1000000Max100000000] = js.native
}

object MultiplexSettingsSummary {
  @scala.inline
  def apply(): MultiplexSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexSettingsSummary]
  }
  @scala.inline
  implicit class MultiplexSettingsSummaryOps[Self <: MultiplexSettingsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransportStreamBitrate(value: integerMin1000000Max100000000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportStreamBitrate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportStreamBitrate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TransportStreamBitrate")(js.undefined)
        ret
    }
  }
  
}

