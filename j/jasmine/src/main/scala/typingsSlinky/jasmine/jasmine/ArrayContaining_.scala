package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayContaining_[T]
  extends AsymmetricMatcher[js.Any] {
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.native
}

object ArrayContaining_ {
  @scala.inline
  def apply[T](asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean): ArrayContaining_[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[ArrayContaining_[T]]
  }
  @scala.inline
  implicit class ArrayContaining_Ops[Self[t] <: ArrayContaining_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNew(value: /* sample */ ArrayLike[T] => ArrayLike[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNew: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.undefined)
        ret
    }
  }
  
}

