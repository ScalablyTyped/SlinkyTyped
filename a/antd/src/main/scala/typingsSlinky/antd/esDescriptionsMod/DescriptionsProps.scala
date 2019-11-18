package typingsSlinky.antd.esDescriptionsMod

import slinky.core.TagMod
import typingsSlinky.antd.PartialRecordBreakpointnumber
import typingsSlinky.antd.antdStrings.horizontal
import typingsSlinky.antd.antdStrings.middle
import typingsSlinky.antd.antdStrings.small
import typingsSlinky.antd.antdStrings.vertical
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colon: js.UndefOr[Boolean] = js.undefined
  var column: js.UndefOr[Double | PartialRecordBreakpointnumber] = js.undefined
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[middle | small | typingsSlinky.antd.antdStrings.default] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object DescriptionsProps {
  @scala.inline
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    column: Double | PartialRecordBreakpointnumber = null,
    layout: horizontal | vertical = null,
    prefixCls: String = null,
    size: middle | small | typingsSlinky.antd.antdStrings.default = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null
  ): DescriptionsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsProps]
  }
}

