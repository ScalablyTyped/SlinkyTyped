package typingsSlinky.ckeditorCkeditor5Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindChain extends js.Object {
  def to(observable: Observable, bindProperties: (Observable | String | js.Function)*): Unit = js.native
  def toMany(observable: js.Array[Observable], bindProperties: (Observable | String | js.Function)*): Unit = js.native
}

object BindChain {
  @scala.inline
  def apply(
    to: (Observable, /* repeated */ Observable | String | js.Function) => Unit,
    toMany: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Unit
  ): BindChain = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction2(to), toMany = js.Any.fromFunction2(toMany))
    __obj.asInstanceOf[BindChain]
  }
  @scala.inline
  implicit class BindChainOps[Self <: BindChain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTo(value: (Observable, /* repeated */ Observable | String | js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToMany(value: (js.Array[Observable], /* repeated */ Observable | String | js.Function) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toMany")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

