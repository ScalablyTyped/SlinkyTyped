package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esBadgeScrollNumberMod.ScrollNumberProps
import typingsSlinky.antd.esBadgeScrollNumberMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollNumber
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esBadgeScrollNumberMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className */
  def apply(
    component: String = null,
    count: String | Double = null,
    displayComponent: ReactElement = null,
    onAnimated: js.Function = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: String | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (displayComponent != null) __obj.updateDynamic("displayComponent")(displayComponent.asInstanceOf[js.Any])
    if (onAnimated != null) __obj.updateDynamic("onAnimated")(onAnimated.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollNumberProps
}

