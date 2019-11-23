package typingsSlinky.reactDashNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.PickerIOSItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerIOSItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.PickerIOSItem] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.reactDashNative.reactDashNativeMod.PickerIOSItem].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: value */
  def apply(label: String = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashNative.reactDashNativeMod.PickerIOSItem] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PickerIOSItemProps
}

