package typingsSlinky.jqueryToastPlugin

import typingsSlinky.jqueryToastPlugin.jqueryToastPluginStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPosition extends StObject {
  
  var bottom: Double | auto = js.native
  
  var left: Double | auto = js.native
  
  var right: Double | auto = js.native
  
  var top: Double | auto = js.native
}
object CustomPosition {
  
  @scala.inline
  def apply(bottom: Double | auto, left: Double | auto, right: Double | auto, top: Double | auto): CustomPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPosition]
  }
  
  @scala.inline
  implicit class CustomPositionMutableBuilder[Self <: CustomPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double | auto): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double | auto): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double | auto): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double | auto): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
