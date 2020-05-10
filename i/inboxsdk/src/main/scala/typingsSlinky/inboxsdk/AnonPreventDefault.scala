package typingsSlinky.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPreventDefault extends js.Object {
  def preventDefault(): Unit = js.native
}

object AnonPreventDefault {
  @scala.inline
  def apply(preventDefault: () => Unit): AnonPreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[AnonPreventDefault]
  }
  @scala.inline
  implicit class AnonPreventDefaultOps[Self <: AnonPreventDefault] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

