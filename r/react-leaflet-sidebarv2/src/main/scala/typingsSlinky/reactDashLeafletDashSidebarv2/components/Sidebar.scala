package typingsSlinky.reactDashLeafletDashSidebarv2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Icon
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Position
import typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Sidebar
    ] {
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: id */
  def apply(
    collapsed: Boolean,
    position: Position,
    selected: String,
    closeIcon: Icon = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashLeafletDashSidebarv2.reactDashLeafletDashSidebarv2Mod.Sidebar
  ] = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SidebarProps
}

