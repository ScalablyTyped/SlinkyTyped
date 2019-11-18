package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.EventTarget
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Tabs.TabsProps
import typingsSlinky.materialDashUi.tabsMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.tabsMod.default].asInstanceOf[String | js.Object]
  def apply(
    contentContainerClassName: String = null,
    contentContainerStyle: CSSProperties = null,
    initialSelectedIndex: Int | Double = null,
    inkBarStyle: CSSProperties = null,
    onChange: (/* value */ js.Any, SyntheticEvent[EventTarget with js.Object, org.scalajs.dom.raw.Event], /* tab */ typingsSlinky.materialDashUi.__MaterialUI.Tabs.Tab) => Unit = null,
    style: CSSProperties = null,
    tabItemContainerStyle: CSSProperties = null,
    tabTemplate: ReactComponentClass[_] = null,
    tabTemplateStyle: CSSProperties = null,
    value: js.Any = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (contentContainerClassName != null) __obj.updateDynamic("contentContainerClassName")(contentContainerClassName.asInstanceOf[js.Any])
    if (contentContainerStyle != null) __obj.updateDynamic("contentContainerStyle")(contentContainerStyle.asInstanceOf[js.Any])
    if (initialSelectedIndex != null) __obj.updateDynamic("initialSelectedIndex")(initialSelectedIndex.asInstanceOf[js.Any])
    if (inkBarStyle != null) __obj.updateDynamic("inkBarStyle")(inkBarStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabItemContainerStyle != null) __obj.updateDynamic("tabItemContainerStyle")(tabItemContainerStyle.asInstanceOf[js.Any])
    if (tabTemplate != null) __obj.updateDynamic("tabTemplate")(tabTemplate.asInstanceOf[js.Any])
    if (tabTemplateStyle != null) __obj.updateDynamic("tabTemplateStyle")(tabTemplateStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

