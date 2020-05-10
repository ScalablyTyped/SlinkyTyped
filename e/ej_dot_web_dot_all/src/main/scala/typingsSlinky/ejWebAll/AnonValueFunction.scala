package typingsSlinky.ejWebAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonValueFunction extends js.Object {
  def valueFunction(`val`: String): js.Any = js.native
}

object AnonValueFunction {
  @scala.inline
  def apply(valueFunction: String => js.Any): AnonValueFunction = {
    val __obj = js.Dynamic.literal(valueFunction = js.Any.fromFunction1(valueFunction))
    __obj.asInstanceOf[AnonValueFunction]
  }
  @scala.inline
  implicit class AnonValueFunctionOps[Self <: AnonValueFunction] (val x: Self) extends AnyVal {
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

