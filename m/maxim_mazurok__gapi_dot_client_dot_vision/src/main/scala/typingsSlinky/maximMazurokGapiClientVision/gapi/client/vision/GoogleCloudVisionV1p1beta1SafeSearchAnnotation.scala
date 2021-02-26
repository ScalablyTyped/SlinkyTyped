package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1SafeSearchAnnotation extends StObject {
  
  /** Represents the adult content likelihood for the image. Adult content may contain elements such as nudity, pornographic images or cartoons, or sexual activities. */
  var adult: js.UndefOr[String] = js.native
  
  /** Likelihood that this is a medical image. */
  var medical: js.UndefOr[String] = js.native
  
  /**
    * Likelihood that the request image contains racy content. Racy content may include (but is not limited to) skimpy or sheer clothing, strategically covered nudity, lewd or provocative
    * poses, or close-ups of sensitive body areas.
    */
  var racy: js.UndefOr[String] = js.native
  
  /** Spoof likelihood. The likelihood that an modification was made to the image's canonical version to make it appear funny or offensive. */
  var spoof: js.UndefOr[String] = js.native
  
  /** Likelihood that this image contains violent content. */
  var violence: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p1beta1SafeSearchAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1SafeSearchAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1SafeSearchAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p1beta1SafeSearchAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdult(value: String): Self = StObject.set(x, "adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdultUndefined: Self = StObject.set(x, "adult", js.undefined)
    
    @scala.inline
    def setMedical(value: String): Self = StObject.set(x, "medical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalUndefined: Self = StObject.set(x, "medical", js.undefined)
    
    @scala.inline
    def setRacy(value: String): Self = StObject.set(x, "racy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRacyUndefined: Self = StObject.set(x, "racy", js.undefined)
    
    @scala.inline
    def setSpoof(value: String): Self = StObject.set(x, "spoof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpoofUndefined: Self = StObject.set(x, "spoof", js.undefined)
    
    @scala.inline
    def setViolence(value: String): Self = StObject.set(x, "violence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolenceUndefined: Self = StObject.set(x, "violence", js.undefined)
  }
}
