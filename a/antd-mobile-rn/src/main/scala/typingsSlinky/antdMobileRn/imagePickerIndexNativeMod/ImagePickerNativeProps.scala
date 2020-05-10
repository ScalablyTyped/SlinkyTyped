package typingsSlinky.antdMobileRn.imagePickerIndexNativeMod

import typingsSlinky.antdMobileRn.imagePickerPropsTypeMod.ImagePickerPropTypes
import typingsSlinky.antdMobileRn.imagePickerStyleIndexNativeMod.IImagePickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePickerNativeProps extends ImagePickerPropTypes {
  @JSName("styles")
  var styles_ImagePickerNativeProps: js.UndefOr[IImagePickerStyle] = js.native
}

object ImagePickerNativeProps {
  @scala.inline
  def apply(): ImagePickerNativeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerNativeProps]
  }
  @scala.inline
  implicit class ImagePickerNativePropsOps[Self <: ImagePickerNativeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyles(value: IImagePickerStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

