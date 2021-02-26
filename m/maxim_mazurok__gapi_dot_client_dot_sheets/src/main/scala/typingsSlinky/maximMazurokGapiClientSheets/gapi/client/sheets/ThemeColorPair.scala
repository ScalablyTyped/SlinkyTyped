package typingsSlinky.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeColorPair extends StObject {
  
  /** The concrete color corresponding to the theme color type. */
  var color: js.UndefOr[ColorStyle] = js.native
  
  /** The type of the spreadsheet theme color. */
  var colorType: js.UndefOr[String] = js.native
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
    def setColor(value: ColorStyle): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
