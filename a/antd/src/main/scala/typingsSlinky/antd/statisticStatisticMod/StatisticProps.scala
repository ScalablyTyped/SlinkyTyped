package typingsSlinky.antd.statisticStatisticMod

import slinky.core.TagMod
import typingsSlinky.antd.statisticUtilsMod.FormatConfig
import typingsSlinky.antd.statisticUtilsMod.Formatter
import typingsSlinky.antd.statisticUtilsMod.valueType
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticProps extends FormatConfig {
  var className: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[TagMod[Any]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffix: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var value: js.UndefOr[valueType] = js.undefined
  var valueRender: js.UndefOr[js.Function1[/* node */ TagMod[Any], TagMod[Any]]] = js.undefined
  var valueStyle: js.UndefOr[CSSProperties] = js.undefined
}

object StatisticProps {
  @scala.inline
  def apply(
    className: String = null,
    decimalSeparator: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    precision: Int | Double = null,
    prefix: TagMod[Any] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    suffix: TagMod[Any] = null,
    title: TagMod[Any] = null,
    value: valueType = null,
    valueRender: /* node */ TagMod[Any] => TagMod[Any] = null,
    valueStyle: CSSProperties = null
  ): StatisticProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticProps]
  }
}

