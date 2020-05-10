package typingsSlinky.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImageScanFindingsResponse extends js.Object {
  var imageId: js.UndefOr[ImageIdentifier] = js.native
  /**
    * The information contained in the image scan findings.
    */
  var imageScanFindings: js.UndefOr[ImageScanFindings] = js.native
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  /**
    * The nextToken value to include in a future DescribeImageScanFindings request. When the results of a DescribeImageScanFindings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object DescribeImageScanFindingsResponse {
  @scala.inline
  def apply(): DescribeImageScanFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageScanFindingsResponse]
  }
  @scala.inline
  implicit class DescribeImageScanFindingsResponseOps[Self <: DescribeImageScanFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageId(value: ImageIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(js.undefined)
        ret
    }
    @scala.inline
    def withImageScanFindings(value: ImageScanFindings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageScanFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageScanFindings")(js.undefined)
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
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
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

