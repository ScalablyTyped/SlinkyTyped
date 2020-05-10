package typingsSlinky.fridaGum.Java

import typingsSlinky.fridaGum.EnumerateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseCallbacks extends js.Object {
  /**
    * Called when all instances have been enumerated.
    */
  def onComplete(): Unit = js.native
  /**
    * Called with each live instance found with a ready-to-use `instance`
    * just as if you would have called `Java.cast()` with a raw handle to
    * this particular instance.
    *
    * May return `EnumerateAction.Stop` to stop the enumeration early.
    */
  def onMatch(instance: typingsSlinky.fridaGum.Wrapper): Unit | EnumerateAction = js.native
}

object ChooseCallbacks {
  @scala.inline
  def apply(onComplete: () => Unit, onMatch: typingsSlinky.fridaGum.Wrapper => Unit | EnumerateAction): ChooseCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[ChooseCallbacks]
  }
  @scala.inline
  implicit class ChooseCallbacksOps[Self <: ChooseCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnMatch(value: typingsSlinky.fridaGum.Wrapper => Unit | EnumerateAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

