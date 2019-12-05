package typingsSlinky.reactDashTabsDashRedux.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTabsDashRedux.tabContentMod.TabContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTabsDashRedux.tabContentMod.TabContent] {
  @JSImport("react-tabs-redux/TabContent", "TabContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    `for`: String | Double,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visibleClassName: String = null,
    visibleStyle: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTabsDashRedux.tabContentMod.TabContent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visibleClassName != null) __obj.updateDynamic("visibleClassName")(visibleClassName.asInstanceOf[js.Any])
    if (visibleStyle != null) __obj.updateDynamic("visibleStyle")(visibleStyle.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabContentProps
}

