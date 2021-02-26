package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.left
import typingsSlinky.plottable.plottableStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Center extends StObject {
  
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
  
  var left: typingsSlinky.plottable.plottableStrings.left = js.native
  
  var right: typingsSlinky.plottable.plottableStrings.right = js.native
}
object Center {
  
  @scala.inline
  def apply(center: center, left: left, right: right): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  @scala.inline
  implicit class CenterMutableBuilder[Self <: Center] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
