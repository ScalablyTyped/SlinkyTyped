package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2ImageLocation extends js.Object {
  
  /** Bounding boxes locating the pixels within the image containing the finding. */
  var boundingBoxes: js.UndefOr[js.Array[GooglePrivacyDlpV2BoundingBox]] = js.native
}
object GooglePrivacyDlpV2ImageLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ImageLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ImageLocationOps[Self <: GooglePrivacyDlpV2ImageLocation] (val x: Self) extends AnyVal {
    
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
    def setBoundingBoxesVarargs(value: GooglePrivacyDlpV2BoundingBox*): Self = this.set("boundingBoxes", js.Array(value :_*))
    
    @scala.inline
    def setBoundingBoxes(value: js.Array[GooglePrivacyDlpV2BoundingBox]): Self = this.set("boundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundingBoxes: Self = this.set("boundingBoxes", js.undefined)
  }
}
