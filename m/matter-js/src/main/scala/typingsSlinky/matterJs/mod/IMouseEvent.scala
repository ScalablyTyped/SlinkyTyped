package typingsSlinky.matterJs.mod

import typingsSlinky.matterJs.matterJsStrings.mousedown
import typingsSlinky.matterJs.matterJsStrings.mousemove
import typingsSlinky.matterJs.matterJsStrings.mouseup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseEvent[T] extends IEvent[T] {
  @JSName("name")
  var name_IMouseEvent: mousedown | mousemove | mouseup = js.native
}

object IMouseEvent {
  @scala.inline
  def apply[T](name: mousedown | mousemove | mouseup, source: T): IMouseEvent[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEvent[T]]
  }
  @scala.inline
  implicit class IMouseEventOps[Self[t] <: IMouseEvent[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withName(value: mousedown | mousemove | mouseup): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

