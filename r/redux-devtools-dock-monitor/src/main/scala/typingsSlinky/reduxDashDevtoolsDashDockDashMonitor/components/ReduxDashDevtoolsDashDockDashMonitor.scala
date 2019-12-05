package typingsSlinky.reduxDashDevtoolsDashDockDashMonitor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashDevtoolsDashDockDashMonitor.reduxDashDevtoolsDashDockDashMonitorMod.DockPosition
import typingsSlinky.reduxDashDevtoolsDashDockDashMonitor.reduxDashDevtoolsDashDockDashMonitorMod.IDockMonitorProps
import typingsSlinky.reduxDashDevtoolsDashDockDashMonitor.reduxDashDevtoolsDashDockDashMonitorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxDashDevtoolsDashDockDashMonitor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("redux-devtools-dock-monitor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    changePositionKey: String,
    toggleVisibilityKey: String,
    changeMonitorKey: String = null,
    defaultIsVisible: js.UndefOr[Boolean] = js.undefined,
    defaultPosition: DockPosition = null,
    defaultSize: Int | Double = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
    if (changeMonitorKey != null) __obj.updateDynamic("changeMonitorKey")(changeMonitorKey.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsVisible)) __obj.updateDynamic("defaultIsVisible")(defaultIsVisible.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IDockMonitorProps
}

