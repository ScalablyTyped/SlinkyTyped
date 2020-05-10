package typingsSlinky.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroupConfiguration extends js.Object {
  /**
    * The desired capacity, or number of instances, for the Auto Scaling group.
    */
  var desiredCapacity: js.UndefOr[DesiredCapacity] = js.native
  /**
    * The instance type for the Auto Scaling group.
    */
  var instanceType: js.UndefOr[InstanceType] = js.native
  /**
    * The maximum size, or maximum number of instances, for the Auto Scaling group.
    */
  var maxSize: js.UndefOr[MaxSize] = js.native
  /**
    * The minimum size, or minimum number of instances, for the Auto Scaling group.
    */
  var minSize: js.UndefOr[MinSize] = js.native
}

object AutoScalingGroupConfiguration {
  @scala.inline
  def apply(): AutoScalingGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupConfiguration]
  }
  @scala.inline
  implicit class AutoScalingGroupConfigurationOps[Self <: AutoScalingGroupConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesiredCapacity(value: DesiredCapacity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesiredCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desiredCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: InstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSize(value: MaxSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: MinSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
  }
  
}

