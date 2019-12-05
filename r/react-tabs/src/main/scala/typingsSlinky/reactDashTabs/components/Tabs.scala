package typingsSlinky.reactDashTabs.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTabs.reactDashTabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.Tabs] {
  @JSImport("react-tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    className: String | js.Array[String] | StringDictionary[Boolean] = null,
    defaultFocus: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    disabledTabClassName: String = null,
    domRef: /* node */ js.UndefOr[HTMLElement] => Unit = null,
    forceRenderTabPanel: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* index */ Double, /* last */ Double, /* event */ Event) => Boolean | Unit = null,
    selectedIndex: Int | Double = null,
    selectedTabClassName: String = null,
    selectedTabPanelClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.Tabs] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultFocus)) __obj.updateDynamic("defaultFocus")(defaultFocus.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (disabledTabClassName != null) __obj.updateDynamic("disabledTabClassName")(disabledTabClassName.asInstanceOf[js.Any])
    if (domRef != null) __obj.updateDynamic("domRef")(js.Any.fromFunction1(domRef))
    if (!js.isUndefined(forceRenderTabPanel)) __obj.updateDynamic("forceRenderTabPanel")(forceRenderTabPanel.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction3(onSelect))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTabClassName != null) __obj.updateDynamic("selectedTabClassName")(selectedTabClassName.asInstanceOf[js.Any])
    if (selectedTabPanelClassName != null) __obj.updateDynamic("selectedTabPanelClassName")(selectedTabPanelClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

