package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDetails extends js.Object {
  /**
    * Details about the export to signed URL request.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.native
  /**
    * Details about the export to Amazon S3 request.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.native
  /**
    * Details about the import from signed URL request.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.native
  /**
    * Details about the import from Amazon S3 request.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.native
}

object RequestDetails {
  @scala.inline
  def apply(): RequestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDetails]
  }
  @scala.inline
  implicit class RequestDetailsOps[Self <: RequestDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportAssetToSignedUrl(value: ExportAssetToSignedUrlRequestDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAssetToSignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAssetToSignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAssetToSignedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withExportAssetsToS3(value: ExportAssetsToS3RequestDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAssetsToS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportAssetsToS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportAssetsToS3")(js.undefined)
        ret
    }
    @scala.inline
    def withImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlRequestDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetFromSignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportAssetFromSignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetFromSignedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withImportAssetsFromS3(value: ImportAssetsFromS3RequestDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetsFromS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportAssetsFromS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImportAssetsFromS3")(js.undefined)
        ret
    }
  }
  
}

