package typingsSlinky.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutStatusRow extends js.Object {
  
  /** The ID of the callout status. See [callout-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/callout-status-codes). */
  var calloutStatusId: js.UndefOr[Double] = js.native
  
  /** The number of impressions for which there was a bid request or bid response with the specified callout status. */
  var impressionCount: js.UndefOr[MetricValue] = js.native
  
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.native
}
object CalloutStatusRow {
  
  @scala.inline
  def apply(): CalloutStatusRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalloutStatusRow]
  }
  
  @scala.inline
  implicit class CalloutStatusRowOps[Self <: CalloutStatusRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalloutStatusId(value: Double): Self = this.set("calloutStatusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutStatusId: Self = this.set("calloutStatusId", js.undefined)
    
    @scala.inline
    def setImpressionCount(value: MetricValue): Self = this.set("impressionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionCount: Self = this.set("impressionCount", js.undefined)
    
    @scala.inline
    def setRowDimensions(value: RowDimensions): Self = this.set("rowDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDimensions: Self = this.set("rowDimensions", js.undefined)
  }
}
