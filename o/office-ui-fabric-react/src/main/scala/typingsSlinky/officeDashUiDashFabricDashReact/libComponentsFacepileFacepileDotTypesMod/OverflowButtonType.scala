package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowButtonType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
@js.native
object OverflowButtonType extends js.Object {
  /** +1 overflow icon */
  @js.native
  sealed trait descriptive extends OverflowButtonType
  
  /** Chevron overflow icon */
  @js.native
  sealed trait downArrow extends OverflowButtonType
  
  /** More overflow icon */
  @js.native
  sealed trait more extends OverflowButtonType
  
  /** No overflow */
  @js.native
  sealed trait none extends OverflowButtonType
  
  /* 1 */ val descriptive: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.descriptive with Double = js.native
  /* 3 */ val downArrow: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.downArrow with Double = js.native
  /* 2 */ val more: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.more with Double = js.native
  /* 0 */ val none: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowButtonType with Double] = js.native
}

