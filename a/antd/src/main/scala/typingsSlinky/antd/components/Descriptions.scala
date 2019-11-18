package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.PartialRecordBreakpointnumber
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.middle
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.antd.esDescriptionsMod.DescriptionsProps
import typingsSlinky.antd.esDescriptionsMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className */
object Descriptions
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esDescriptionsMod.default].asInstanceOf[String | js.Object]
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    colon: js.UndefOr[Boolean] = js.undefined,
    column: Double | PartialRecordBreakpointnumber = null,
    layout: horizontal | vertical = null,
    prefixCls: String = null,
    size: middle | small | typingsSlinky.antd.antdStrings.default = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DescriptionsProps
}

