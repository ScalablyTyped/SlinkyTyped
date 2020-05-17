package typingsSlinky.colorNamer.anon

import typingsSlinky.colorNamer.mod.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pick[T /* <: Palette */] extends js.Object {
  var pick: js.Array[T] = js.native
}

object Pick {
  @scala.inline
  def apply[T](pick: js.Array[T]): Pick[T] = {
    val __obj = js.Dynamic.literal(pick = pick.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pick[T]]
  }
  @scala.inline
  implicit class PickOps[Self[t] <: Pick[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withPick(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pick")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

