package typingsSlinky.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalableTargetAction extends js.Object {
  /**
    * The maximum capacity.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.native
  /**
    * The minimum capacity.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.native
}

object ScalableTargetAction {
  @scala.inline
  def apply(): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalableTargetAction]
  }
  @scala.inline
  implicit class ScalableTargetActionOps[Self <: ScalableTargetAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxCapacity(value: ResourceCapacity): Self = {
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
    def withMinCapacity(value: ResourceCapacity): Self = {
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
  }
  
}

