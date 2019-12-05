package typingsSlinky.reactDashLeafletDashSidebarv2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Anchor
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Icon
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Position
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Tab
    ] {
  @JSImport("react-leaflet-sidebarv2", "Tab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled, id */
  def apply(
    header: String,
    icon: Icon,
    active: js.UndefOr[Boolean] = js.undefined,
    anchor: Anchor = null,
    closeIcon: Icon = null,
    onClose: () => Unit = null,
    position: Position = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Tab
  ] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabProps
}

