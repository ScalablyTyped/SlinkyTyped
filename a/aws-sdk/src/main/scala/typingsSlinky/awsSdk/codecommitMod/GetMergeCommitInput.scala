package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeCommitInput extends js.Object {
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.native
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var destinationCommitSpecifier: CommitName = js.native
  /**
    * The name of the repository that contains the merge commit about which you want to get information.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The branch, tag, HEAD, or other fully qualified reference used to identify a commit (for example, a branch name or a full commit ID).
    */
  var sourceCommitSpecifier: CommitName = js.native
}

object GetMergeCommitInput {
  @scala.inline
  def apply(
    destinationCommitSpecifier: CommitName,
    repositoryName: RepositoryName,
    sourceCommitSpecifier: CommitName
  ): GetMergeCommitInput = {
    val __obj = js.Dynamic.literal(destinationCommitSpecifier = destinationCommitSpecifier.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], sourceCommitSpecifier = sourceCommitSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeCommitInput]
  }
  @scala.inline
  implicit class GetMergeCommitInputOps[Self <: GetMergeCommitInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationCommitSpecifier(value: CommitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationCommitSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceCommitSpecifier(value: CommitName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceCommitSpecifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflictDetailLevel(value: ConflictDetailLevelTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetailLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictDetailLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictDetailLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withConflictResolutionStrategy(value: ConflictResolutionStrategyTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictResolutionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictResolutionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictResolutionStrategy")(js.undefined)
        ret
    }
  }
  
}

