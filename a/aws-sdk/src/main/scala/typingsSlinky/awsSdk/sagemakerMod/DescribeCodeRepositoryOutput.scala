package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typingsSlinky.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * The date and time that the repository was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.GitConfig] = js.native
  /**
    * The date and time that the repository was last changed.
    */
  var LastModifiedTime: js.Date = js.native
}

object DescribeCodeRepositoryOutput {
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: js.Date,
    LastModifiedTime: js.Date
  ): DescribeCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryOutput]
  }
  @scala.inline
  implicit class DescribeCodeRepositoryOutputOps[Self <: DescribeCodeRepositoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeRepositoryArn(value: CodeRepositoryArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeRepositoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeRepositoryName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CodeRepositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGitConfig(value: GitConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGitConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GitConfig")(js.undefined)
        ret
    }
  }
  
}

