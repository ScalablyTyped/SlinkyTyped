package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedBandwidth extends js.Object {
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var ProvisionTime: js.UndefOr[js.Date] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Provisioned: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var RequestTime: js.UndefOr[js.Date] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Requested: js.UndefOr[String] = js.native
  /**
    * Reserved. If you need to sustain traffic greater than the documented limits, contact us through the Support Center.
    */
  var Status: js.UndefOr[String] = js.native
}

object ProvisionedBandwidth {
  @scala.inline
  def apply(): ProvisionedBandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedBandwidth]
  }
  @scala.inline
  implicit class ProvisionedBandwidthOps[Self <: ProvisionedBandwidth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvisionTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisioned(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provisioned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Provisioned")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequested(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Requested")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

