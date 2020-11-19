package typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod

import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>The name of the branch where the commit will be made deleting the file.</p>
    */
  var branchName: String = js.native
  
  /**
    * <p>The commit message you want to include as part of deleting the file. Commit messages are limited to 256 KB. If no message is specified, a default message will be used.</p>
    */
  var commitMessage: js.UndefOr[String] = js.native
  
  /**
    * <p>The email address for the commit that deletes the file. If no email address is specified, the email address will be left blank.</p>
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * <p>The fully-qualified path to the file that will be deleted, including the full name and extension of that file. For example, /examples/file.md is a fully qualified path to a file named file.md in a folder named examples.</p>
    */
  var filePath: String = js.native
  
  /**
    * <p>Specifies whether to delete the folder or directory that contains the file you want to delete if that file is the only object in the folder or directory. By default, empty folders will be deleted. This includes empty folders that are part of the directory structure. For example, if the path to a file is dir1/dir2/dir3/dir4, and dir2 and dir3 are empty, deleting the last file in dir4 will also delete the empty folders dir4, dir3, and dir2.</p>
    */
  var keepEmptyFolders: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The name of the author of the commit that deletes the file. If no name is specified, the user's ARN will be used as the author name and committer name.</p>
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * <p>The ID of the commit that is the tip of the branch where you want to create the commit that will delete the file. This must be the HEAD commit for the branch. The commit that deletes the file will be created from this commit ID.</p>
    */
  var parentCommitId: String = js.native
  
  /**
    * <p>The name of the repository that contains the file to delete.</p>
    */
  var repositoryName: String = js.native
}
object DeleteFileInput {
  
  @scala.inline
  def apply(branchName: String, filePath: String, parentCommitId: String, repositoryName: String): DeleteFileInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], parentCommitId = parentCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileInput]
  }
  
  @scala.inline
  implicit class DeleteFileInputOps[Self <: DeleteFileInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBranchName(value: String): Self = this.set("branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentCommitId(value: String): Self = this.set("parentCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    
    @scala.inline
    def setCommitMessage(value: String): Self = this.set("commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitMessage: Self = this.set("commitMessage", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setKeepEmptyFolders(value: Boolean): Self = this.set("keepEmptyFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepEmptyFolders: Self = this.set("keepEmptyFolders", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
