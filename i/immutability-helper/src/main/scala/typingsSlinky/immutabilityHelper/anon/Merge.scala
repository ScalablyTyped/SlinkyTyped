package typingsSlinky.immutabilityHelper.anon

import typingsSlinky.immutabilityHelper.mod.ObjectSpec
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Merge[T]
  extends ObjectSpec[T, js.Any] {
  @JSName("$merge")
  var $merge: Partial[T] = js.native
}

object Merge {
  @scala.inline
  def apply[T]($merge: Partial[T]): Merge[T] = {
    val __obj = js.Dynamic.literal($merge = $merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Merge[T]]
  }
  @scala.inline
  implicit class MergeOps[Self[t] <: Merge[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$merge(value: Partial[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$merge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

