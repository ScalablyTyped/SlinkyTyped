package typingsSlinky.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueFunction extends js.Object {
  def valueFunction(`val`: String): js.Any = js.native
}

object ValueFunction {
  @scala.inline
  def apply(valueFunction: String => js.Any): ValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[ValueFunction]
  }
  @scala.inline
  implicit class ValueFunctionOps[Self <: ValueFunction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValueFunction(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueFunction")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

