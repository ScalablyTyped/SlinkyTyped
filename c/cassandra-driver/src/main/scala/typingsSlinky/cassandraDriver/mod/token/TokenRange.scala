package typingsSlinky.cassandraDriver.mod.token

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenRange extends js.Object {
  var end: Token = js.native
  var start: Token = js.native
  def compare(other: TokenRange): Double = js.native
  def contains(token: Token): Boolean = js.native
  def equals(other: TokenRange): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isWrappedAround(): Boolean = js.native
  def splitEvenly(numberOfSplits: Double): js.Array[TokenRange] = js.native
  def unwrap(): js.Array[TokenRange] = js.native
}

object TokenRange {
  @scala.inline
  def apply(
    compare: TokenRange => Double,
    contains: Token => Boolean,
    end: Token,
    equals: TokenRange => Boolean,
    isEmpty: () => Boolean,
    isWrappedAround: () => Boolean,
    splitEvenly: Double => js.Array[TokenRange],
    start: Token,
    unwrap: () => js.Array[TokenRange]
  ): TokenRange = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction1(compare), contains = js.Any.fromFunction1(contains), end = end.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), isEmpty = js.Any.fromFunction0(isEmpty), isWrappedAround = js.Any.fromFunction0(isWrappedAround), splitEvenly = js.Any.fromFunction1(splitEvenly), start = start.asInstanceOf[js.Any], unwrap = js.Any.fromFunction0(unwrap))
    __obj.asInstanceOf[TokenRange]
  }
  @scala.inline
  implicit class TokenRangeOps[Self <: TokenRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompare(value: TokenRange => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContains(value: Token => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: TokenRange => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsWrappedAround(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWrappedAround")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSplitEvenly(value: Double => js.Array[TokenRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitEvenly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnwrap(value: () => js.Array[TokenRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrap")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

