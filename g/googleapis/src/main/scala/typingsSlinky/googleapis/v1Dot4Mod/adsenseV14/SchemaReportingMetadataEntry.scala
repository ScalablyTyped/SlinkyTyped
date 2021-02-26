package typingsSlinky.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaReportingMetadataEntry extends StObject {
  
  /**
    * For metrics this is a list of dimension IDs which the metric is
    * compatible with, for dimensions it is a list of compatibility groups the
    * dimension belongs to.
    */
  var compatibleDimensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The names of the metrics the dimension or metric this reporting metadata
    * entry describes is compatible with.
    */
  var compatibleMetrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Unique identifier of this reporting metadata entry, corresponding to the
    * name of the appropriate dimension or metric.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is, in this case adsense#reportingMetadataEntry.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The names of the dimensions which the dimension or metric this reporting
    * metadata entry describes requires to also be present in order for the
    * report to be valid. Omitting these will not cause an error or warning,
    * but may result in data which cannot be correctly interpreted.
    */
  var requiredDimensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The names of the metrics which the dimension or metric this reporting
    * metadata entry describes requires to also be present in order for the
    * report to be valid. Omitting these will not cause an error or warning,
    * but may result in data which cannot be correctly interpreted.
    */
  var requiredMetrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The codes of the projects supported by the dimension or metric this
    * reporting metadata entry describes.
    */
  var supportedProducts: js.UndefOr[js.Array[String]] = js.native
}
object SchemaReportingMetadataEntry {
  
  @scala.inline
  def apply(): SchemaReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportingMetadataEntry]
  }
  
  @scala.inline
  implicit class SchemaReportingMetadataEntryMutableBuilder[Self <: SchemaReportingMetadataEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleDimensions(value: js.Array[String]): Self = StObject.set(x, "compatibleDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleDimensionsUndefined: Self = StObject.set(x, "compatibleDimensions", js.undefined)
    
    @scala.inline
    def setCompatibleDimensionsVarargs(value: String*): Self = StObject.set(x, "compatibleDimensions", js.Array(value :_*))
    
    @scala.inline
    def setCompatibleMetrics(value: js.Array[String]): Self = StObject.set(x, "compatibleMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleMetricsUndefined: Self = StObject.set(x, "compatibleMetrics", js.undefined)
    
    @scala.inline
    def setCompatibleMetricsVarargs(value: String*): Self = StObject.set(x, "compatibleMetrics", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRequiredDimensions(value: js.Array[String]): Self = StObject.set(x, "requiredDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredDimensionsUndefined: Self = StObject.set(x, "requiredDimensions", js.undefined)
    
    @scala.inline
    def setRequiredDimensionsVarargs(value: String*): Self = StObject.set(x, "requiredDimensions", js.Array(value :_*))
    
    @scala.inline
    def setRequiredMetrics(value: js.Array[String]): Self = StObject.set(x, "requiredMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMetricsUndefined: Self = StObject.set(x, "requiredMetrics", js.undefined)
    
    @scala.inline
    def setRequiredMetricsVarargs(value: String*): Self = StObject.set(x, "requiredMetrics", js.Array(value :_*))
    
    @scala.inline
    def setSupportedProducts(value: js.Array[String]): Self = StObject.set(x, "supportedProducts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedProductsUndefined: Self = StObject.set(x, "supportedProducts", js.undefined)
    
    @scala.inline
    def setSupportedProductsVarargs(value: String*): Self = StObject.set(x, "supportedProducts", js.Array(value :_*))
  }
}
