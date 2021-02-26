package typingsSlinky.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for explicit content.
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame extends StObject {
  
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.native
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1ExplicitContentFrameMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1ExplicitContentFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPornographyLikelihood(value: String): Self = StObject.set(x, "pornographyLikelihood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPornographyLikelihoodUndefined: Self = StObject.set(x, "pornographyLikelihood", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
