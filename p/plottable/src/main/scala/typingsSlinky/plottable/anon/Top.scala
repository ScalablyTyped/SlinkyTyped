package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottom
import typingsSlinky.plottable.plottableStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Top extends StObject {
  
  var bottom: typingsSlinky.plottable.plottableStrings.bottom = js.native
  
  var top: typingsSlinky.plottable.plottableStrings.top = js.native
}
object Top {
  
  @scala.inline
  def apply(bottom: bottom, top: top): Top = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top]
  }
  
  @scala.inline
  implicit class TopMutableBuilder[Self <: Top] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
