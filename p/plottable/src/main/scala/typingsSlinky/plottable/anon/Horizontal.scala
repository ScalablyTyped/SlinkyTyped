package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.horizontal
import typingsSlinky.plottable.plottableStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Horizontal extends StObject {
  
  var horizontal: typingsSlinky.plottable.plottableStrings.horizontal = js.native
  
  var vertical: typingsSlinky.plottable.plottableStrings.vertical = js.native
}
object Horizontal {
  
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
  
  @scala.inline
  implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
