package typingsSlinky.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInput extends js.Object {
  def input(): Unit = js.native
  def reset(): Unit = js.native
}

object AnonInput {
  @scala.inline
  def apply(input: () => Unit, reset: () => Unit): AnonInput = {
    val __obj = js.Dynamic.literal(input = js.Any.fromFunction0(input), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[AnonInput]
  }
  @scala.inline
  implicit class AnonInputOps[Self <: AnonInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

