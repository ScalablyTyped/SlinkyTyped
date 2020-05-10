package typingsSlinky.pulumiKubernetes.inputMod.apps.v1beta2

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
  */
@js.native
trait DaemonSetUpdateStrategy extends js.Object {
  /**
    * Rolling update config params. Present only if type = "RollingUpdate".
    */
  var rollingUpdate: js.UndefOr[Input[RollingUpdateDaemonSet]] = js.native
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object DaemonSetUpdateStrategy {
  @scala.inline
  def apply(): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
  @scala.inline
  implicit class DaemonSetUpdateStrategyOps[Self <: DaemonSetUpdateStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: Input[RollingUpdateDaemonSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRollingUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
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
  }
  
}

