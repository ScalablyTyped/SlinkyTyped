package typingsSlinky.reactLeafletSidebarv2.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactLeafletSidebarv2.mod.Icon
import typingsSlinky.reactLeafletSidebarv2.mod.Position
import typingsSlinky.reactLeafletSidebarv2.mod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactLeafletSidebarv2.mod.Sidebar] {
  @JSImport("react-leaflet-sidebarv2", "Sidebar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    collapsed: Boolean,
    id: String,
    position: Position,
    selected: String,
    closeIcon: Icon = null,
    onClose: () => Unit = null,
    onOpen: /* id */ String => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactLeafletSidebarv2.mod.Sidebar] = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1(onOpen))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SidebarProps
}

