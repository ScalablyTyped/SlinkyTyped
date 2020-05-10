package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingConfigurationInfo extends js.Object {
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. When the value is set to false for an Aurora Serverless DB cluster, the DB cluster automatically resumes.
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.native
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.native
  /**
    * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.native
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.native
}

object ScalingConfigurationInfo {
  @scala.inline
  def apply(): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
  @scala.inline
  implicit class ScalingConfigurationInfoOps[Self <: ScalingConfigurationInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPause(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withMinCapacity(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondsUntilAutoPause(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondsUntilAutoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondsUntilAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecondsUntilAutoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutAction")(js.undefined)
        ret
    }
  }
  
}

