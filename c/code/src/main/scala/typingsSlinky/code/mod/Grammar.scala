package typingsSlinky.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grammar[T] extends js.Object {
  /** Connecting word. */
  var a: AssertionChain[T] = js.native
  /** Connecting word. */
  var an: AssertionChain[T] = js.native
  /** Connecting word. */
  var and: AssertionChain[T] = js.native
  /** Connecting word. */
  var at: AssertionChain[T] = js.native
  /** Connecting word. */
  var be: AssertionChain[T] = js.native
  /** Connecting word. */
  var have: AssertionChain[T] = js.native
  /** Connecting word. */
  var in: AssertionChain[T] = js.native
  /** Connecting word. */
  var to: AssertionChain[T] = js.native
}

object Grammar {
  @scala.inline
  def apply[T](
    a: AssertionChain[T],
    an: AssertionChain[T],
    and: AssertionChain[T],
    at: AssertionChain[T],
    be: AssertionChain[T],
    have: AssertionChain[T],
    in: AssertionChain[T],
    to: AssertionChain[T]
  ): Grammar[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], an = an.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grammar[T]]
  }
  @scala.inline
  implicit class GrammarOps[Self[t] <: Grammar[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withA(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAn(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("an")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnd(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAt(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBe(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("be")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHave(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("have")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIn(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

