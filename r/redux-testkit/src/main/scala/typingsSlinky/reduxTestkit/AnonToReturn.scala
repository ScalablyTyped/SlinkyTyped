package typingsSlinky.reduxTestkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit = js.native
}

object AnonToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): AnonToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
    __obj.asInstanceOf[AnonToReturn]
  }
  @scala.inline
  implicit class AnonToReturnOps[Self <: AnonToReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToReturn(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toReturn")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

