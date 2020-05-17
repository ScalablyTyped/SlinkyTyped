package typingsSlinky.reduxTestkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToReturn extends js.Object {
  def toReturn(expected: js.Any): Unit = js.native
}

object ToReturn {
  @scala.inline
  def apply(toReturn: js.Any => Unit): ToReturn = {
    val __obj = js.Dynamic.literal(toReturn = js.Any.fromFunction1(toReturn))
    __obj.asInstanceOf[ToReturn]
  }
  @scala.inline
  implicit class ToReturnOps[Self <: ToReturn] (val x: Self) extends AnyVal {
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

