package typingsSlinky.antdDashMobileDashRn.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobileDashRn.libImageDashPickerIndexDotNativeMod.ImagePickerNativeProps
import typingsSlinky.antdDashMobileDashRn.libImageDashPickerStyleIndexDotNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImagePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.ImagePicker] {
  @JSImport("antd-mobile-rn", "ImagePicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    files: js.Array[js.Object] = null,
    onAddImageClick: () => Unit = null,
    onChange: (/* files */ js.Array[js.Object], /* operationType */ String, /* index */ js.UndefOr[Double]) => Unit = null,
    onFail: /* msg */ String => Unit = null,
    onImageClick: (/* index */ js.UndefOr[Double], /* files */ js.UndefOr[js.Array[js.Object]]) => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    styles: IImagePickerStyle = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.ImagePicker] = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (onAddImageClick != null) __obj.updateDynamic("onAddImageClick")(js.Any.fromFunction0(onAddImageClick))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onFail != null) __obj.updateDynamic("onFail")(js.Any.fromFunction1(onFail))
    if (onImageClick != null) __obj.updateDynamic("onImageClick")(js.Any.fromFunction2(onImageClick))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.ImagePicker] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antdDashMobileDashRn.antdDashMobileDashRnMod.ImagePicker](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ImagePickerNativeProps
}

