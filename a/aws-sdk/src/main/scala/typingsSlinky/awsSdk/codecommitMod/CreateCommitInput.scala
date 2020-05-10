package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommitInput extends js.Object {
  /**
    * The name of the author who created the commit. This information is used as both the author and committer for the commit.
    */
  var authorName: js.UndefOr[Name] = js.native
  /**
    * The name of the branch where you create the commit.
    */
  var branchName: BranchName = js.native
  /**
    * The commit message you want to include in the commit. Commit messages are limited to 256 KB. If no message is specified, a default message is used.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * The files to delete in this commit. These files still exist in earlier commits.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.native
  /**
    * The email address of the person who created the commit.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * If the commit contains deletions, whether to keep a folder or folder structure if the changes leave the folders empty. If true, a ..gitkeep file is created for empty folders. The default is false.
    */
  var keepEmptyFolders: js.UndefOr[KeepEmptyFolders] = js.native
  /**
    * The ID of the commit that is the parent of the commit you create. Not required if this is an empty repository.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The files to add or update in this commit.
    */
  var putFiles: js.UndefOr[PutFileEntries] = js.native
  /**
    * The name of the repository where you create the commit.
    */
  var repositoryName: RepositoryName = js.native
  /**
    * The file modes to update for files in this commit.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.native
}

object CreateCommitInput {
  @scala.inline
  def apply(branchName: BranchName, repositoryName: RepositoryName): CreateCommitInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommitInput]
  }
  @scala.inline
  implicit class CreateCommitInputOps[Self <: CreateCommitInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
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
    def withDeleteFiles(value: DeleteFileEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteFiles")(js.undefined)
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
    def withParentCommitId(value: CommitId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCommitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentCommitId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentCommitId")(js.undefined)
        ret
    }
    @scala.inline
    def withPutFiles(value: PutFileEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withSetFileModes(value: SetFileModeEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileModes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetFileModes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFileModes")(js.undefined)
        ret
    }
  }
  
}

