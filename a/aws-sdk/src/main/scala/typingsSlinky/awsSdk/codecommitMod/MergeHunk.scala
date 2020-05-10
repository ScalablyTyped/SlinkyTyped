package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHunk extends js.Object {
  /**
    * Information about the merge hunk in the base of a merge or pull request.
    */
  var base: js.UndefOr[MergeHunkDetail] = js.native
  /**
    * Information about the merge hunk in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[MergeHunkDetail] = js.native
  /**
    * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid values include true, false, and null. True when the hunk represents a conflict and one or more files contains a line conflict. File mode conflicts in a merge do not set this to true.
    */
  var isConflict: js.UndefOr[IsHunkConflict] = js.native
  /**
    * Information about the merge hunk in the source of a merge or pull request.
    */
  var source: js.UndefOr[MergeHunkDetail] = js.native
}

object MergeHunk {
  @scala.inline
  def apply(): MergeHunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunk]
  }
  @scala.inline
  implicit class MergeHunkOps[Self <: MergeHunk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: MergeHunkDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: MergeHunkDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConflict(value: IsHunkConflict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConflict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConflict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConflict")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: MergeHunkDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

