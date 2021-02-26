package typingsSlinky.cesium.anon

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstructionsInitiallyVisible extends StObject {
  
  var container: Element | String = js.native
  
  var instructionsInitiallyVisible: js.UndefOr[Boolean] = js.native
}
object InstructionsInitiallyVisible {
  
  @scala.inline
  def apply(container: Element | String): InstructionsInitiallyVisible = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionsInitiallyVisible]
  }
  
  @scala.inline
  implicit class InstructionsInitiallyVisibleMutableBuilder[Self <: InstructionsInitiallyVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElement(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsInitiallyVisible(value: Boolean): Self = StObject.set(x, "instructionsInitiallyVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionsInitiallyVisibleUndefined: Self = StObject.set(x, "instructionsInitiallyVisible", js.undefined)
  }
}
