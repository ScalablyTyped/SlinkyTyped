package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialBorder
import typingsSlinky.exceljs.anon.PartialBorderDiagonal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Borders extends StObject {
  
  var bottom: PartialBorder = js.native
  
  var diagonal: PartialBorderDiagonal = js.native
  
  var left: PartialBorder = js.native
  
  var right: PartialBorder = js.native
  
  var top: PartialBorder = js.native
}
object Borders {
  
  @scala.inline
  def apply(
    bottom: PartialBorder,
    diagonal: PartialBorderDiagonal,
    left: PartialBorder,
    right: PartialBorder,
    top: PartialBorder
  ): Borders = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], diagonal = diagonal.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borders]
  }
  
  @scala.inline
  implicit class BordersMutableBuilder[Self <: Borders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: PartialBorder): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagonal(value: PartialBorderDiagonal): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: PartialBorder): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: PartialBorder): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: PartialBorder): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
