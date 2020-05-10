package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBasedAutoScalingConfiguration extends js.Object {
  /**
    * An AutoScalingThresholds object that describes the downscaling configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  /**
    * Whether load-based auto scaling is enabled for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * An AutoScalingThresholds object that describes the upscaling configuration, which defines how and when AWS OpsWorks Stacks increases the number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}

object LoadBasedAutoScalingConfiguration {
  @scala.inline
  def apply(): LoadBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBasedAutoScalingConfiguration]
  }
  @scala.inline
  implicit class LoadBasedAutoScalingConfigurationOps[Self <: LoadBasedAutoScalingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLayerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerId")(js.undefined)
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

