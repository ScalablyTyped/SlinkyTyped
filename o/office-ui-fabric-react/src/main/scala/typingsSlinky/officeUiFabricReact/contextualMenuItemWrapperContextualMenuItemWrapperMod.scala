package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.contextualMenuItemWrapperTypesMod.IContextualMenuItemWrapperProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuItemWrapperContextualMenuItemWrapperMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper/ContextualMenuItemWrapper", "ContextualMenuItemWrapper")
  @js.native
  class ContextualMenuItemWrapper protected ()
    extends Component[IContextualMenuItemWrapperProps, js.Object, js.Any] {
    def this(props: IContextualMenuItemWrapperProps) = this()
    
    /* protected */ def _getSubMenuId(item: IContextualMenuItem): js.UndefOr[String] = js.native
    
    /* protected */ def _getSubmenuTarget(): js.UndefOr[HTMLElement] = js.native
    
    /* protected */ def _onItemClick(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemKeyDown(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseEnter(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseLeave(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    /* protected */ def _onItemMouseMove(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MContextualMenuItemWrapper(newProps: IContextualMenuItemWrapperProps): Boolean = js.native
  }
}
