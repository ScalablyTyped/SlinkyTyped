package typingsSlinky.googleCloudStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback[T, U] extends js.Object {
  var callback: U = js.native
  var options: T = js.native
}

object Callback {
  @scala.inline
  def apply[T, U](callback: U, options: T): Callback[T, U] = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback[T, U]]
  }
  @scala.inline
  implicit class CallbackOps[Self[t, u] <: Callback[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withCallback(value: U): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: T): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

