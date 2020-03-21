package typingsSlinky.antdMobileRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antdMobileRn.antdMobileRnStrings.closable
import typingsSlinky.antdMobileRn.antdMobileRnStrings.link
import typingsSlinky.antdMobileRn.marqueeNativeMod.MarqueeProps
import typingsSlinky.antdMobileRn.noticeBarIndexNativeMod.NoticeNativeProps
import typingsSlinky.antdMobileRn.noticeBarStyleIndexNativeMod.INoticeBarStyle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdMobileRn.mod.NoticeBar] {
  @JSImport("antd-mobile-rn", "NoticeBar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    marqueeProps: MarqueeProps = null,
    mode: closable | link = null,
    onClick: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: INoticeBarStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.NoticeBar] = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (marqueeProps != null) __obj.updateDynamic("marqueeProps")(marqueeProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.NoticeBar] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antdMobileRn.mod.NoticeBar](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NoticeNativeProps
}

