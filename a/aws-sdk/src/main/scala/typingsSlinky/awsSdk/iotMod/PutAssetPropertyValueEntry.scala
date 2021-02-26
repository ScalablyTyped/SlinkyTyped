package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAssetPropertyValueEntry extends StObject {
  
  /**
    * The ID of the AWS IoT SiteWise asset. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var assetId: js.UndefOr[AssetId] = js.native
  
  /**
    * Optional. A unique identifier for this entry that you can define to better track which message caused an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.native
  
  /**
    * The name of the property alias associated with your asset property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  
  /**
    * The ID of the asset's property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.native
  
  /**
    * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
    */
  var propertyValues: AssetPropertyValueList = js.native
}
object PutAssetPropertyValueEntry {
  
  @scala.inline
  def apply(propertyValues: AssetPropertyValueList): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  
  @scala.inline
  implicit class PutAssetPropertyValueEntryMutableBuilder[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetId(value: AssetId): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    @scala.inline
    def setEntryId(value: AssetPropertyEntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryIdUndefined: Self = StObject.set(x, "entryId", js.undefined)
    
    @scala.inline
    def setPropertyAlias(value: AssetPropertyAlias): Self = StObject.set(x, "propertyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAliasUndefined: Self = StObject.set(x, "propertyAlias", js.undefined)
    
    @scala.inline
    def setPropertyId(value: AssetPropertyId): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    @scala.inline
    def setPropertyValues(value: AssetPropertyValueList): Self = StObject.set(x, "propertyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyValuesVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "propertyValues", js.Array(value :_*))
  }
}
