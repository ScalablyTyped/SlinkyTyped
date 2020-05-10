package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetsToS3ResponseDetails extends js.Object {
  /**
    * The destination in Amazon S3 where the asset is exported.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
}

object ExportAssetsToS3ResponseDetails {
  @scala.inline
  def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
  }
  @scala.inline
  implicit class ExportAssetsToS3ResponseDetailsOps[Self <: ExportAssetsToS3ResponseDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetDestinations(value: ListOfAssetDestinationEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetDestinations")(value.asInstanceOf[js.Any])
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

