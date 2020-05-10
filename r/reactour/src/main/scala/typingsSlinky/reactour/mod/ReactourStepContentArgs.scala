package typingsSlinky.reactour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourStepContentArgs extends js.Object {
  var inDOM: Boolean = js.native
  var step: Double = js.native
  def close(): Unit = js.native
  def goTo(step: Double): Unit = js.native
}

object ReactourStepContentArgs {
  @scala.inline
  def apply(close: () => Unit, goTo: Double => Unit, inDOM: Boolean, step: Double): ReactourStepContentArgs = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), goTo = js.Any.fromFunction1(goTo), inDOM = inDOM.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourStepContentArgs]
  }
  @scala.inline
  implicit class ReactourStepContentArgsOps[Self <: ReactourStepContentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGoTo(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

