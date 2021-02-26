package typingsSlinky.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification of which data to aggregate.
  */
@js.native
trait SchemaAggregateBy extends StObject {
  
  /**
    * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only
    * data from the specified data source ID will be included in the
    * aggregation. The dataset in the response will have the same data source
    * ID.
    */
  var dataSourceId: js.UndefOr[String] = js.native
  
  /**
    * The data type to aggregate. All data sources providing this data type
    * will contribute data to the aggregation. The response will contain a
    * single dataset for this data type name. The dataset will have a data
    * source ID of derived:com.google.:com.google.android.gms:aggregated
    */
  var dataTypeName: js.UndefOr[String] = js.native
}
object SchemaAggregateBy {
  
  @scala.inline
  def apply(): SchemaAggregateBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBy]
  }
  
  @scala.inline
  implicit class SchemaAggregateByMutableBuilder[Self <: SchemaAggregateBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    @scala.inline
    def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
  }
}
