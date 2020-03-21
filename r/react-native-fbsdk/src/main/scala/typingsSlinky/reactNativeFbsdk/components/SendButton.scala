package typingsSlinky.reactNativeFbsdk.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeFbsdk.mod.SendButtonProps
import typingsSlinky.reactNativeFbsdk.mod.ShareContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SendButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeFbsdk.mod.SendButton] {
  @JSImport("react-native-fbsdk", "SendButton")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(shareContent: ShareContent, style: ViewStyle = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactNativeFbsdk.mod.SendButton] = {
    val __obj = js.Dynamic.literal(shareContent = shareContent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SendButtonProps
}

