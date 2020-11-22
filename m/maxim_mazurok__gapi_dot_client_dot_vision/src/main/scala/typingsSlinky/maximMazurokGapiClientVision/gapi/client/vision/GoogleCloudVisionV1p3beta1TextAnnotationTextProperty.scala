package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1TextAnnotationTextProperty extends js.Object {
  
  /** Detected start or end of a text segment. */
  var detectedBreak: js.UndefOr[GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak] = js.native
  
  /** A list of detected languages together with confidence. */
  var detectedLanguages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]] = js.native
}
object GoogleCloudVisionV1p3beta1TextAnnotationTextProperty {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1TextAnnotationTextProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1TextAnnotationTextProperty]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1TextAnnotationTextPropertyOps[Self <: GoogleCloudVisionV1p3beta1TextAnnotationTextProperty] (val x: Self) extends AnyVal {
    
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
    def setDetectedBreak(value: GoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak): Self = this.set("detectedBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedBreak: Self = this.set("detectedBreak", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage*): Self = this.set("detectedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[GoogleCloudVisionV1p3beta1TextAnnotationDetectedLanguage]): Self = this.set("detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedLanguages: Self = this.set("detectedLanguages", js.undefined)
  }
}
