package typingsSlinky.awsSdkClientCodecommitNode.typesRepositoryMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryMetadata extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the repository.</p>
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the AWS account associated with the repository.</p>
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * <p>The URL to use for cloning the repository over HTTPS.</p>
    */
  var cloneUrlHttp: js.UndefOr[String] = js.native
  /**
    * <p>The URL to use for cloning the repository over SSH.</p>
    */
  var cloneUrlSsh: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>The repository's default branch name.</p>
    */
  var defaultBranch: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  var lastModifiedDate: js.UndefOr[js.Date | String | Double] = js.native
  /**
    * <p>A comment or description about the repository.</p>
    */
  var repositoryDescription: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.native
  /**
    * <p>The repository's name.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
}

object RepositoryMetadata {
  @scala.inline
  def apply(): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryMetadata]
  }
  @scala.inline
  implicit class RepositoryMetadataOps[Self <: RepositoryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneUrlHttp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlHttp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneUrlHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlHttp")(js.undefined)
        ret
    }
    @scala.inline
    def withCloneUrlSsh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlSsh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneUrlSsh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneUrlSsh")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBranch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBranch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBranch")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryName")(js.undefined)
        ret
    }
  }
  
}

