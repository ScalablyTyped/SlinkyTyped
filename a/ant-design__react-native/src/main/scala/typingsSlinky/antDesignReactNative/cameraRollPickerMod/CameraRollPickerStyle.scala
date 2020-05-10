package typingsSlinky.antDesignReactNative.cameraRollPickerMod

import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPickerStyle extends js.Object {
  var marker: ViewStyle = js.native
  var row: ViewStyle = js.native
  var spinner: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object CameraRollPickerStyle {
  @scala.inline
  def apply(marker: ViewStyle, row: ViewStyle, spinner: ViewStyle, wrapper: ViewStyle): CameraRollPickerStyle = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerStyle]
  }
  @scala.inline
  implicit class CameraRollPickerStyleOps[Self <: CameraRollPickerStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinner(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWrapper(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

