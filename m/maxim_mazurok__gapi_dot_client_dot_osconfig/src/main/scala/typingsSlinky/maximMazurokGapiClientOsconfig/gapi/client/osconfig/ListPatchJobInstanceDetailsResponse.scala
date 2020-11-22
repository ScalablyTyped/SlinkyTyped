package typingsSlinky.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPatchJobInstanceDetailsResponse extends js.Object {
  
  /** A pagination token that can be used to get the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of instance status. */
  var patchJobInstanceDetails: js.UndefOr[js.Array[PatchJobInstanceDetails]] = js.native
}
object ListPatchJobInstanceDetailsResponse {
  
  @scala.inline
  def apply(): ListPatchJobInstanceDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPatchJobInstanceDetailsResponse]
  }
  
  @scala.inline
  implicit class ListPatchJobInstanceDetailsResponseOps[Self <: ListPatchJobInstanceDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPatchJobInstanceDetailsVarargs(value: PatchJobInstanceDetails*): Self = this.set("patchJobInstanceDetails", js.Array(value :_*))
    
    @scala.inline
    def setPatchJobInstanceDetails(value: js.Array[PatchJobInstanceDetails]): Self = this.set("patchJobInstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatchJobInstanceDetails: Self = this.set("patchJobInstanceDetails", js.undefined)
  }
}
