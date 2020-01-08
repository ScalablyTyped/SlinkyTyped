package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.ghost
import typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnStrings.primary
import typingsSlinky.antdDashMobileDashRn.libResultIndexDotNativeMod.ResultNativeProps
import typingsSlinky.antdDashMobileDashRn.libResultStyleIndexDotNativeMod.IResultStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Result] {
  @JSImport("antd-mobile-rn", "Result")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: TagMod[Any] = null,
    imgUrl: String = null,
    message: TagMod[Any] = null,
    onButtonClick: () => Unit = null,
    style: StyleProp[ViewStyle] = null,
    styles: IResultStyle = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Result] = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction0(onButtonClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Result] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.Result](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ResultNativeProps
}

