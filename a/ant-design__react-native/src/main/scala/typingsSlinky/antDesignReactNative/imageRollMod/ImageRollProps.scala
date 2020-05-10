package typingsSlinky.antDesignReactNative.imageRollMod

import typingsSlinky.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.native
  def onCancel(): Unit = js.native
  def onSelected(imgObj: js.Object): Unit = js.native
}

object ImageRollProps {
  @scala.inline
  def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    __obj.asInstanceOf[ImageRollProps]
  }
  @scala.inline
  implicit class ImageRollPropsOps[Self <: ImageRollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnSelected(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelected")(js.Any.fromFunction1(value))
        ret
    }
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

