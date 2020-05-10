package typingsSlinky.deepDiff.mod

import typingsSlinky.deepDiff.deepDiffStrings.E
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffEdit[LHS, RHS] extends Diff_[LHS, RHS] {
  var kind: E = js.native
  var lhs: LHS = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
  var rhs: RHS = js.native
}

object DiffEdit {
  @scala.inline
  def apply[LHS, RHS](kind: E, lhs: LHS, rhs: RHS): DiffEdit[LHS, RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffEdit[LHS, RHS]]
  }
  @scala.inline
  implicit class DiffEditOps[Self[lhs, rhs] <: DiffEdit[lhs, rhs], LHS, RHS] (val x: Self[LHS, RHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[LHS, RHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[LHS, RHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[LHS, RHS]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[LHS, RHS]) with Other]
    @scala.inline
    def withKind(value: E): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLhs(value: LHS): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lhs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRhs(value: RHS): Self[LHS, RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhs")(value.asInstanceOf[js.Any])
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

