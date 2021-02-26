package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDimensionPropertiesRequest extends StObject {
  
  /** The columns on a data source sheet to update. */
  var dataSourceSheetRange: js.UndefOr[DataSourceSheetDimensionRange] = js.native
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `properties` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.native
  
  /** Properties to update. */
  var properties: js.UndefOr[DimensionProperties] = js.native
  
  /** The rows or columns to update. */
  var range: js.UndefOr[DimensionRange] = js.native
}
object UpdateDimensionPropertiesRequest {
  
  @scala.inline
  def apply(): UpdateDimensionPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDimensionPropertiesRequest]
  }
  
  @scala.inline
  implicit class UpdateDimensionPropertiesRequestMutableBuilder[Self <: UpdateDimensionPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceSheetRange(value: DataSourceSheetDimensionRange): Self = StObject.set(x, "dataSourceSheetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceSheetRangeUndefined: Self = StObject.set(x, "dataSourceSheetRange", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setProperties(value: DimensionProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRange(value: DimensionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
