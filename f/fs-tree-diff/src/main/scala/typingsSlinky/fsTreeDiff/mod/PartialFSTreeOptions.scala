package typingsSlinky.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fs-tree-diff.fs-tree-diff.FSTreeOptions> */
trait PartialFSTreeOptions extends js.Object {
  var entries: js.UndefOr[js.Array[Entry]] = js.undefined
  var sortAndExpand: js.UndefOr[Boolean] = js.undefined
}

object PartialFSTreeOptions {
  @scala.inline
  def apply(entries: js.Array[Entry] = null, sortAndExpand: js.UndefOr[Boolean] = js.undefined): PartialFSTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAndExpand)) __obj.updateDynamic("sortAndExpand")(sortAndExpand.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFSTreeOptions]
  }
}

