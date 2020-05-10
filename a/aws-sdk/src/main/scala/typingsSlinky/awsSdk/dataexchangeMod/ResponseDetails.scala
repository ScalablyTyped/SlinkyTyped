package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseDetails extends js.Object {
  /**
    * Details for the export to signed URL response.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.native
  /**
    * Details for the export to Amazon S3 response.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.native
  /**
    * Details for the import from signed URL response.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.native
  /**
    * Details for the import from Amazon S3 response.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.native
}

object ResponseDetails {
  @scala.inline
  def apply(): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDetails]
  }
  @scala.inline
  implicit class ResponseDetailsOps[Self <: ResponseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportAssetToSignedUrl(value: ExportAssetToSignedUrlResponseDetails): Self = {
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
    def withExportAssetsToS3(value: ExportAssetsToS3ResponseDetails): Self = {
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
    def withImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlResponseDetails): Self = {
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
    def withImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = {
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

