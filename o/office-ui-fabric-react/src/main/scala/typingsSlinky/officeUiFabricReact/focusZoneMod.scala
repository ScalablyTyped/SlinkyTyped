package typingsSlinky.officeUiFabricReact

import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/FocusZone", JSImport.Namespace)
@js.native
object focusZoneMod extends js.Object {
  
  @js.native
  class FocusZone protected ()
    extends typingsSlinky.fluentuiReactFocus.mod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
      * for ref counting to work correctly!
      */
    var _onKeyDownCapture: js.Any = js.native
    
    var defaultProps: IFocusZoneProps = js.native
    
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
  @js.native
  object FocusZoneDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection with Double
      ] = js.native
    
    /* 2 */ val bidirectional: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    
    /* 3 */ val domOrder: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.domOrder with Double = js.native
    
    /* 1 */ val horizontal: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.horizontal with Double = js.native
    
    /* 0 */ val vertical: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.vertical with Double = js.native
  }
  
  @js.native
  object FocusZoneTabbableElements extends js.Object {
    
    /** All tabbing action is allowed */
    var all: `1` = js.native
    
    /** Tabbing is allowed only on input elements */
    var inputOnly: `2` = js.native
    
    /** Tabbing is not allowed */
    var none: `0` = js.native
  }
}
