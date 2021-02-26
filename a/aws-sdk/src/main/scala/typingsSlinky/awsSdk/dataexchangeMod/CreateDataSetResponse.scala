package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSetResponse extends StObject {
  
  /**
    * The ARN for the data set.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Arn] = js.native
  
  /**
    * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
    */
  var AssetType: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.AssetType] = js.native
  
  /**
    * The date and time that the data set was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  
  /**
    * The description for the data set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Description] = js.native
  
  /**
    * The unique identifier for the data set.
    */
  var Id: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Id] = js.native
  
  /**
    * The name of the data set.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Name] = js.native
  
  /**
    * A property that defines the data set as OWNED by the account (for providers) or ENTITLED to the account (for subscribers).
    */
  var Origin: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.Origin] = js.native
  
  /**
    * If the origin of this data set is ENTITLED, includes the details for the product on AWS Marketplace.
    */
  var OriginDetails: js.UndefOr[typingsSlinky.awsSdk.dataexchangeMod.OriginDetails] = js.native
  
  /**
    * The data set ID of the owned data set corresponding to the entitled data set being viewed. This parameter is returned when a data set owner is viewing the entitled copy of its owned data set.
    */
  var SourceId: js.UndefOr[Id] = js.native
  
  /**
    * The tags for the data set.
    */
  var Tags: js.UndefOr[MapOfString] = js.native
  
  /**
    * The date and time that the data set was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}
object CreateDataSetResponse {
  
  @scala.inline
  def apply(): CreateDataSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSetResponse]
  }
  
  @scala.inline
  implicit class CreateDataSetResponseMutableBuilder[Self <: CreateDataSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setAssetType(value: AssetType): Self = StObject.set(x, "AssetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypeUndefined: Self = StObject.set(x, "AssetType", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOrigin(value: Origin): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginDetails(value: OriginDetails): Self = StObject.set(x, "OriginDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginDetailsUndefined: Self = StObject.set(x, "OriginDetails", js.undefined)
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
    
    @scala.inline
    def setSourceId(value: Id): Self = StObject.set(x, "SourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "SourceId", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
