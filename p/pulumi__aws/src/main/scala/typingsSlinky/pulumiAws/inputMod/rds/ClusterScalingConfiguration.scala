package typingsSlinky.pulumiAws.inputMod.rds

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterScalingConfiguration extends js.Object {
  /**
    * Whether to enable automatic pause. A DB cluster can be paused only when it's idle (it has no connections). If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a snapshot. In this case, the DB cluster is restored when there is a request to connect to it. Defaults to `true`.
    */
  var autoPause: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum capacity. The maximum capacity must be greater than or equal to the minimum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `16`.
    */
  var maxCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum capacity. The minimum capacity must be lesser than or equal to the maximum capacity. Valid capacity values are `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, and `256`. Defaults to `2`.
    */
  var minCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The time, in seconds, before an Aurora DB cluster in serverless mode is paused. Valid values are `300` through `86400`. Defaults to `300`.
    */
  var secondsUntilAutoPause: js.UndefOr[Input[Double]] = js.native
  /**
    * The action to take when the timeout is reached. Valid values: `ForceApplyCapacityChange`, `RollbackCapacityChange`. Defaults to `RollbackCapacityChange`. See [documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.timeout-action).
    */
  var timeoutAction: js.UndefOr[Input[String]] = js.native
}

object ClusterScalingConfiguration {
  @scala.inline
  def apply(): ClusterScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterScalingConfiguration]
  }
  @scala.inline
  implicit class ClusterScalingConfigurationOps[Self <: ClusterScalingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPause(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsUntilAutoPause(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsUntilAutoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsUntilAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondsUntilAutoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutAction")(js.undefined)
        ret
    }
  }
  
}

