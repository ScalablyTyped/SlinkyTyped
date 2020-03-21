package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeRepositorySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typingsSlinky.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * The date and time that the Git repository was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GitConfig] = js.native
  /**
    * The date and time that the Git repository was last modified.
    */
  var LastModifiedTime: js.Date = js.native
}

object CodeRepositorySummary {
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    GitConfig: GitConfig = null
  ): CodeRepositorySummary = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    if (GitConfig != null) __obj.updateDynamic("GitConfig")(GitConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepositorySummary]
  }
}

