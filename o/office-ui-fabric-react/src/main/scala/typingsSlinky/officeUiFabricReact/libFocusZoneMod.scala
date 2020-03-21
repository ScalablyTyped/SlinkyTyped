package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/FocusZone", JSImport.Namespace)
@js.native
object libFocusZoneMod extends js.Object {
  @js.native
  class FocusZone protected ()
    extends typingsSlinky.officeUiFabricReact.focusZoneMod.FocusZone {
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
    /* 2 */ val bidirectional: typingsSlinky.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.bidirectional with Double = js.native
    /* 3 */ val domOrder: typingsSlinky.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.domOrder with Double = js.native
    /* 1 */ val horizontal: typingsSlinky.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.horizontal with Double = js.native
    /* 0 */ val vertical: typingsSlinky.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection.vertical with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.focusZoneTypesMod.FocusZoneDirection with Double
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

