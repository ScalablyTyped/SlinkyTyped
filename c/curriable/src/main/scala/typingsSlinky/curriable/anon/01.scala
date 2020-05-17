package typingsSlinky.curriable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `01`[R /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object = js.native
  var `1`: R = js.native
}

object `01` {
  @scala.inline
  def apply[R](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object,
    `1`: R
  ): `01`[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`01`[R]]
  }
  @scala.inline
  implicit class `01Ops`[Self[r] <: `01`[r], R] (val x: Self[R]) extends AnyVal {
    @scala.inline
    def duplicate: Self[R] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[R]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[R] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[R] with Other]
    @scala.inline
    def with0(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.Reverse<T, curriable.curriable.Prepend<T[curriable.curriable.Pos<I>], R>, curriable.curriable.Next<I>> */ js.Object
    ): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1(value: R): Self[R] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

