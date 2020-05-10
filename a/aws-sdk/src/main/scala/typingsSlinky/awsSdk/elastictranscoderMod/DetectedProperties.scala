package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectedProperties extends js.Object {
  /**
    * The detected duration of the input file, in milliseconds.
    */
  var DurationMillis: js.UndefOr[NullableLong] = js.native
  /**
    * The detected file size of the input file, in bytes.
    */
  var FileSize: js.UndefOr[NullableLong] = js.native
  /**
    * The detected frame rate of the input file, in frames per second.
    */
  var FrameRate: js.UndefOr[FloatString] = js.native
  /**
    * The detected height of the input file, in pixels.
    */
  var Height: js.UndefOr[NullableInteger] = js.native
  /**
    * The detected width of the input file, in pixels.
    */
  var Width: js.UndefOr[NullableInteger] = js.native
}

object DetectedProperties {
  @scala.inline
  def apply(): DetectedProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedProperties]
  }
  @scala.inline
  implicit class DetectedPropertiesOps[Self <: DetectedProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationMillis(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withFileSize(value: NullableLong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: FloatString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FrameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Height")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(js.undefined)
        ret
    }
  }
  
}

