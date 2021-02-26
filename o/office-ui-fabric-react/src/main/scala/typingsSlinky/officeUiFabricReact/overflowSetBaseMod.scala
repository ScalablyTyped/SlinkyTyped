package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSet
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowSetBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/OverflowSet/OverflowSet.base", "OverflowSetBase")
  @js.native
  class OverflowSetBase protected ()
    extends Component[IOverflowSetProps, js.Object, js.Any]
       with IOverflowSet {
    def this(props: IOverflowSetProps) = this()
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MOverflowSetBase(): Unit = js.native
    
    var _classNames: js.Any = js.native
    
    var _divContainer: js.Any = js.native
    
    var _focusZone: js.Any = js.native
    
    /**
      * Gets the subMenu for an overflow item
      * Checks if itemSubMenuProvider has been defined, if not defaults to subMenuProps
      */
    var _getSubMenuForItem: js.Any = js.native
    
    var _keytipManager: js.Any = js.native
    
    var _onRenderItems: js.Any = js.native
    
    var _onRenderOverflowButtonWrapper: js.Any = js.native
    
    var _persistedKeytips: js.Any = js.native
    
    var _registerPersistedKeytips: js.Any = js.native
    
    var _unregisterPersistedKeytips: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MOverflowSetBase(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MOverflowSetBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverflowSetBase(): Unit = js.native
  }
}
