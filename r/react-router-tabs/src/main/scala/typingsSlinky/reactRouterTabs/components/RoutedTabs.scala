package typingsSlinky.reactRouterTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactRouterTabs.mod.RoutedTabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RoutedTabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactRouterTabs.mod.RoutedTabs] {
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    activeTabClassName: String = null,
    activeTabStyle: js.Object = null,
    startPathWith: String = null,
    style: js.Object = null,
    tabClassName: String = null,
    tabStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactRouterTabs.mod.RoutedTabs] = {
    val __obj = js.Dynamic.literal()
    if (activeTabClassName != null) __obj.updateDynamic("activeTabClassName")(activeTabClassName.asInstanceOf[js.Any])
    if (activeTabStyle != null) __obj.updateDynamic("activeTabStyle")(activeTabStyle.asInstanceOf[js.Any])
    if (startPathWith != null) __obj.updateDynamic("startPathWith")(startPathWith.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabClassName != null) __obj.updateDynamic("tabClassName")(tabClassName.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactRouterTabs.mod.RoutedTabs] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactRouterTabs.mod.RoutedTabs](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = RoutedTabsProps
}

