package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the network profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The description of the network profile.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var downlinkBandwidthBits: js.UndefOr[Long] = js.native
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var downlinkDelayMs: js.UndefOr[Long] = js.native
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var downlinkJitterMs: js.UndefOr[Long] = js.native
  /**
    * Proportion of received packets that fail to arrive from 0 to 100 percent.
    */
  var downlinkLossPercent: js.UndefOr[PercentInteger] = js.native
  /**
    * The name of the network profile.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of network profile. Valid values are listed here.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.native
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var uplinkBandwidthBits: js.UndefOr[Long] = js.native
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var uplinkDelayMs: js.UndefOr[Long] = js.native
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var uplinkJitterMs: js.UndefOr[Long] = js.native
  /**
    * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
    */
  var uplinkLossPercent: js.UndefOr[PercentInteger] = js.native
}

object NetworkProfile {
  @scala.inline
  def apply(): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkProfile]
  }
  @scala.inline
  implicit class NetworkProfileOps[Self <: NetworkProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDownlinkBandwidthBits(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkBandwidthBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlinkBandwidthBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkBandwidthBits")(js.undefined)
        ret
    }
    @scala.inline
    def withDownlinkDelayMs(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlinkDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withDownlinkJitterMs(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkJitterMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlinkJitterMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkJitterMs")(js.undefined)
        ret
    }
    @scala.inline
    def withDownlinkLossPercent(value: PercentInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkLossPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownlinkLossPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downlinkLossPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: NetworkProfileType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkBandwidthBits(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkBandwidthBits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkBandwidthBits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkBandwidthBits")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkDelayMs(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkDelayMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkDelayMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkDelayMs")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkJitterMs(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkJitterMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkJitterMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkJitterMs")(js.undefined)
        ret
    }
    @scala.inline
    def withUplinkLossPercent(value: PercentInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkLossPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUplinkLossPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uplinkLossPercent")(js.undefined)
        ret
    }
  }
  
}

