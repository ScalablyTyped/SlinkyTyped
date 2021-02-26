package typingsSlinky.officeUiFabricReact

import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFocusZoneMod {
  
  @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZone")
  @js.native
  class FocusZone protected ()
    extends typingsSlinky.officeUiFabricReact.focusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  /* static members */
  object FocusZone {
    
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Handle global tab presses so that we can patch tabindexes on the fly.
      * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
      * for ref counting to work correctly!
      */
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZone._onKeyDownCapture")
    @js.native
    def _onKeyDownCapture: js.Any = js.native
    @scala.inline
    def _onKeyDownCapture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_onKeyDownCapture")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZone.defaultProps")
    @js.native
    def defaultProps: IFocusZoneProps = js.native
    @scala.inline
    def defaultProps_=(x: IFocusZoneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /** Used for testing purposes only. */
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZone.getOuterZones")
    @js.native
    def getOuterZones(): Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZoneDirection")
  @js.native
  object FocusZoneDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection with Double
      ] = js.native
    
    /* 2 */ val bidirectional: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    
    /* 3 */ val domOrder: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.domOrder with Double = js.native
    
    /* 1 */ val horizontal: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.horizontal with Double = js.native
    
    /* 0 */ val vertical: typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.FocusZoneDirection.vertical with Double = js.native
  }
  
  object FocusZoneTabbableElements {
    
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZoneTabbableElements")
    @js.native
    val ^ : js.Any = js.native
    
    /** All tabbing action is allowed */
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZoneTabbableElements.all")
    @js.native
    def all: `1` = js.native
    @scala.inline
    def all_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    /** Tabbing is allowed only on input elements */
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZoneTabbableElements.inputOnly")
    @js.native
    def inputOnly: `2` = js.native
    @scala.inline
    def inputOnly_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputOnly")(x.asInstanceOf[js.Any])
    
    /** Tabbing is not allowed */
    @JSImport("office-ui-fabric-react/lib/FocusZone", "FocusZoneTabbableElements.none")
    @js.native
    def none: `0` = js.native
    @scala.inline
    def none_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
  }
}
