package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficRule extends js.Object {
  /** Bandwidth in kbits/second */
  var bandwidth: js.UndefOr[Double] = js.native
  /** Burst size in kbits */
  var burst: js.UndefOr[Double] = js.native
  /** Packet delay, must be >= 0 */
  var delay: js.UndefOr[String] = js.native
  /** Packet duplication ratio (0.0 - 1.0) */
  var packetDuplicationRatio: js.UndefOr[Double] = js.native
  /** Packet loss ratio (0.0 - 1.0) */
  var packetLossRatio: js.UndefOr[Double] = js.native
}

object TrafficRule {
  @scala.inline
  def apply(): TrafficRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficRule]
  }
  @scala.inline
  implicit class TrafficRuleOps[Self <: TrafficRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBandwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBandwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bandwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withBurst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(js.undefined)
        ret
    }
    @scala.inline
    def withDelay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketDuplicationRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetDuplicationRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketDuplicationRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetDuplicationRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withPacketLossRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLossRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacketLossRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packetLossRatio")(js.undefined)
        ret
    }
  }
  
}

