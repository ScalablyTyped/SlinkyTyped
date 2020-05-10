package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionMixin extends js.Object {
  def clearInteractionHandle(clearHandle: Double): Unit = js.native
  def createInteractionHandle(): Double = js.native
  /**
    * Schedule work for after all interactions have completed.
    *
    */
  def runAfterInteractions(callback: js.Function0[_]): Unit = js.native
}

object InteractionMixin {
  @scala.inline
  def apply(
    clearInteractionHandle: Double => Unit,
    createInteractionHandle: () => Double,
    runAfterInteractions: js.Function0[_] => Unit
  ): InteractionMixin = {
    val __obj = js.Dynamic.literal(clearInteractionHandle = js.Any.fromFunction1(clearInteractionHandle), createInteractionHandle = js.Any.fromFunction0(createInteractionHandle), runAfterInteractions = js.Any.fromFunction1(runAfterInteractions))
    __obj.asInstanceOf[InteractionMixin]
  }
  @scala.inline
  implicit class InteractionMixinOps[Self <: InteractionMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearInteractionHandle(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInteractionHandle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateInteractionHandle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInteractionHandle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRunAfterInteractions(value: js.Function0[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runAfterInteractions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

