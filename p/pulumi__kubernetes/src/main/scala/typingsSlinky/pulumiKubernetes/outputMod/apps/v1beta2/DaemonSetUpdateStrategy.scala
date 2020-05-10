package typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta2

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
  val rollingUpdate: RollingUpdateDaemonSet = js.native
  /**
    * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
    */
  val `type`: String = js.native
}

object DaemonSetUpdateStrategy {
  @scala.inline
  def apply(rollingUpdate: RollingUpdateDaemonSet, `type`: String): DaemonSetUpdateStrategy = {
    val __obj = js.Dynamic.literal(rollingUpdate = rollingUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaemonSetUpdateStrategy]
  }
  @scala.inline
  implicit class DaemonSetUpdateStrategyOps[Self <: DaemonSetUpdateStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRollingUpdate(value: RollingUpdateDaemonSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollingUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

