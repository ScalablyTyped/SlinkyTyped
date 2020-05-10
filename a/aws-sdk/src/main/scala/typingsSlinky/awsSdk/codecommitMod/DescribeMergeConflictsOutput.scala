package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * Contains metadata about the conflicts found in the merge.
    */
  var conflictMetadata: ConflictMetadata = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * A list of merge hunks of the differences between the files or lines.
    */
  var mergeHunks: MergeHunks = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object DescribeMergeConflictsOutput {
  @scala.inline
  def apply(
    conflictMetadata: ConflictMetadata,
    destinationCommitId: ObjectId,
    mergeHunks: MergeHunks,
    sourceCommitId: ObjectId
  ): DescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadata = conflictMetadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeHunks = mergeHunks.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMergeConflictsOutput]
  }
  @scala.inline
  implicit class DescribeMergeConflictsOutputOps[Self <: DescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflictMetadata(value: ConflictMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeHunks(value: MergeHunks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeHunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitId")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

