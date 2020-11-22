package typingsSlinky.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableVersionsResponse extends js.Object {
  
  /** Represents a list of versions that are supported. */
  var availableVersions: js.UndefOr[js.Array[Version]] = js.native
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListAvailableVersionsResponse {
  
  @scala.inline
  def apply(): ListAvailableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableVersionsResponse]
  }
  
  @scala.inline
  implicit class ListAvailableVersionsResponseOps[Self <: ListAvailableVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setAvailableVersionsVarargs(value: Version*): Self = this.set("availableVersions", js.Array(value :_*))
    
    @scala.inline
    def setAvailableVersions(value: js.Array[Version]): Self = this.set("availableVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableVersions: Self = this.set("availableVersions", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
