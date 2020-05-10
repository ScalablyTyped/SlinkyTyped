package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * A list of conflicts for each file, including the conflict metadata and the hunks of the differences between the files.
    */
  var conflicts: Conflicts = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * A list of any errors returned while describing the merge conflicts for each file.
    */
  var errors: js.UndefOr[BatchDescribeMergeConflictsErrors] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object BatchDescribeMergeConflictsOutput {
  @scala.inline
  def apply(conflicts: Conflicts, destinationCommitId: ObjectId, sourceCommitId: ObjectId): BatchDescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsOutput]
  }
  @scala.inline
  implicit class BatchDescribeMergeConflictsOutputOps[Self <: BatchDescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicts(value: Conflicts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationCommitId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitId")(value.asInstanceOf[js.Any])
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
    def withErrors(value: BatchDescribeMergeConflictsErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
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

