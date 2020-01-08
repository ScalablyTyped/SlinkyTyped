package typingsSlinky.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetEntry extends js.Object {
  /**
    * The ARN for the asset.
    */
  var Arn: typingsSlinky.awsDashSdk.clientsDataexchangeMod.Arn = js.native
  /**
    * Information about the asset, including its size.
    */
  var AssetDetails: typingsSlinky.awsDashSdk.clientsDataexchangeMod.AssetDetails = js.native
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: typingsSlinky.awsDashSdk.clientsDataexchangeMod.AssetType = js.native
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
  var Id: typingsSlinky.awsDashSdk.clientsDataexchangeMod.Id = js.native
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
    UpdatedAt: js.Date,
    SourceId: Id = null
  ): AssetEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], AssetDetails = AssetDetails.asInstanceOf[js.Any], AssetType = AssetType.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetEntry]
  }
}

