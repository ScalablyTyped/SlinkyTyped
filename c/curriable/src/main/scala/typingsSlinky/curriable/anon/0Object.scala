package typingsSlinky.curriable.anon

import typingsSlinky.curriable.mod.Cast
import typingsSlinky.curriable.mod.Concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0Object`[TN /* <: js.Array[_] */, I /* <: js.Array[_] */, T2 /* <: js.Array[_] */] extends js.Object {
  var `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object = js.native
  var `1`: Concat[TN, Cast[_, js.Array[_]]] = js.native
}

object `0Object` {
  @scala.inline
  def apply[TN, I, T2](
    `0`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object,
    `1`: Concat[TN, Cast[_, js.Array[_]]]
  ): `0Object`[TN, I, T2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Object`[TN, I, T2]]
  }
  @scala.inline
  implicit class `0ObjectOps`[Self[tn, i, t2] <: `0Object`[tn, i, t2], TN, I, T2] (val x: Self[TN, I, T2]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TN, I, T2] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TN, I, T2]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TN, I, T2]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TN, I, T2]) with Other]
    @scala.inline
    def with0(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias curriable.curriable.GapsOf<T1, T2, curriable.curriable.GapOf<T1, T2, TN, I> extends infer G ? curriable.curriable.Cast<G, std.Array<any>> : never, curriable.curriable.Next<I>> */ js.Object
    ): Self[TN, I, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1(value: Concat[TN, Cast[_, js.Array[_]]]): Self[TN, I, T2] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

