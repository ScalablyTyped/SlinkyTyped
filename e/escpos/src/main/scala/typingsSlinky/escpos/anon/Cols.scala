package typingsSlinky.escpos.anon

import typingsSlinky.escpos.escposStrings.CENTER
import typingsSlinky.escpos.escposStrings.LEFT
import typingsSlinky.escpos.escposStrings.RIGHT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cols extends StObject {
  
  var align: LEFT | CENTER | RIGHT = js.native
  
  var cols: Double = js.native
  
  var text: String = js.native
}
object Cols {
  
  @scala.inline
  def apply(align: LEFT | CENTER | RIGHT, cols: Double, text: String): Cols = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  
  @scala.inline
  implicit class ColsMutableBuilder[Self <: Cols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: LEFT | CENTER | RIGHT): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
