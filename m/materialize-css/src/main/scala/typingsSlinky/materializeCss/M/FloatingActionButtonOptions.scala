package typingsSlinky.materializeCss.M

import typingsSlinky.materializeCss.materializeCssStrings.buttom
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import typingsSlinky.materializeCss.materializeCssStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloatingActionButtonOptions extends StObject {
  
  /**
    * Direction FAB menu opens
    * @default "top"
    */
  var direction: top | right | buttom | left = js.native
  
  /**
    * true: FAB menu appears on hover, false: FAB menu appears on click
    * @default true
    */
  var hoverEnabled: Boolean = js.native
  
  /**
    * Enable transit the FAB into a toolbar on click
    * @default false
    */
  var toolbarEnabled: Boolean = js.native
}
object FloatingActionButtonOptions {
  
  @scala.inline
  def apply(direction: top | right | buttom | left, hoverEnabled: Boolean, toolbarEnabled: Boolean): FloatingActionButtonOptions = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], hoverEnabled = hoverEnabled.asInstanceOf[js.Any], toolbarEnabled = toolbarEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingActionButtonOptions]
  }
  
  @scala.inline
  implicit class FloatingActionButtonOptionsMutableBuilder[Self <: FloatingActionButtonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: top | right | buttom | left): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = StObject.set(x, "hoverEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarEnabled(value: Boolean): Self = StObject.set(x, "toolbarEnabled", value.asInstanceOf[js.Any])
  }
}
