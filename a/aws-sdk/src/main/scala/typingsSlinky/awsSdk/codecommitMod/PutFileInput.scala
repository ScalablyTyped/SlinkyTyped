package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFileInput extends js.Object {
  /**
    * The name of the branch where you want to add or update the file. If this is an empty repository, this branch is created.
    */
  var branchName: BranchName = js.native
  /**
    * A message about why this file was added or updated. Although it is optional, a message makes the commit history for your repository more useful.
    */
  var commitMessage: js.UndefOr[Message] = js.native
  /**
    * An email address for the person adding or updating the file.
    */
  var email: js.UndefOr[Email] = js.native
  /**
    * The content of the file, in binary object format. 
    */
  var fileContent: FileContent = js.native
  /**
    * The file mode permissions of the blob. Valid file mode permissions are listed here.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
  /**
    * The name of the file you want to add or update, including the relative path to the file in the repository.  If the path does not currently exist in the repository, the path is created as part of adding the file. 
    */
  var filePath: Path = js.native
  /**
    * The name of the person adding or updating the file. Although it is optional, a name makes the commit history for your repository more useful.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The full commit ID of the head commit in the branch where you want to add or update the file. If this is an empty repository, no commit ID is required. If this is not an empty repository, a commit ID is required.  The commit ID must match the ID of the head commit at the time of the operation. Otherwise, an error occurs, and the file is not added or updated.
    */
  var parentCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The name of the repository where you want to add or update the file.
    */
  var repositoryName: RepositoryName = js.native
}

object PutFileInput {
  @scala.inline
  def apply(branchName: BranchName, fileContent: FileContent, filePath: Path, repositoryName: RepositoryName): PutFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], fileContent = fileContent.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileInput]
  }
  @scala.inline
  implicit class PutFileInputOps[Self <: PutFileInput] (val x: Self) extends AnyVal {
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
    def withFileContentUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileContent(value: FileContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryName(value: RepositoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
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
    def withFileMode(value: FileModeTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
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
  }
  
}

