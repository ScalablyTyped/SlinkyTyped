package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.A
import typingsSlinky.escpos.escposStrings.ABV
import typingsSlinky.escpos.escposStrings.B
import typingsSlinky.escpos.escposStrings.BLW
import typingsSlinky.escpos.escposStrings.BTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends StObject {
  
  var font: A | B = js.native
  
  var height: Double = js.native
  
  var includeParity: Boolean = js.native
  
  /**
    * OFF, ABOVE, BELOW, BOTH
    *
    * @default BELOW
    */
  var position: typingsSlinky.escpos.escposStrings.OFF | ABV | BLW | BTH = js.native
  
  var width: Double = js.native
}
object Font {
  
  @scala.inline
  def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: typingsSlinky.escpos.escposStrings.OFF | ABV | BLW | BTH,
    width: Double
  ): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], includeParity = includeParity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: A | B): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeParity(value: Boolean): Self = StObject.set(x, "includeParity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: typingsSlinky.escpos.escposStrings.OFF | ABV | BLW | BTH): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
