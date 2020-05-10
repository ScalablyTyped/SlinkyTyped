package typingsSlinky.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUnwatch extends js.Object {
  def unwatch(): Unit = js.native
}

object AnonUnwatch {
  @scala.inline
  def apply(unwatch: () => Unit): AnonUnwatch = {
    val __obj = js.Dynamic.literal(unwatch = js.Any.fromFunction0(unwatch))
    __obj.asInstanceOf[AnonUnwatch]
  }
  @scala.inline
  implicit class AnonUnwatchOps[Self <: AnonUnwatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnwatch(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwatch")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

