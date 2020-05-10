package typingsSlinky.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChain[T] extends js.Object {
  def beginsWith(value: js.Any): T = js.native
  def between(value1: js.Any, value2: js.Any): T = js.native
  def eq(value: js.Any): T = js.native
  def equals(value: js.Any): T = js.native
  def exists(): T = js.native
  def gt(value: js.Any): T = js.native
  def gte(value: js.Any): T = js.native
  def lt(value: js.Any): T = js.native
  def lte(value: js.Any): T = js.native
  def `null`(): T = js.native
}

object BaseChain {
  @scala.inline
  def apply[T](
    beginsWith: js.Any => T,
    between: (js.Any, js.Any) => T,
    eq: js.Any => T,
    equals: js.Any => T,
    exists: () => T,
    gt: js.Any => T,
    gte: js.Any => T,
    lt: js.Any => T,
    lte: js.Any => T,
    `null`: () => T
  ): BaseChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), eq = js.Any.fromFunction1(eq), equals = js.Any.fromFunction1(equals), exists = js.Any.fromFunction0(exists), gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.asInstanceOf[BaseChain[T]]
  }
  @scala.inline
  implicit class BaseChainOps[Self[t] <: BaseChain[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBeginsWith(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginsWith")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBetween(value: (js.Any, js.Any) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("between")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEq(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExists(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGt(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGte(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLt(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLte(value: js.Any => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNull(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

