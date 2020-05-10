package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssetRequest extends js.Object {
  /**
    * The unique identifier for an asset.
    */
  var AssetId: string = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: AssetName = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: string = js.native
}

object UpdateAssetRequest {
  @scala.inline
  def apply(AssetId: string, DataSetId: string, Name: AssetName, RevisionId: string): UpdateAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssetRequest]
  }
  @scala.inline
  implicit class UpdateAssetRequestOps[Self <: UpdateAssetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AssetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

