package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetEntry extends StObject {
  
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
  implicit class AssetEntryMutableBuilder[Self <: AssetEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetDetails(value: AssetDetails): Self = StObject.set(x, "AssetDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: Id): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AssetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
