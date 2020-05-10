package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageDetail extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The date and time, expressed in standard JavaScript date format, at which the current image was pushed to the repository. 
    */
  var imagePushedAt: js.UndefOr[js.Date] = js.native
  /**
    * A summary of the last completed image scan.
    */
  var imageScanFindingsSummary: js.UndefOr[ImageScanFindingsSummary] = js.native
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  /**
    * The size, in bytes, of the image in the repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  var imageSizeInBytes: js.UndefOr[ImageSizeInBytes] = js.native
  /**
    * The list of tags associated with this image.
    */
  var imageTags: js.UndefOr[ImageTagList] = js.native
  /**
    * The AWS account ID associated with the registry to which this image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The name of the repository to which this image belongs.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object ImageDetail {
  @scala.inline
  def apply(): ImageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDetail]
  }
  @scala.inline
  implicit class ImageDetailOps[Self <: ImageDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDigest(value: ImageDigest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDigest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDigest")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePushedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePushedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePushedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePushedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScanFindingsSummary(value: ImageScanFindingsSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanFindingsSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanFindingsSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanFindingsSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScanStatus(value: ImageScanStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withImageSizeInBytes(value: ImageSizeInBytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTags(value: ImageTagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTags")(js.undefined)
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

