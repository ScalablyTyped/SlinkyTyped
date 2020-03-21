package typingsSlinky.reactNativeActionsheet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeActionsheet.mod.ActionSheetCustomProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionSheetCustom
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeActionsheet.mod.ActionSheetCustom] {
  @JSImport("react-native-actionsheet", "ActionSheetCustom")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onPress: Double => Unit,
    options: js.Array[TagMod[Any]],
    buttonUnderlayColor: String = null,
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    styles: js.Object = null,
    tintColor: String = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeActionsheet.mod.ActionSheetCustom] = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
    if (buttonUnderlayColor != null) __obj.updateDynamic("buttonUnderlayColor")(buttonUnderlayColor.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ActionSheetCustomProps
}

