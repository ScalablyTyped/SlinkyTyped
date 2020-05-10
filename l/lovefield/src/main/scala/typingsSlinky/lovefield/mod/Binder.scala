package typingsSlinky.lovefield.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binder extends js.Object {
  def getIndex(): Double = js.native
}

object Binder {
  @scala.inline
  def apply(getIndex: () => Double): Binder = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction0(getIndex))
    __obj.asInstanceOf[Binder]
  }
  @scala.inline
  implicit class BinderOps[Self <: Binder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

