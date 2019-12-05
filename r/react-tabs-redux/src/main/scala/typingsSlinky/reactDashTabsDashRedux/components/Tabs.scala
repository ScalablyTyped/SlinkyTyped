package typingsSlinky.reactDashTabsDashRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTabsDashRedux.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTabsDashRedux.tabsMod.Tabs] {
  @JSImport("react-tabs-redux/Tabs", "Tabs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    activeLinkStyle: js.Object = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Unit = null,
    onChange: (/* selectedTab */ String, /* name */ String) => Unit = null,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTab: String = null,
    visibleTabStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTabsDashRedux.tabsMod.Tabs] = {
    val __obj = js.Dynamic.literal()
    if (activeLinkStyle != null) __obj.updateDynamic("activeLinkStyle")(activeLinkStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2(handleSelect))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (visibleTabStyle != null) __obj.updateDynamic("visibleTabStyle")(visibleTabStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabsProps
}

