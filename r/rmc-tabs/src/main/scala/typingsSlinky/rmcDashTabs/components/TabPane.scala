package typingsSlinky.rmcDashTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcDashTabs.libTabPaneMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPane
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.rmcDashTabs.libTabPaneMod.TabPane] {
  @JSImport("rmc-tabs/lib/TabPane", "TabPane")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    active: Boolean,
    fixX: js.UndefOr[Boolean] = js.undefined,
    fixY: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.rmcDashTabs.libTabPaneMod.TabPane] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (!js.isUndefined(fixX)) __obj.updateDynamic("fixX")(fixX.asInstanceOf[js.Any])
    if (!js.isUndefined(fixY)) __obj.updateDynamic("fixY")(fixY.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropsType
}

