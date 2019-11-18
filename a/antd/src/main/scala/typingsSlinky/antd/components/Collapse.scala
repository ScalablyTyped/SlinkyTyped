package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esCollapseCollapseMod.CollapseProps
import typingsSlinky.antd.esCollapseCollapseMod.ExpandIconPosition
import typingsSlinky.antd.esCollapseCollapseMod.PanelProps
import typingsSlinky.antd.esCollapseMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, onChange */
object Collapse
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esCollapseMod.default].asInstanceOf[String | js.Object]
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: (js.Array[String | Double]) | String | Double = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    defaultActiveKey: (js.Array[String | Double]) | String | Double = null,
    destroyInactivePanel: js.UndefOr[Boolean] = js.undefined,
    expandIcon: /* panelProps */ PanelProps => TagMod[Any] = null,
    expandIconPosition: ExpandIconPosition = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactivePanel)) __obj.updateDynamic("destroyInactivePanel")(destroyInactivePanel.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CollapseProps
}

