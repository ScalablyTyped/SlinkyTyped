package typingsSlinky.reactNativeMaps.mod

import typingsSlinky.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeInsets extends StObject {
  
  var bottom: Number = js.native
  
  var left: Number = js.native
  
  var right: Number = js.native
  
  var top: Number = js.native
}
object EdgeInsets {
  
  @scala.inline
  def apply(bottom: Number, left: Number, right: Number, top: Number): EdgeInsets = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeInsets]
  }
  
  @scala.inline
  implicit class EdgeInsetsMutableBuilder[Self <: EdgeInsets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Number): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Number): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Number): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Number): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
