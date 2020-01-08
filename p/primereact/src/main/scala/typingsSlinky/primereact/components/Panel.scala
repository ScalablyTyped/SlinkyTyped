package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.Anon_Event
import typingsSlinky.primereact.componentsPanelPanelMod.PanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Panel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.panelMod.Panel] {
  @JSImport("primereact/panel", "Panel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    collapseIcon: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    expandIcon: String = null,
    header: js.Any = null,
    onCollapse: /* event */ Event => Unit = null,
    onExpand: /* event */ Event => Unit = null,
    onToggle: /* e */ Anon_Event => Unit = null,
    style: js.Object = null,
    toggleable: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.panelMod.Panel] = {
    val __obj = js.Dynamic.literal()
    if (collapseIcon != null) __obj.updateDynamic("collapseIcon")(collapseIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1(onCollapse))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction1(onExpand))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1(onToggle))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleable)) __obj.updateDynamic("toggleable")(toggleable.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.panelMod.Panel] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.panelMod.Panel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PanelProps
}

