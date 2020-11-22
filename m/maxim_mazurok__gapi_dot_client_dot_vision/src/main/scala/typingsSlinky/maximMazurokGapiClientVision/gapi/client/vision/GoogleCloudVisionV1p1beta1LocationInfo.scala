package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1LocationInfo extends js.Object {
  
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.native
}
object GoogleCloudVisionV1p1beta1LocationInfo {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1LocationInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1LocationInfoOps[Self <: GoogleCloudVisionV1p1beta1LocationInfo] (val x: Self) extends AnyVal {
    
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
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
  }
}
