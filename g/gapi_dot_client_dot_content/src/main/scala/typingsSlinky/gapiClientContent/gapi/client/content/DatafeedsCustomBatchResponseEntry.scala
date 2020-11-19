package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedsCustomBatchResponseEntry extends js.Object {
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The requested data feed. Defined if and only if the request was successful. */
  var datafeed: js.UndefOr[Datafeed] = js.native
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.native
}
object DatafeedsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): DatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class DatafeedsCustomBatchResponseEntryOps[Self <: DatafeedsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    
    @scala.inline
    def setDatafeed(value: Datafeed): Self = this.set("datafeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatafeed: Self = this.set("datafeed", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
}
