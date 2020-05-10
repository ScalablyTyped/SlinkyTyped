package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of the Video.
  */
@js.native
trait SchemaVideoProperties extends js.Object {
  /**
    * Whether to enable video autoplay when the page is displayed in present
    * mode. Defaults to false.
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  /**
    * The time at which to end playback, measured in seconds from the beginning
    * of the video. If set, the end time should be after the start time. If not
    * set or if you set this to a value that exceeds the video&#39;s length,
    * the video will be played until its end.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Whether to mute the audio during video playback. Defaults to false.
    */
  var mute: js.UndefOr[Boolean] = js.native
  /**
    * The outline of the video. The default outline matches the defaults for
    * new videos created in the Slides editor.
    */
  var outline: js.UndefOr[SchemaOutline] = js.native
  /**
    * The time at which to start playback, measured in seconds from the
    * beginning of the video. If set, the start time should be before the end
    * time. If you set this to a value that exceeds the video&#39;s length in
    * seconds, the video will be played from the last second. If not set, the
    * video will be played from the beginning.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaVideoProperties {
  @scala.inline
  def apply(): SchemaVideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProperties]
  }
  @scala.inline
  implicit class SchemaVideoPropertiesOps[Self <: SchemaVideoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: SchemaOutline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

