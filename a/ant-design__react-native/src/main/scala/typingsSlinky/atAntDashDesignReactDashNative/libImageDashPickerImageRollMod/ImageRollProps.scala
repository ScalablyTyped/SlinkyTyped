package typingsSlinky.atAntDashDesignReactDashNative.libImageDashPickerImageRollMod

import slinky.core.TagMod
import typingsSlinky.atAntDashDesignReactDashNative.libImageDashPickerCameraRollPickerMod.CameraRollPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
  def onCancel(): Unit
  def onSelected(imgObj: js.Object): Unit
}

object ImageRollProps {
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onSelected: js.Object => Unit,
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: TagMod[Any] = null,
    title: TagMod[Any] = null
  ): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollProps]
  }
}

