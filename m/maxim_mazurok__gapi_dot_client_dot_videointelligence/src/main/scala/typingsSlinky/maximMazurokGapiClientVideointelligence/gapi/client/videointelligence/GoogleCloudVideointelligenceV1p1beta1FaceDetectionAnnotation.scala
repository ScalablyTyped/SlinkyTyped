package typingsSlinky.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotation extends js.Object {
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotationOps[Self <: GoogleCloudVideointelligenceV1p1beta1FaceDetectionAnnotation] (val x: Self) extends AnyVal {
    
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
