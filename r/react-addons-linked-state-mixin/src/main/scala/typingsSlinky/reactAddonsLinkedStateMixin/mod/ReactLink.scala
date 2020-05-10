package typingsSlinky.reactAddonsLinkedStateMixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactLink[T] extends js.Object {
  var value: T = js.native
  def requestChange(newValue: T): Unit = js.native
}

object ReactLink {
  @scala.inline
  def apply[T](requestChange: T => Unit, value: T): ReactLink[T] = {
    val __obj = js.Dynamic.literal(requestChange = js.Any.fromFunction1(requestChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactLink[T]]
  }
  @scala.inline
  implicit class ReactLinkOps[Self[t] <: ReactLink[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRequestChange(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

