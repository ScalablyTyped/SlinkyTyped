package typingsSlinky.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fs-tree-diff.fs-tree-diff.FSTreeOptions> */
@js.native
trait PartialFSTreeOptions extends js.Object {
  var entries: js.UndefOr[js.Array[Entry]] = js.native
  var sortAndExpand: js.UndefOr[Boolean] = js.native
}

object PartialFSTreeOptions {
  @scala.inline
  def apply(): PartialFSTreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFSTreeOptions]
  }
  @scala.inline
  implicit class PartialFSTreeOptionsOps[Self <: PartialFSTreeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[Entry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withSortAndExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAndExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortAndExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAndExpand")(js.undefined)
        ret
    }
  }
  
}

