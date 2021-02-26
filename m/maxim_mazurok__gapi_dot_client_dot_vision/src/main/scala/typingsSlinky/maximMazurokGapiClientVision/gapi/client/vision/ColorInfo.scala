package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorInfo extends StObject {
  
  /** RGB components of the color. */
  var color: js.UndefOr[Color] = js.native
  
  /** The fraction of pixels the color occupies in the image. Value in range [0, 1]. */
  var pixelFraction: js.UndefOr[Double] = js.native
  
  /** Image-specific score for this color. Value in range [0, 1]. */
  var score: js.UndefOr[Double] = js.native
}
object ColorInfo {
  
  @scala.inline
  def apply(): ColorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorInfo]
  }
  
  @scala.inline
  implicit class ColorInfoMutableBuilder[Self <: ColorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
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
