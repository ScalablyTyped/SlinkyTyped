package typingsSlinky.antd

import slinky.core.TagMod
import typingsSlinky.antd.esStatisticUtilsMod.Formatter
import typingsSlinky.antd.esStatisticUtilsMod.valueType
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/es/statistic/Statistic.StatisticProps> */
trait PartialStatisticProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var groupSeparator: js.UndefOr[String] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[TagMod[Any]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffix: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
  var value: js.UndefOr[valueType] = js.undefined
  var valueRender: js.UndefOr[js.Function1[/* node */ TagMod[Any], TagMod[Any]]] = js.undefined
  var valueStyle: js.UndefOr[CSSProperties] = js.undefined
}

object PartialStatisticProps {
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
  ): PartialStatisticProps = {
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
    __obj.asInstanceOf[PartialStatisticProps]
  }
}

