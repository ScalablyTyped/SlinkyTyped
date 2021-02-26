package typingsSlinky.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallaxOptions extends StObject {
  
  /**
    * The minimum width of the screen, in pixels, where the parallax functionality starts working
    * @default 0
    */
  var responsiveThreshold: Double = js.native
}
object ParallaxOptions {
  
  @scala.inline
  def apply(responsiveThreshold: Double): ParallaxOptions = {
    val __obj = js.Dynamic.literal(responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallaxOptions]
  }
  
  @scala.inline
  implicit class ParallaxOptionsMutableBuilder[Self <: ParallaxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponsiveThreshold(value: Double): Self = StObject.set(x, "responsiveThreshold", value.asInstanceOf[js.Any])
  }
}
