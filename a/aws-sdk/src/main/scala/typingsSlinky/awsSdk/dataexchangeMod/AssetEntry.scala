package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetEntry extends js.Object {
  /**
    * The ARN for the asset.
    */
  var Arn: typingsSlinky.awsSdk.dataexchangeMod.Arn = js.native
  /**
    * Information about the asset, including its size.
    */
  var AssetDetails: typingsSlinky.awsSdk.dataexchangeMod.AssetDetails = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: typingsSlinky.awsSdk.dataexchangeMod.AssetType = js.native
  /**
    * The date and time that the asset was created, in ISO 8601 format.
    */
  var CreatedAt: js.Date = js.native
  /**
    * The unique identifier for the data set associated with this asset.
    */
  var DataSetId: Id = js.native
  /**
    * The unique identifier for the asset.
    */
  var Id: typingsSlinky.awsSdk.dataexchangeMod.Id = js.native
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name. When exporting to Amazon S3, the asset name is used as default target S3 object key.
    */
  var Name: AssetName = js.native
  /**
    * The unique identifier for the revision associated with this asset.
    */
  var RevisionId: Id = js.native
  /**
    * The asset ID of the owned asset corresponding to the entitled asset being viewed. This parameter is returned when an asset owner is viewing the entitled copy of its owned asset.
    */
  var SourceId: js.UndefOr[Id] = js.native
  /**
    * The date and time that the asset was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.Date = js.native
}

object AssetEntry {
  @scala.inline
  def apply(
    Arn: Arn,
    AssetDetails: AssetDetails,
    AssetType: AssetType,
    CreatedAt: js.Date,
    DataSetId: Id,
    Id: Id,
    Name: AssetName,
    RevisionId: Id,
    UpdatedAt: js.Date
  ): AssetEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AssetDetails = AssetDetails.asInstanceOf[js.Any], AssetType = AssetType.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetEntry]
  }
  @scala.inline
  implicit class AssetEntryOps[Self <: AssetEntry] (val x: Self) extends AnyVal {
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
    def withAssetDetails(value: AssetDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetType(value: AssetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataSetId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: AssetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevisionId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceId")(js.undefined)
        ret
    }
  }
  
}

