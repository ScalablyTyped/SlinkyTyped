package typingsSlinky.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedChain[T] extends BaseChain[T] {
  def contains(value: js.Any): T = js.native
  def in(values: js.Array[_]): T = js.native
  def ne(value: js.Any): T = js.native
  def notContains(value: js.Any): T = js.native
}

object ExtendedChain {
  @scala.inline
  def apply[T](
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    contains: js.Any => T,
    eq: js.Any => T,
    equals: js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    in: js.Array[_] => T,
    lt: js.Any => T,
    lte: js.Any => T,
    ne: js.Any => T,
    notContains: js.Any => T,
    `null`: () => T
  ): ExtendedChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), contains = js.Any.fromFunction1(contains), eq = js.Any.fromFunction1(eq), equals = js.Any.fromFunction1(equals), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), in = js.Any.fromFunction1(in), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte), ne = js.Any.fromFunction1(ne), notContains = js.Any.fromFunction1(notContains))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[ExtendedChain[T]]
  }
  @scala.inline
  implicit class ExtendedChainOps[Self[t] <: ExtendedChain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withContains(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIn(value: js.Array[_] => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNe(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ne")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNotContains(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notContains")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

