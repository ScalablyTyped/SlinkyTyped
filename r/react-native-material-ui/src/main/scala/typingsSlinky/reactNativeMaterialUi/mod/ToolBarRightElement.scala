package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolBarRightElement extends StObject {
  
  var actions: js.UndefOr[js.Array[ReactElement | String]] = js.native
  
  var menu: js.UndefOr[Labels] = js.native
}
object ToolBarRightElement {
  
  @scala.inline
  def apply(): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarRightElement]
  }
  
  @scala.inline
  implicit class ToolBarRightElementMutableBuilder[Self <: ToolBarRightElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ReactElement | String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (ReactElement | String)*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setMenu(value: Labels): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
