package typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning.types", "Position")
@js.native
object Position extends js.Object {
  @js.native
  sealed trait bottom extends Position
  
  @js.native
  sealed trait end extends Position
  
  @js.native
  sealed trait start extends Position
  
  @js.native
  sealed trait top extends Position
  
  /* 1 */ val bottom: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.bottom with Double = js.native
  /* 3 */ val end: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.end with Double = js.native
  /* 2 */ val start: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.start with Double = js.native
  /* 0 */ val top: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.Position.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

