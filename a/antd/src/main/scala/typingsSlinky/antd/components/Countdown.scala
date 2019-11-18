package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esStatisticCountdownMod.CountdownProps
import typingsSlinky.antd.esStatisticCountdownMod.default
import typingsSlinky.antd.esStatisticUtilsMod.Formatter
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, value */
object Countdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esStatisticCountdownMod.default].asInstanceOf[String | js.Object]
  def apply(
    decimalSeparator: String = null,
    format: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    onFinish: () => Unit = null,
    precision: Int | Double = null,
    prefix: TagMod[Any] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    suffix: TagMod[Any] = null,
    title: TagMod[Any] = null,
    valueRender: /* node */ TagMod[Any] => TagMod[Any] = null,
    valueStyle: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CountdownProps
}

