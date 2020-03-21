package typingsSlinky.reactNativeSnackbarComponent.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeSnackbarComponent.mod.SnackbarComponentProps
import typingsSlinky.reactNativeSnackbarComponent.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSnackbarComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-snackbar-component", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    accentColor: String = null,
    actionHandler: () => Unit = null,
    actionText: String = null,
    autoHidingTime: Int | Double = null,
    backgroundColor: String = null,
    bottom: Int | Double = null,
    distanceCallback: () => Unit = null,
    left: Int | Double = null,
    messageColor: String = null,
    position: String = null,
    right: Int | Double = null,
    textMessage: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (actionHandler != null) __obj.updateDynamic("actionHandler")(js.Any.fromFunction0(actionHandler))
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (autoHidingTime != null) __obj.updateDynamic("autoHidingTime")(autoHidingTime.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (distanceCallback != null) __obj.updateDynamic("distanceCallback")(js.Any.fromFunction0(distanceCallback))
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (messageColor != null) __obj.updateDynamic("messageColor")(messageColor.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (textMessage != null) __obj.updateDynamic("textMessage")(textMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactNativeSnackbarComponent.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = SnackbarComponentProps
}

