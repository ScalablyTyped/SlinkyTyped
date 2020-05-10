package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilterRuleDestinationPortRange extends js.Object {
  /**
    * Starting port of the range
    */
  var fromPort: js.UndefOr[Double] = js.native
  /**
    * Ending port of the range
    */
  var toPort: js.UndefOr[Double] = js.native
}

object TrafficMirrorFilterRuleDestinationPortRange {
  @scala.inline
  def apply(): TrafficMirrorFilterRuleDestinationPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilterRuleDestinationPortRange]
  }
  @scala.inline
  implicit class TrafficMirrorFilterRuleDestinationPortRangeOps[Self <: TrafficMirrorFilterRuleDestinationPortRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromPort")(js.undefined)
        ret
    }
    @scala.inline
    def withToPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toPort")(js.undefined)
        ret
    }
  }
  
}

