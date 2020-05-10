package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestByThreeWayInput extends js.Object {
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.native
  /**
    * The commit message to include in the commit information for the merge.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * The level of conflict detail to use. If unspecified, the default FILE_LEVEL is used, which returns a not-mergeable result if the same file has differences in both branches. If LINE_LEVEL is specified, a conflict is considered not mergeable if the same file in both branches has differences on the same line.
    */
  var conflictDetailLevel: js.UndefOr[ConflictDetailLevelTypeEnum] = js.native
  /**
    * If AUTOMERGE is the conflict resolution strategy, a list of inputs to use when resolving conflicts during a merge.
    */
  var conflictResolution: js.UndefOr[ConflictResolution] = js.native
  /**
    * Specifies which branch to use when resolving conflicts, or whether to attempt automatically merging two versions of a file. The default is NONE, which requires any conflicts to be resolved manually before the merge operation is successful.
    */
  var conflictResolutionStrategy: js.UndefOr[ConflictResolutionStrategyTypeEnum] = js.native
  /**
    * The email address of the person merging the branches. This information is used in the commit information for the merge.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If true, a .gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  /**
    * The system-generated ID of the pull request. To get this ID, use ListPullRequests.
    */
  var pullRequestId: PullRequestId = js.native
  /**
    * The name of the repository where the pull request was created.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.
    */
  var sourceCommitId: js.UndefOr[ObjectId] = js.native
}

object MergePullRequestByThreeWayInput {
  @scala.inline
  def apply(pullRequestId: PullRequestId, repositoryName: RepositoryName): MergePullRequestByThreeWayInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByThreeWayInput]
  }
  @scala.inline
  implicit class MergePullRequestByThreeWayInputOps[Self <: MergePullRequestByThreeWayInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPullRequestId(value: PullRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthorName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorName")(js.undefined)
        ret
    }
    @scala.inline
    def withCommitMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommitMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commitMessage")(js.undefined)
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
    def withConflictResolution(value: ConflictResolution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflictResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflictResolution")(js.undefined)
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
    @scala.inline
    def withEmail(value: Email): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepEmptyFolders(value: KeepEmptyFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepEmptyFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyFolders")(js.undefined)
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

