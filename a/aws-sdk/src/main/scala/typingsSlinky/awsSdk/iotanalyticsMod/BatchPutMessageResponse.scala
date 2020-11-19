package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPutMessageResponse extends js.Object {
  
  /**
    * A list of any errors encountered when sending the messages to the channel.
    */
  var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.native
}
object BatchPutMessageResponse {
  
  @scala.inline
  def apply(): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
  
  @scala.inline
  implicit class BatchPutMessageResponseOps[Self <: BatchPutMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setBatchPutMessageErrorEntriesVarargs(value: BatchPutMessageErrorEntry*): Self = this.set("batchPutMessageErrorEntries", js.Array(value :_*))
    
    @scala.inline
    def setBatchPutMessageErrorEntries(value: BatchPutMessageErrorEntries): Self = this.set("batchPutMessageErrorEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchPutMessageErrorEntries: Self = this.set("batchPutMessageErrorEntries", js.undefined)
  }
}
