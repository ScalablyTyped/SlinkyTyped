package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnaddressCustomBatchResponse extends js.Object {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ReturnaddressCustomBatchResponseEntry]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#returnaddressCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.native
}
object ReturnaddressCustomBatchResponse {
  
  @scala.inline
  def apply(): ReturnaddressCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchResponse]
  }
  
  @scala.inline
  implicit class ReturnaddressCustomBatchResponseOps[Self <: ReturnaddressCustomBatchResponse] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: ReturnaddressCustomBatchResponseEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[ReturnaddressCustomBatchResponseEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
