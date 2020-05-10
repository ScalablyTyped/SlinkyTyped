package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeHunkDetail extends js.Object {
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.native
  /**
    * The base-64 encoded content of the hunk merged region that might contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.native
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.native
}

object MergeHunkDetail {
  @scala.inline
  def apply(): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunkDetail]
  }
  @scala.inline
  implicit class MergeHunkDetailOps[Self <: MergeHunkDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndLine(value: LineNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endLine")(js.undefined)
        ret
    }
    @scala.inline
    def withHunkContent(value: HunkContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hunkContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHunkContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hunkContent")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLine(value: LineNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLine")(js.undefined)
        ret
    }
  }
  
}

