package typingsSlinky.babylonjs

import org.scalajs.dom.experimental.mediastream.MediaTrackConstraintSet
import typingsSlinky.std.ConstrainBoolean
import typingsSlinky.std.ConstrainDOMString
import typingsSlinky.std.ConstrainDouble
import typingsSlinky.std.ConstrainULong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  minWidth  :number,   maxWidth  :number,   minHeight  :number,   maxHeight  :number,   deviceId  :string} & std.MediaTrackConstraints */
@js.native
trait minWidthnumbermaxWidthnum extends js.Object {
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.native
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.native
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.native
  var channelCount: js.UndefOr[ConstrainULong] = js.native
  var deviceId: js.UndefOr[String with ConstrainDOMString] = js.native
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.native
  var facingMode: js.UndefOr[ConstrainDOMString] = js.native
  var frameRate: js.UndefOr[ConstrainDouble] = js.native
  var groupId: js.UndefOr[ConstrainDOMString] = js.native
  var height: js.UndefOr[ConstrainULong] = js.native
  var latency: js.UndefOr[ConstrainDouble] = js.native
  var maxHeight: Double = js.native
  var maxWidth: Double = js.native
  var minHeight: Double = js.native
  var minWidth: Double = js.native
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.native
  var resizeMode: js.UndefOr[ConstrainDOMString] = js.native
  var sampleRate: js.UndefOr[ConstrainULong] = js.native
  var sampleSize: js.UndefOr[ConstrainULong] = js.native
  var width: js.UndefOr[ConstrainULong] = js.native
}

object minWidthnumbermaxWidthnum {
  @scala.inline
  def apply(maxHeight: Double, maxWidth: Double, minHeight: Double, minWidth: Double): minWidthnumbermaxWidthnum = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[minWidthnumbermaxWidthnum]
  }
  @scala.inline
  implicit class minWidthnumbermaxWidthnumOps[Self <: minWidthnumbermaxWidthnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvanced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advanced")(js.undefined)
        ret
    }
    @scala.inline
    def withAspectRatio(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoGainControl(value: ConstrainBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGainControl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGainControl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGainControl")(js.undefined)
        ret
    }
    @scala.inline
    def withChannelCount(value: ConstrainULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceId(value: String with ConstrainDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withEchoCancellation(value: ConstrainBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEchoCancellation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("echoCancellation")(js.undefined)
        ret
    }
    @scala.inline
    def withFacingMode(value: ConstrainDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupId(value: ConstrainDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: ConstrainULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLatency(value: ConstrainDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(js.undefined)
        ret
    }
    @scala.inline
    def withNoiseSuppression(value: ConstrainBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoiseSuppression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noiseSuppression")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeMode(value: ConstrainDOMString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleRate(value: ConstrainULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleRate")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSize(value: ConstrainULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: ConstrainULong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

