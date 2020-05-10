package typingsSlinky.diff2html.Diff2Html

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var addedLines: Double = js.native
  var blocks: js.Array[Block] = js.native
  var changedPercentage: js.UndefOr[Double] = js.native
  var checksumAfter: js.UndefOr[String] = js.native
  var checksumBefore: js.UndefOr[String] = js.native
  var deletedFileMode: js.UndefOr[String] = js.native
  var deletedLines: Double = js.native
  var isCombined: Boolean = js.native
  var isCopy: js.UndefOr[Boolean] = js.native
  var isDeleted: js.UndefOr[Boolean] = js.native
  var isGitDiff: Boolean = js.native
  var isNew: js.UndefOr[Boolean] = js.native
  var isRename: js.UndefOr[Boolean] = js.native
  var language: String = js.native
  var mode: js.UndefOr[String] = js.native
  var newFileMode: js.UndefOr[String] = js.native
  var newMode: js.UndefOr[String] = js.native
  var newName: String = js.native
  var oldMode: js.UndefOr[String] = js.native
  var oldName: String = js.native
  var unchangedPercentage: js.UndefOr[Double] = js.native
}

object Result {
  @scala.inline
  def apply(
    addedLines: Double,
    blocks: js.Array[Block],
    deletedLines: Double,
    isCombined: Boolean,
    isGitDiff: Boolean,
    language: String,
    newName: String,
    oldName: String
  ): Result = {
    val __obj = js.Dynamic.literal(addedLines = addedLines.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], deletedLines = deletedLines.asInstanceOf[js.Any], isCombined = isCombined.asInstanceOf[js.Any], isGitDiff = isGitDiff.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddedLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addedLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocks(value: js.Array[Block]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletedLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsCombined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCombined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGitDiff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGitDiff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChangedPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangedPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksumAfter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksumAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withChecksumBefore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecksumBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checksumBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedFileMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedFileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedFileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeleted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRename(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRename")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNewFileMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMode")(js.undefined)
        ret
    }
    @scala.inline
    def withOldMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldMode")(js.undefined)
        ret
    }
    @scala.inline
    def withUnchangedPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchangedPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnchangedPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchangedPercentage")(js.undefined)
        ret
    }
  }
  
}

