package typingsSlinky.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headroom extends js.Object {
  def init(): Unit = js.native
}

object Headroom {
  @scala.inline
  def apply(init: () => Unit): Headroom = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[Headroom]
  }
  @scala.inline
  implicit class HeadroomOps[Self <: Headroom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

