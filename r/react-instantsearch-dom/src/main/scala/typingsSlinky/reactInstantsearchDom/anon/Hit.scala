package typingsSlinky.reactInstantsearchDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hit[T] extends js.Object {
  var hit: typingsSlinky.reactInstantsearchCore.mod.Hit[T] = js.native
}

object Hit {
  @scala.inline
  def apply[T](hit: typingsSlinky.reactInstantsearchCore.mod.Hit[T]): Hit[T] = {
    val __obj = js.Dynamic.literal(hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit[T]]
  }
  @scala.inline
  implicit class HitOps[Self[t] <: Hit[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHit(value: typingsSlinky.reactInstantsearchCore.mod.Hit[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

