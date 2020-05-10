package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBasedAutoScalingRequest extends js.Object {
  /**
    * An AutoScalingThresholds object with the downscaling threshold configuration. If the load falls below these thresholds for a specified amount of time, AWS OpsWorks Stacks stops a specified number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  /**
    * Enables load-based auto scaling for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: String = js.native
  /**
    * An AutoScalingThresholds object with the upscaling threshold configuration. If the load exceeds these thresholds for a specified amount of time, AWS OpsWorks Stacks starts a specified number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}

object SetLoadBasedAutoScalingRequest {
  @scala.inline
  def apply(LayerId: String): SetLoadBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(LayerId = LayerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBasedAutoScalingRequest]
  }
  @scala.inline
  implicit class SetLoadBasedAutoScalingRequestOps[Self <: SetLoadBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownScaling(value: AutoScalingThresholds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DownScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(js.undefined)
        ret
    }
    @scala.inline
    def withUpScaling(value: AutoScalingThresholds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpScaling")(js.undefined)
        ret
    }
  }
  
}

