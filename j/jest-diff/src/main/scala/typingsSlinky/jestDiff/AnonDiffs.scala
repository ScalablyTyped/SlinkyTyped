package typingsSlinky.jestDiff

import typingsSlinky.jestDiff.cleanupSemanticMod.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiffs extends js.Object {
  var diffs: js.Array[Diff] = js.native
  var isMultiline: Boolean = js.native
}

object AnonDiffs {
  @scala.inline
  def apply(diffs: js.Array[Diff], isMultiline: Boolean): AnonDiffs = {
    val __obj = js.Dynamic.literal(diffs = diffs.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiffs]
  }
  @scala.inline
  implicit class AnonDiffsOps[Self <: AnonDiffs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiffs(value: js.Array[Diff]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

