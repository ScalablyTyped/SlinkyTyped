package typingsSlinky.kendoUi.kendo.mobile.ui

import typingsSlinky.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchEventOptions extends StObject {
  
  var target: js.UndefOr[JQuery] = js.native
  
  var x: js.UndefOr[TouchAxis] = js.native
  
  var y: js.UndefOr[TouchAxis] = js.native
}
object TouchEventOptions {
  
  @scala.inline
  def apply(): TouchEventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventOptions]
  }
  
  @scala.inline
  implicit class TouchEventOptionsMutableBuilder[Self <: TouchEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: JQuery): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setX(value: TouchAxis): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: TouchAxis): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
