package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilteredBidDetailRow extends StObject {
  
  /** The number of bids with the specified detail. */
  var bidCount: js.UndefOr[MetricValue] = js.native
  
  /** The ID of the detail, can be numeric or text. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response message. */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * Note: this field will be deprecated, use "detail" field instead. When "detail" field represents an integer value, this field is populated as the same integer value "detail" field
    * represents, otherwise this field will be 0. The ID of the detail. The associated value can be looked up in the dictionary file corresponding to the DetailType in the response
    * message.
    */
  var detailId: js.UndefOr[Double] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object FilteredBidDetailRow {
  
  @scala.inline
  def apply(): FilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredBidDetailRow]
  }
  
  @scala.inline
  implicit class FilteredBidDetailRowMutableBuilder[Self <: FilteredBidDetailRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidCount(value: MetricValue): Self = StObject.set(x, "bidCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidCountUndefined: Self = StObject.set(x, "bidCount", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailId(value: Double): Self = StObject.set(x, "detailId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailIdUndefined: Self = StObject.set(x, "detailId", js.undefined)
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = StObject.set(x, "rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDimensionsUndefined: Self = StObject.set(x, "rowDimensions", js.undefined)
  }
}
