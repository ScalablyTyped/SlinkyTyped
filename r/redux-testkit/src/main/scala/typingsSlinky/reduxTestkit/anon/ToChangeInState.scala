package typingsSlinky.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToChangeInState extends js.Object {
  def toChangeInState(expectedChanges: js.Any): Unit = js.native
  def toReturnState(expected: js.Any): Unit = js.native
  def toStayTheSame(): Unit = js.native
}

object ToChangeInState {
  @scala.inline
  def apply(toChangeInState: js.Any => Unit, toReturnState: js.Any => Unit, toStayTheSame: () => Unit): ToChangeInState = {
    val __obj = js.Dynamic.literal(toChangeInState = js.Any.fromFunction1(toChangeInState), toReturnState = js.Any.fromFunction1(toReturnState), toStayTheSame = js.Any.fromFunction0(toStayTheSame))
    __obj.asInstanceOf[ToChangeInState]
  }
  @scala.inline
  implicit class ToChangeInStateOps[Self <: ToChangeInState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToChangeInState(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toChangeInState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToReturnState(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toReturnState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToStayTheSame(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toStayTheSame")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

