package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ArraySpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Push[T]
  extends ArraySpec[T, js.Any] {
  @JSName("$push")
  var $push: js.Array[T] = js.native
}

object Push {
  @scala.inline
  def apply[T]($push: js.Array[T]): Push[T] = {
    val __obj = js.Dynamic.literal($push = $push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Push[T]]
  }
  @scala.inline
  implicit class PushOps[Self[t] <: Push[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$push(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$push")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

