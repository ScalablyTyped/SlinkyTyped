package typingsSlinky.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAssetPropertyValueEntry extends StObject {
  
  /**
    * The ID of the asset to update.
    */
  var assetId: js.UndefOr[ID] = js.native
  
  /**
    * The user specified ID for the entry. You can use this ID to identify which entries failed.
    */
  var entryId: EntryId = js.native
  
  /**
    * The property alias that identifies the property, such as an OPC-UA server data stream path (for example, /company/windfarm/3/turbine/7/temperature). For more information, see Mapping industrial data streams to asset properties in the AWS IoT SiteWise User Guide.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  
  /**
    * The ID of the asset property for this entry.
    */
  var propertyId: js.UndefOr[ID] = js.native
  
  /**
    * The list of property values to upload. You can specify up to 10 propertyValues array elements. 
    */
  var propertyValues: AssetPropertyValues = js.native
}
object PutAssetPropertyValueEntry {
  
  @scala.inline
  def apply(entryId: EntryId, propertyValues: AssetPropertyValues): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  
  @scala.inline
  implicit class PutAssetPropertyValueEntryMutableBuilder[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyId(value: ID): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    @scala.inline
    def setPropertyValues(value: AssetPropertyValues): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "propertyValues", js.Array(value :_*))
  }
}
