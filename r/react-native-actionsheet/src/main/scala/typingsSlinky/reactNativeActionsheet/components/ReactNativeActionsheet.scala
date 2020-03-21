package typingsSlinky.reactNativeActionsheet.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeActionsheet.mod.ActionSheetProps
import typingsSlinky.reactNativeActionsheet.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeActionsheet
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-actionsheet", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    onPress: Double => Unit,
    options: js.Array[String],
    cancelButtonIndex: Int | Double = null,
    destructiveButtonIndex: Int | Double = null,
    message: String = null,
    tintColor: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), options = options.asInstanceOf[js.Any])
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ActionSheetProps
}

