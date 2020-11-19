package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferOperation extends js.Object {
  
  /** Information about the progress of the transfer operation. */
  var counters: js.UndefOr[TransferCounters] = js.native
  
  /** End time of this transfer execution. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Summarizes errors encountered with sample error log entries. */
  var errorBreakdowns: js.UndefOr[js.Array[ErrorSummary]] = js.native
  
  /** A globally unique ID assigned by the system. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Google Cloud Platform Console project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /** Start time of this transfer execution. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Status of the transfer operation. */
  var status: js.UndefOr[String] = js.native
  
  /** The name of the transfer job that triggers this transfer operation. */
  var transferJobName: js.UndefOr[String] = js.native
  
  /**
    * Transfer specification.
    * Required.
    */
  var transferSpec: js.UndefOr[TransferSpec] = js.native
}
object TransferOperation {
  
  @scala.inline
  def apply(): TransferOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferOperation]
  }
  
  @scala.inline
  implicit class TransferOperationOps[Self <: TransferOperation] (val x: Self) extends AnyVal {
    
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
    def setCounters(value: TransferCounters): Self = this.set("counters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounters: Self = this.set("counters", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setErrorBreakdownsVarargs(value: ErrorSummary*): Self = this.set("errorBreakdowns", js.Array(value :_*))
    
    @scala.inline
    def setErrorBreakdowns(value: js.Array[ErrorSummary]): Self = this.set("errorBreakdowns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorBreakdowns: Self = this.set("errorBreakdowns", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTransferJobName(value: String): Self = this.set("transferJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferJobName: Self = this.set("transferJobName", js.undefined)
    
    @scala.inline
    def setTransferSpec(value: TransferSpec): Self = this.set("transferSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferSpec: Self = this.set("transferSpec", js.undefined)
  }
}
