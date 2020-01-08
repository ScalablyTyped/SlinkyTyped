package typingsSlinky.reactDashNativeDashQrcode.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashQrcode.reactDashNativeDashQrcodeMod.QRCodeProperties
import typingsSlinky.reactDashNativeDashQrcode.reactDashNativeDashQrcodeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashQrcode
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-qrcode", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: size */
  def apply(
    bgColor: String = null,
    fgColor: String = null,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashNativeDashQrcode.reactDashNativeDashQrcodeMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = QRCodeProperties
}

