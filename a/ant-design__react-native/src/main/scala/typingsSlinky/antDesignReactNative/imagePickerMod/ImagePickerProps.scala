package typingsSlinky.antDesignReactNative.imagePickerMod

import typingsSlinky.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import typingsSlinky.antDesignReactNative.imagePickerPropsTypeMod.ImagePickerPropTypes
import typingsSlinky.antDesignReactNative.imageRollMod.ImageRollTexts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles because var conflicts: styles. Inlined  */ @js.native
trait ImagePickerProps
  extends ImagePickerPropTypes
     with ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.native
}

object ImagePickerProps {
  @scala.inline
  def apply(): ImagePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePickerProps]
  }
  @scala.inline
  implicit class ImagePickerPropsOps[Self <: ImagePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCameraPickerProps(value: CameraRollPickerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraPickerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCameraPickerProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cameraPickerProps")(js.undefined)
        ret
    }
  }
  
}

