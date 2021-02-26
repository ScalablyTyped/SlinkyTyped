package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.center
import typingsSlinky.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomCenter extends StObject {
  
  var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
  
  var center: typingsSlinky.plottable.plottableStrings.center = js.native
  
  var top: typingsSlinky.plottable.plottableStrings.top = js.native
}
object BottomCenter {
  
  @scala.inline
  def apply(bottom: bottom, center: center, top: top): BottomCenter = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomCenter]
  }
  
  @scala.inline
  implicit class BottomCenterMutableBuilder[Self <: BottomCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
