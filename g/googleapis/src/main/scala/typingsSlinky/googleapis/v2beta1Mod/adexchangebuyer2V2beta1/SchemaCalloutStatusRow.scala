package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The number of impressions with the specified dimension values where the
  * corresponding bid request or bid response was not successful, as described
  * by the specified callout status.
  */
@js.native
trait SchemaCalloutStatusRow extends StObject {
  
  /**
    * The ID of the callout status. See
    * [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[Double] = js.native
  
  /**
    * The number of impressions for which there was a bid request or bid
    * response with the specified callout status.
    */
  var impressionCount: js.UndefOr[SchemaMetricValue] = js.native
  
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[SchemaRowDimensions] = js.native
}
object SchemaCalloutStatusRow {
  
  @scala.inline
  def apply(): SchemaCalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalloutStatusRow]
  }
  
  @scala.inline
  implicit class SchemaCalloutStatusRowMutableBuilder[Self <: SchemaCalloutStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutStatusId(value: Double): Self = StObject.set(x, "calloutStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStatusIdUndefined: Self = StObject.set(x, "calloutStatusId", js.undefined)
    
    @scala.inline
    def setImpressionCount(value: SchemaMetricValue): Self = StObject.set(x, "impressionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionCountUndefined: Self = StObject.set(x, "impressionCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: SchemaRowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
