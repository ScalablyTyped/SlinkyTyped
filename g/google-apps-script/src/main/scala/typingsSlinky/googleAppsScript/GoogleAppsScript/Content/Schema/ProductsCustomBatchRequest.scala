package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsCustomBatchRequest extends js.Object {
  
  var entries: js.UndefOr[js.Array[ProductsCustomBatchRequestEntry]] = js.native
}
object ProductsCustomBatchRequest {
  
  @scala.inline
  def apply(): ProductsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductsCustomBatchRequest]
  }
  
  @scala.inline
  implicit class ProductsCustomBatchRequestOps[Self <: ProductsCustomBatchRequest] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: ProductsCustomBatchRequestEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[ProductsCustomBatchRequestEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
}
