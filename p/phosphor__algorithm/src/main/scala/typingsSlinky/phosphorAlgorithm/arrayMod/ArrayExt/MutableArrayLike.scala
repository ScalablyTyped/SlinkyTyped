package typingsSlinky.phosphorAlgorithm.arrayMod.ArrayExt

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array-like object which supports item assignment.
  */
@js.native
trait MutableArrayLike[T] extends /* index */ NumberDictionary[T] {
  val length: Double = js.native
}

object MutableArrayLike {
  @scala.inline
  def apply[T](length: Double): MutableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableArrayLike[T]]
  }
  @scala.inline
  implicit class MutableArrayLikeOps[Self[t] <: MutableArrayLike[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLength(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

