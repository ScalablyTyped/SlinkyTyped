package typingsSlinky.reactBootstrapTable.mod

import typingsSlinky.reactBootstrapTable.anon.ButtonGroupPropssearchPan
import typingsSlinky.reactBootstrapTable.anon.CloseInsertModal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarProps extends StObject {
  
  /**
    * Rendered components to use in the toolbar.
    */
  var components: ButtonGroupPropssearchPan = js.native
  
  /**
    * Event callbacks to use with a custom toolbar.
    */
  var event: CloseInsertModal = js.native
}
object ToolBarProps {
  
  @scala.inline
  def apply(components: ButtonGroupPropssearchPan, event: CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarProps]
  }
  
  @scala.inline
  implicit class ToolBarPropsMutableBuilder[Self <: ToolBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: ButtonGroupPropssearchPan): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: CloseInsertModal): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
