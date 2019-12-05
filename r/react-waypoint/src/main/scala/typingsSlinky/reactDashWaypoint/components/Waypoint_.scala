package typingsSlinky.reactDashWaypoint.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashWaypoint.reactDashWaypointMod.Waypoint.CallbackArgs
import typingsSlinky.reactDashWaypoint.reactDashWaypointMod.Waypoint.WaypointProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Waypoint_
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashWaypoint.reactDashWaypointMod.Waypoint_] {
  @JSImport("react-waypoint", "Waypoint")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    bottomOffset: String | Double = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    fireOnRapidScroll: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    onEnter: /* args */ CallbackArgs => Unit = null,
    onLeave: /* args */ CallbackArgs => Unit = null,
    onPositionChange: /* args */ CallbackArgs => Unit = null,
    scrollableAncestor: js.Any = null,
    topOffset: String | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashWaypoint.reactDashWaypointMod.Waypoint_] = {
    val __obj = js.Dynamic.literal()
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnRapidScroll)) __obj.updateDynamic("fireOnRapidScroll")(fireOnRapidScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onLeave != null) __obj.updateDynamic("onLeave")(js.Any.fromFunction1(onLeave))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1(onPositionChange))
    if (scrollableAncestor != null) __obj.updateDynamic("scrollableAncestor")(scrollableAncestor.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = WaypointProps
}

