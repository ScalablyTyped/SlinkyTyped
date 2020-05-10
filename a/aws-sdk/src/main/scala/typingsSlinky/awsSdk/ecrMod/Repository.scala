package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends js.Object {
  /**
    * The date and time, in JavaScript date format, when the repository was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.native
  var imageScanningConfiguration: js.UndefOr[ImageScanningConfiguration] = js.native
  /**
    * The tag mutability setting for the repository.
    */
  var imageTagMutability: js.UndefOr[ImageTagMutability] = js.native
  /**
    * The AWS account ID associated with the registry that contains the repository.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the repository. The ARN contains the arn:aws:ecr namespace, followed by the region of the repository, AWS account ID of the repository owner, repository namespace, and repository name. For example, arn:aws:ecr:region:012345678910:repository/test.
    */
  var repositoryArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the repository.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
  /**
    * The URI for the repository. You can use this URI for Docker push or pull operations.
    */
  var repositoryUri: js.UndefOr[Url] = js.native
}

object Repository {
  @scala.inline
  def apply(): Repository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Repository]
  }
  @scala.inline
  implicit class RepositoryOps[Self <: Repository] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScanningConfiguration(value: ImageScanningConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanningConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanningConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanningConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTagMutability(value: ImageTagMutability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagMutability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTagMutability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTagMutability")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistryId(value: RegistryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registryId")(js.undefined)
        ret
    }
    @scala.inline
    def withRepositoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryArn")(js.undefined)
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
    @scala.inline
    def withRepositoryUri(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryUri")(js.undefined)
        ret
    }
  }
  
}

