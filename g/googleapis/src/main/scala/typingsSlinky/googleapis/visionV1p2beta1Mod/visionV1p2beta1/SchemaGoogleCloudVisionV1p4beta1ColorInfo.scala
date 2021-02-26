package typingsSlinky.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Color information consists of RGB channels, score, and the fraction of the
  * image that the color occupies in the image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1ColorInfo extends StObject {
  
  /**
    * RGB components of the color.
    */
  var color: js.UndefOr[SchemaColor] = js.native
  
  /**
    * The fraction of pixels the color occupies in the image. Value in range
    * [0, 1].
    */
  var pixelFraction: js.UndefOr[Double] = js.native
  
  /**
    * Image-specific score for this color. Value in range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1ColorInfo {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ColorInfo]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1ColorInfoMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1ColorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: SchemaColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPixelFraction(value: Double): Self = StObject.set(x, "pixelFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelFractionUndefined: Self = StObject.set(x, "pixelFraction", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
