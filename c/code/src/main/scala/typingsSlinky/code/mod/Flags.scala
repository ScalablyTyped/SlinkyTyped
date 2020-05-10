package typingsSlinky.code.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flags[T] extends js.Object {
  /** Inverses the expected result of any assertion */
  var not: AssertionChain[T] = js.native
  /**
    * Requires that inclusion matches appear only once in the provided value.
    * Used by include().
    */
  var once: AssertionChain[T] = js.native
  /**
    * Requires that only the provided elements appear in the provided value.
    * Used by include().
    */
  var only: AssertionChain[T] = js.native
  /**
    * Allows a partial match when asserting inclusion
    * Used by include(). Defaults to false.
    */
  var part: AssertionChain[T] = js.native
  /**
    * Performs a comparison using strict equality (===).
    * Code defaults to deep comparison. Used by equal() and include().
    */
  var shallow: AssertionChain[T] = js.native
}

object Flags {
  @scala.inline
  def apply[T](
    not: AssertionChain[T],
    once: AssertionChain[T],
    only: AssertionChain[T],
    part: AssertionChain[T],
    shallow: AssertionChain[T]
  ): Flags[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags[T]]
  }
  @scala.inline
  implicit class FlagsOps[Self[t] <: Flags[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNot(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnce(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPart(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShallow(value: AssertionChain[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shallow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

