package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeCommitOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID for the merge commit created when the source branch was merged into the destination branch. If the fast-forward merge strategy was used, there is no merge commit.
    */
  var mergedCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.native
}

object GetMergeCommitOutput {
  @scala.inline
  def apply(): GetMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMergeCommitOutput]
  }
  @scala.inline
  implicit class GetMergeCommitOutputOps[Self <: GetMergeCommitOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(js.undefined)
        ret
    }
  }
  
}

