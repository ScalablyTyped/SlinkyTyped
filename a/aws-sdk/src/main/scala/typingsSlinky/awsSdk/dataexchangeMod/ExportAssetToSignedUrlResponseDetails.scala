package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetToSignedUrlResponseDetails extends js.Object {
  /**
    * The unique identifier for the asset associated with this export job.
    */
  var AssetId: Id = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
  /**
    * The signed URL for the export request.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  /**
    * The date and time that the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[js.Date] = js.native
}

object ExportAssetToSignedUrlResponseDetails {
  @scala.inline
  def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
  }
  @scala.inline
  implicit class ExportAssetToSignedUrlResponseDetailsOps[Self <: ExportAssetToSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignedUrl(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedUrlExpiresAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrlExpiresAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedUrlExpiresAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SignedUrlExpiresAt")(js.undefined)
        ret
    }
  }
  
}

