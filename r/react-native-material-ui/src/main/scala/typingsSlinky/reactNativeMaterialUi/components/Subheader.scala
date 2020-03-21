package typingsSlinky.reactNativeMaterialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactNativeMaterialUi.AnonText
import typingsSlinky.reactNativeMaterialUi.mod.SubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subheader
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Subheader] {
  @JSImport("react-native-material-ui", "Subheader")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    text: String,
    inset: js.UndefOr[Boolean] = js.undefined,
    lines: Int | Double = null,
    style: AnonText = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactNativeMaterialUi.mod.Subheader] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SubheaderProps
}

