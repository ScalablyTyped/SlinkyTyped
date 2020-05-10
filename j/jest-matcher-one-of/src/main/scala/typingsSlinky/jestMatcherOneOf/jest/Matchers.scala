package typingsSlinky.jestMatcherOneOf.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers[R, T] extends js.Object {
  def toBeOneOf(expected: js.Array[_]): R = js.native
}

object Matchers {
  @scala.inline
  def apply[R, T](toBeOneOf: js.Array[_] => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toBeOneOf = js.Any.fromFunction1(toBeOneOf))
    __obj.asInstanceOf[Matchers[R, T]]
  }
  @scala.inline
  implicit class MatchersOps[Self[r, t] <: Matchers[r, t], R, T] (val x: Self[R, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[R, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[R, T]) with Other]
    @scala.inline
    def withToBeOneOf(value: js.Array[_] => R): Self[R, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBeOneOf")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

