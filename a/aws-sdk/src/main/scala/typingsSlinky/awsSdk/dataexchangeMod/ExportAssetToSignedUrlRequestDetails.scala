package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetToSignedUrlRequestDetails extends js.Object {
  /**
    * The unique identifier for the asset that is exported to a signed URL.
    */
  var AssetId: Id = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id = js.native
}

object ExportAssetToSignedUrlRequestDetails {
  @scala.inline
  def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlRequestDetails]
  }
  @scala.inline
  implicit class ExportAssetToSignedUrlRequestDetailsOps[Self <: ExportAssetToSignedUrlRequestDetails] (val x: Self) extends AnyVal {
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
  }
  
}

