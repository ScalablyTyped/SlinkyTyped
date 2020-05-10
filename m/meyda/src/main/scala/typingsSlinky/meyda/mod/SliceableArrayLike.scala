package typingsSlinky.meyda.mod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceableArrayLike[T] extends ArrayLike[T] {
  def slice(start: Double, end: Double): SliceableArrayLike[T] = js.native
}

object SliceableArrayLike {
  @scala.inline
  def apply[T](length: Double, slice: (Double, Double) => SliceableArrayLike[T]): SliceableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
    __obj.asInstanceOf[SliceableArrayLike[T]]
  }
  @scala.inline
  implicit class SliceableArrayLikeOps[Self[t] <: SliceableArrayLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSlice(value: (Double, Double) => SliceableArrayLike[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

