package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItem.base", JSImport.Namespace)
@js.native
object contextualMenuItemBaseMod extends js.Object {
  
  @js.native
  class ContextualMenuItemBase protected ()
    extends Component[IContextualMenuItemProps, js.Object, js.Any] {
    def this(props: IContextualMenuItemProps) = this()
    
    var _renderLayout: js.Any = js.native
    
    def dismissMenu(): Unit = js.native
    def dismissMenu(dismissAll: Boolean): Unit = js.native
    
    def dismissSubMenu(): Unit = js.native
    
    def openSubMenu(): Unit = js.native
  }
}
