package typingsSlinky.antd.libCollapseCollapsePanelMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsePanelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var header: TagMod[Any]
  var id: js.UndefOr[String] = js.undefined
  var key: String | Double
  var prefixCls: js.UndefOr[String] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CollapsePanelProps {
  @scala.inline
  def apply(
    header: TagMod[Any],
    key: String | Double,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: TagMod[Any] = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    prefixCls: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): CollapsePanelProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsePanelProps]
  }
}

