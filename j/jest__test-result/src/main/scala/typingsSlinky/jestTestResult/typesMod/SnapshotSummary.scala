package typingsSlinky.jestTestResult.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotSummary extends js.Object {
  var added: Double = js.native
  var didUpdate: Boolean = js.native
  var failure: Boolean = js.native
  var filesAdded: Double = js.native
  var filesRemoved: Double = js.native
  var filesRemovedList: js.Array[String] = js.native
  var filesUnmatched: Double = js.native
  var filesUpdated: Double = js.native
  var matched: Double = js.native
  var total: Double = js.native
  var unchecked: Double = js.native
  var uncheckedKeysByFile: js.Array[UncheckedSnapshot] = js.native
  var unmatched: Double = js.native
  var updated: Double = js.native
}

object SnapshotSummary {
  @scala.inline
  def apply(
    added: Double,
    didUpdate: Boolean,
    failure: Boolean,
    filesAdded: Double,
    filesRemoved: Double,
    filesRemovedList: js.Array[String],
    filesUnmatched: Double,
    filesUpdated: Double,
    matched: Double,
    total: Double,
    unchecked: Double,
    uncheckedKeysByFile: js.Array[UncheckedSnapshot],
    unmatched: Double,
    updated: Double
  ): SnapshotSummary = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], didUpdate = didUpdate.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesRemoved = filesRemoved.asInstanceOf[js.Any], filesRemovedList = filesRemovedList.asInstanceOf[js.Any], filesUnmatched = filesUnmatched.asInstanceOf[js.Any], filesUpdated = filesUpdated.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any], uncheckedKeysByFile = uncheckedKeysByFile.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSummary]
  }
  @scala.inline
  implicit class SnapshotSummaryOps[Self <: SnapshotSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDidUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesAdded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesRemoved(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesRemovedList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesRemovedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesUnmatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUnmatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilesUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filesUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnchecked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncheckedKeysByFile(value: js.Array[UncheckedSnapshot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncheckedKeysByFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnmatched(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

