package typingsSlinky.reduxDashDevtoolsDashLogDashMonitor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.base16.base16Mod.ColorScheme
import typingsSlinky.reduxDashDevtoolsDashLogDashMonitor.reduxDashDevtoolsDashLogDashMonitorMod.ILogMonitorProps
import typingsSlinky.reduxDashDevtoolsDashLogDashMonitor.reduxDashDevtoolsDashLogDashMonitorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReduxDashDevtoolsDashLogDashMonitor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("redux-devtools-log-monitor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    expandActionRoot: js.UndefOr[Boolean] = js.undefined,
    expandStateRoot: js.UndefOr[Boolean] = js.undefined,
    preserveScrollTop: js.UndefOr[Boolean] = js.undefined,
    select: /* state */ js.Any => _ = null,
    theme: String | ColorScheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandActionRoot)) __obj.updateDynamic("expandActionRoot")(expandActionRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(expandStateRoot)) __obj.updateDynamic("expandStateRoot")(expandStateRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveScrollTop)) __obj.updateDynamic("preserveScrollTop")(preserveScrollTop.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ILogMonitorProps
}

