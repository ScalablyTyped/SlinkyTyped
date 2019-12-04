package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ButtonProps
import typingsSlinky.reactDashNative.reactDashNativeMod.NativeTouchEvent
import typingsSlinky.reactDashNative.reactDashNativeMod.NodeHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.Button] {
  @JSImport("react-native", "Button")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    onPress: SyntheticEvent[NodeHandle, NativeTouchEvent] => Unit,
    title: String,
    accessibilityLabel: String = null,
    color: String = null,
    testID: String = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.Button] = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress), title = title.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ButtonProps
}

