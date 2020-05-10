package typingsSlinky.relayCompiler.irvisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterLeave[T] extends js.Object {
  val enter: js.UndefOr[T] = js.native
  val leave: js.UndefOr[T] = js.native
}

object EnterLeave {
  @scala.inline
  def apply[T](): EnterLeave[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterLeave[T]]
  }
  @scala.inline
  implicit class EnterLeaveOps[Self[t] <: EnterLeave[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEnter(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeave(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeave: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leave")(js.undefined)
        ret
    }
  }
  
}

