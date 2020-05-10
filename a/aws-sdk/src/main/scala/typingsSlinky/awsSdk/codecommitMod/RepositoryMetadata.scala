package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryMetadata extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the repository.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.codecommitMod.Arn] = js.native
  /**
    * The ID of the AWS account associated with the repository.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.native
  /**
    * The URL to use for cloning the repository over SSH.
    */
  var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.native
  /**
    * The date and time the repository was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The repository's default branch name.
    */
  var defaultBranch: js.UndefOr[BranchName] = js.native
  /**
    * The date and time the repository was last modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * A comment or description about the repository.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  /**
    * The ID of the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
  /**
    * The repository's name.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
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
    def withArn(value: Arn): Self = {
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
    def withAccountId(value: AccountId): Self = {
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
    def withCloneUrlHttp(value: CloneUrlHttp): Self = {
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
    def withCloneUrlSsh(value: CloneUrlSsh): Self = {
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
    def withCreationDate(value: js.Date): Self = {
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
    def withDefaultBranch(value: BranchName): Self = {
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
    def withLastModifiedDate(value: js.Date): Self = {
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
    def withRepositoryDescription(value: RepositoryDescription): Self = {
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
    def withRepositoryId(value: RepositoryId): Self = {
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
    def withRepositoryName(value: RepositoryName): Self = {
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

