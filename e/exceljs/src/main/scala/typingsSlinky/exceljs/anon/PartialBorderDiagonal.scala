package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.mod.BorderStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.BorderDiagonal> */
@js.native
trait PartialBorderDiagonal extends StObject {
  
  var color: js.UndefOr[PartialColor] = js.native
  
  var down: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[BorderStyle] = js.native
  
  var up: js.UndefOr[Boolean] = js.native
}
object PartialBorderDiagonal {
  
  @scala.inline
  def apply(): PartialBorderDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBorderDiagonal]
  }
  
  @scala.inline
  implicit class PartialBorderDiagonalMutableBuilder[Self <: PartialBorderDiagonal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setStyle(value: BorderStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
