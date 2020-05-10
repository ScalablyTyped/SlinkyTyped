package typingsSlinky.deepDiff.mod

import typingsSlinky.deepDiff.deepDiffStrings.D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffDeleted[LHS]
  extends Diff_[LHS, js.Any] {
  var kind: D = js.native
  var lhs: LHS = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
}

object DiffDeleted {
  @scala.inline
  def apply[LHS](kind: D, lhs: LHS): DiffDeleted[LHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], lhs = lhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffDeleted[LHS]]
  }
  @scala.inline
  implicit class DiffDeletedOps[Self[lhs] <: DiffDeleted[lhs], LHS] (val x: Self[LHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[LHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[LHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[LHS] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[LHS] with Other]
    @scala.inline
    def withKind(value: D): Self[LHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLhs(value: LHS): Self[LHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lhs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[_]): Self[LHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[LHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

