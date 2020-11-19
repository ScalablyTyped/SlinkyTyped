package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/selection/interfaces", JSImport.Namespace)
@js.native
object selectionInterfacesMod extends js.Object {
  
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @js.native
  object SelectionDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection with Double] = js.native
    
    /* 0 */ val horizontal: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal with Double = js.native
    
    /* 1 */ val vertical: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical with Double = js.native
  }
  
  @js.native
  object SelectionMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode with Double] = js.native
    
    /* 2 */ val multiple: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.multiple with Double = js.native
    
    /* 0 */ val none: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.none with Double = js.native
    
    /* 1 */ val single: typingsSlinky.uifabricUtilities.selectionTypesMod.SelectionMode.single with Double = js.native
  }
}
