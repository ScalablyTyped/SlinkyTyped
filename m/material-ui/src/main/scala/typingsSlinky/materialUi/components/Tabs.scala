package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Tabs.TabsProps
import typingsSlinky.materialUi.tabsMod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("material-ui/Tabs", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    contentContainerClassName: String = null,
    contentContainerStyle: CSSProperties = null,
    initialSelectedIndex: Int | Double = null,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, SyntheticEvent[EventTarget with js.Object, Event_], /* tab */ typingsSlinky.materialUi.MaterialUI.Tabs.Tab) => Unit = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ReactComponentClass[_] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUi.tabsMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabsProps
}

