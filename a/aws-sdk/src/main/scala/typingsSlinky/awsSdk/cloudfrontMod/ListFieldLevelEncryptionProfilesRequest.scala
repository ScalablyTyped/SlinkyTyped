package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
  
  /**
    * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListFieldLevelEncryptionProfilesRequest {
  
  @scala.inline
  def apply(): ListFieldLevelEncryptionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
  }
  
  @scala.inline
  implicit class ListFieldLevelEncryptionProfilesRequestOps[Self <: ListFieldLevelEncryptionProfilesRequest] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
  }
}
