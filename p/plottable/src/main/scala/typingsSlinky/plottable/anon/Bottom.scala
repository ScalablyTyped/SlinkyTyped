package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.left
import typingsSlinky.plottable.plottableStrings.right
import typingsSlinky.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottom extends StObject {
  
  var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
  
  var left: typingsSlinky.plottable.plottableStrings.left = js.native
  
  var right: typingsSlinky.plottable.plottableStrings.right = js.native
  
  var top: typingsSlinky.plottable.plottableStrings.top = js.native
}
object Bottom {
  
  @scala.inline
  def apply(bottom: bottom, left: left, right: right, top: top): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
