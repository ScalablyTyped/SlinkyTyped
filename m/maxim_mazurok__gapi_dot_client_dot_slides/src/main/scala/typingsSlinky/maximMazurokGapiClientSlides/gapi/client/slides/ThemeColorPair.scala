package typingsSlinky.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorPair extends StObject {
  
  /** The concrete color corresponding to the theme color type above. */
  var color: js.UndefOr[RgbColor] = js.native
  
  /** The type of the theme color. */
  var `type`: js.UndefOr[String] = js.native
}
object ThemeColorPair {
  
  @scala.inline
  def apply(): ThemeColorPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeColorPair]
  }
  
  @scala.inline
  implicit class ThemeColorPairMutableBuilder[Self <: ThemeColorPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: RgbColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
