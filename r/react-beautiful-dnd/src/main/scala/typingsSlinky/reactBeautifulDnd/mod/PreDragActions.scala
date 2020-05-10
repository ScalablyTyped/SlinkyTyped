package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreDragActions extends js.Object {
  // cancel the pre drag without starting a drag. Releases the lock
  def abort(): Unit = js.native
  // lift the current item
  def fluidLift(clientSelection: Position): FluidDragActions = js.native
  // discover if the lock is still active
  def isActive(): Boolean = js.native
  // whether it has been indicated if force press should be respected
  def shouldRespectForcePress(): Boolean = js.native
  def snapLift(): SnapDragActions = js.native
}

object PreDragActions {
  @scala.inline
  def apply(
    abort: () => Unit,
    fluidLift: Position => FluidDragActions,
    isActive: () => Boolean,
    shouldRespectForcePress: () => Boolean,
    snapLift: () => SnapDragActions
  ): PreDragActions = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), fluidLift = js.Any.fromFunction1(fluidLift), isActive = js.Any.fromFunction0(isActive), shouldRespectForcePress = js.Any.fromFunction0(shouldRespectForcePress), snapLift = js.Any.fromFunction0(snapLift))
    __obj.asInstanceOf[PreDragActions]
  }
  @scala.inline
  implicit class PreDragActionsOps[Self <: PreDragActions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFluidLift(value: Position => FluidDragActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidLift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShouldRespectForcePress(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRespectForcePress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSnapLift(value: () => SnapDragActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapLift")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

