package typingsSlinky.officeDashUiDashFabricDashReact

import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`0`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`1`
import typingsSlinky.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/FocusZone", JSImport.Namespace)
@js.native
object libFocusZoneMod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneMod.FocusZone {
    def this(props: IFocusZoneProps) = this()
  }
  
  /* static members */
  @js.native
  object FocusZone extends js.Object {
    var defaultProps: IFocusZoneProps = js.native
    /** Used for testing purposes only. */
    def getOuterZones(): Double = js.native
  }
  
  @js.native
  object FocusZoneDirection extends js.Object {
    /* 2 */ val bidirectional: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    /* 3 */ val domOrder: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.domOrder with Double = js.native
    /* 1 */ val horizontal: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.horizontal with Double = js.native
    /* 0 */ val vertical: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.FocusZoneDirection with Double
      ] = js.native
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

