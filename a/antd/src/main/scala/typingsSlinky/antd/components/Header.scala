package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esCalendarHeaderMod.HeaderProps
import typingsSlinky.antd.esCalendarHeaderMod.RenderHeader
import typingsSlinky.antd.esCalendarHeaderMod.default
import typingsSlinky.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esCalendarHeaderMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: type */
  def apply(
    value: Moment,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => TagMod[Any] = null,
    locale: js.Any = null,
    onTypeChange: /* type */ String => Unit = null,
    onValueChange: /* value */ Moment => Unit = null,
    prefixCls: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    yearSelectOffset: Int | Double = null,
    yearSelectTotal: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onTypeChange != null) __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1(onTypeChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (validRange != null) __obj.updateDynamic("validRange")(validRange.asInstanceOf[js.Any])
    if (yearSelectOffset != null) __obj.updateDynamic("yearSelectOffset")(yearSelectOffset.asInstanceOf[js.Any])
    if (yearSelectTotal != null) __obj.updateDynamic("yearSelectTotal")(yearSelectTotal.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderProps
}

