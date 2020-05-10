package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeMetadata extends js.Object {
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.native
  /**
    * The commit ID for the merge commit, if any.
    */
  var mergeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The merge strategy used in the merge.
    */
  var mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.native
}

object MergeMetadata {
  @scala.inline
  def apply(): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeMetadata]
  }
  @scala.inline
  implicit class MergeMetadataOps[Self <: MergeMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMerged(value: IsMerged): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMerged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMerged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMerged")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeOption(value: MergeOptionTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergeOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedBy(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedBy")(js.undefined)
        ret
    }
  }
  
}

