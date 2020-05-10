package typingsSlinky.deepDiff.mod

import typingsSlinky.deepDiff.deepDiffStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffArray[LHS, RHS] extends Diff_[LHS, RHS] {
  var index: Double = js.native
  var item: Diff_[LHS, RHS] = js.native
  var kind: A = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
}

object DiffArray {
  @scala.inline
  def apply[LHS, RHS](index: Double, item: Diff_[LHS, RHS], kind: A): DiffArray[LHS, RHS] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffArray[LHS, RHS]]
  }
  @scala.inline
  implicit class DiffArrayOps[Self[lhs, rhs] <: DiffArray[lhs, rhs], LHS, RHS] (val x: Self[LHS, RHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[LHS, RHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[LHS, RHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[LHS, RHS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[LHS, RHS]) with Other]
    @scala.inline
    def withIndex(value: Double): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: Diff_[LHS, RHS]): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: A): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[_]): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

