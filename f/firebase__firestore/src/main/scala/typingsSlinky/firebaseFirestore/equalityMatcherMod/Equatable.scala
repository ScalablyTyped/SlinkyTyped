package typingsSlinky.firebaseFirestore.equalityMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Equatable[T] extends js.Object {
  def isEqual(other: T): Boolean = js.native
}

object Equatable {
  @scala.inline
  def apply[T](isEqual: T => Boolean): Equatable[T] = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[Equatable[T]]
  }
  @scala.inline
  implicit class EquatableOps[Self[t] <: Equatable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsEqual(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEqual")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

