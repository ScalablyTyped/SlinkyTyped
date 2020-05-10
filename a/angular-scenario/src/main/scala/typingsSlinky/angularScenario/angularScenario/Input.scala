package typingsSlinky.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  def check(): js.Any = js.native
  def enter(value: js.Any): js.Any = js.native
  def select(radioButtonValue: js.Any): js.Any = js.native
  def `val`(): Future = js.native
}

object Input {
  @scala.inline
  def apply(check: () => js.Any, enter: js.Any => js.Any, select: js.Any => js.Any, `val`: () => Future): Input = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction0(check), enter = js.Any.fromFunction1(enter), select = js.Any.fromFunction1(select))
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnter(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelect(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVal(value: () => Future): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("val")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

