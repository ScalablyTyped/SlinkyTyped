package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsSlinky.antdMobileRn.marqueeNativeMod.default
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MarqueeDotnative
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd-mobile-rn/lib/notice-bar/Marquee.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, loop */
  def apply(
    text: TagMod[Any],
    fps: Int | Double = null,
    leading: Int | Double = null,
    maxWidth: Int | Double = null,
    style: StyleProp[TextStyle] = null,
    trailing: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (leading != null) __obj.updateDynamic("leading")(leading.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (trailing != null) __obj.updateDynamic("trailing")(trailing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MarqueeProps
}

