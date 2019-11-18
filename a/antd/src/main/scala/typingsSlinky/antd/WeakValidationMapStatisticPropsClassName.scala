package typingsSlinky.antd

import slinky.core.TagMod
import typingsSlinky.antd.libStatisticUtilsMod.Formatter
import typingsSlinky.antd.libStatisticUtilsMod.valueType
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/statistic/Statistic.StatisticProps> */
trait WeakValidationMapStatisticPropsClassName extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var decimalSeparator: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var formatter: js.UndefOr[Validator[js.UndefOr[Formatter | Null]]] = js.undefined
  var groupSeparator: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var precision: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var prefix: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var suffix: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.undefined
  var title: js.UndefOr[Validator[js.UndefOr[Null | TagMod[Any]]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[Null | valueType]]] = js.undefined
  var valueRender: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* node */ TagMod[Any], TagMod[Any]]) | Null]]
  ] = js.undefined
  var valueStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapStatisticPropsClassName {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    decimalSeparator: Validator[js.UndefOr[Null | String]] = null,
    formatter: Validator[js.UndefOr[Formatter | Null]] = null,
    groupSeparator: Validator[js.UndefOr[Null | String]] = null,
    precision: Validator[js.UndefOr[Double | Null]] = null,
    prefix: Validator[js.UndefOr[Null | TagMod[Any]]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    suffix: Validator[js.UndefOr[Null | TagMod[Any]]] = null,
    title: Validator[js.UndefOr[Null | TagMod[Any]]] = null,
    value: Validator[js.UndefOr[Null | valueType]] = null,
    valueRender: Validator[js.UndefOr[(js.Function1[/* node */ TagMod[Any], TagMod[Any]]) | Null]] = null,
    valueStyle: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapStatisticPropsClassName = {
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
    if (valueRender != null) __obj.updateDynamic("valueRender")(valueRender.asInstanceOf[js.Any])
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapStatisticPropsClassName]
  }
}

