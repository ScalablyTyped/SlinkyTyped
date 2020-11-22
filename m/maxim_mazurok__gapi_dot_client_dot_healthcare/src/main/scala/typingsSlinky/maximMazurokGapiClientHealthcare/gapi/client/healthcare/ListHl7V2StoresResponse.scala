package typingsSlinky.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHl7V2StoresResponse extends js.Object {
  
  /** The returned HL7v2 stores. Won't be more HL7v2 stores than the value of page_size in the request. */
  var hl7V2Stores: js.UndefOr[js.Array[Hl7V2Store]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListHl7V2StoresResponse {
  
  @scala.inline
  def apply(): ListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHl7V2StoresResponse]
  }
  
  @scala.inline
  implicit class ListHl7V2StoresResponseOps[Self <: ListHl7V2StoresResponse] (val x: Self) extends AnyVal {
    
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
    def setHl7V2StoresVarargs(value: Hl7V2Store*): Self = this.set("hl7V2Stores", js.Array(value :_*))
    
    @scala.inline
    def setHl7V2Stores(value: js.Array[Hl7V2Store]): Self = this.set("hl7V2Stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHl7V2Stores: Self = this.set("hl7V2Stores", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
