package typingsSlinky.reactNativeShare.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNativeShare.mod.ShareSheetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShareSheet
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeShare.mod.ShareSheet] {
  @JSImport("react-native-share", "ShareSheet")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onCancel: () => Unit,
    visible: Boolean,
    overlayStyle: StyleProp[ViewProps] = null,
    style: StyleProp[ViewProps] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeShare.mod.ShareSheet] = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), visible = visible.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ShareSheetProps
}

