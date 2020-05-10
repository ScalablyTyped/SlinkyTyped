package typingsSlinky.deepDiff.mod

import typingsSlinky.deepDiff.deepDiffStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiffNew[RHS]
  extends Diff_[js.Any, RHS] {
  var kind: N = js.native
  var path: js.UndefOr[js.Array[_]] = js.native
  var rhs: RHS = js.native
}

object DiffNew {
  @scala.inline
  def apply[RHS](kind: N, rhs: RHS): DiffNew[RHS] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffNew[RHS]]
  }
  @scala.inline
  implicit class DiffNewOps[Self[rhs] <: DiffNew[rhs], RHS] (val x: Self[RHS]) extends AnyVal {
    @scala.inline
    def duplicate: Self[RHS] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[RHS]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[RHS] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[RHS] with Other]
    @scala.inline
    def withKind(value: N): Self[RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRhs(value: RHS): Self[RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rhs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[_]): Self[RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self[RHS] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
  }
  
}

