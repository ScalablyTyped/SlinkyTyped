package typingsSlinky.reactOnclickoutside.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleClickOutside[T] extends js.Object {
  var handleClickOutside: MouseEventHandler[T] = js.native
}

object HandleClickOutside {
  @scala.inline
  def apply[T](handleClickOutside: SyntheticMouseEvent[T] => Unit): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
  @scala.inline
  implicit class HandleClickOutsideOps[Self[t] <: HandleClickOutside[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHandleClickOutside(value: SyntheticMouseEvent[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClickOutside")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

