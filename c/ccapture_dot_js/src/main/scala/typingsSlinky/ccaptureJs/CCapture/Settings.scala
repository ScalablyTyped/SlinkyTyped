package typingsSlinky.ccaptureJs.CCapture

import typingsSlinky.ccaptureJs.ccaptureJsStrings.ffmpegserver
import typingsSlinky.ccaptureJs.ccaptureJsStrings.gif
import typingsSlinky.ccaptureJs.ccaptureJsStrings.jpg
import typingsSlinky.ccaptureJs.ccaptureJsStrings.png
import typingsSlinky.ccaptureJs.ccaptureJsStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /**
    * It will automatically download the captured data every n seconds (only available for webm/png/jpg)
    */
  var autoSaveTime: js.UndefOr[Double] = js.native
  /**
    * Adds a widget with capturing info
    */
  var display: js.UndefOr[Boolean] = js.native
  var format: webm | gif | png | jpg | ffmpegserver = js.native
  /**
    * Target framerate for the capture
    */
  var framerate: js.UndefOr[Double] = js.native
  /**
    * Super-sampling of frames to create a motion-blurred frame (0 or 1 make no effect)
    */
  var motionBlurFrames: js.UndefOr[Double] = js.native
  /**
    * Name of the files to be exported. if no name is provided, a GUID will be generated
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Quality for webm/jpg
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * Skip to that mark (seconds)
    */
  var startTime: js.UndefOr[Double] = js.native
  /**
    * Automatically stops and downloads when reaching that time (seconds).
    * Very convenient for long captures: set it and forget it (remember autoSaveTime!)
    */
  var timeLimit: js.UndefOr[Double] = js.native
  /**
    * Dumps info on the console
    */
  var verbose: js.UndefOr[Boolean] = js.native
  /**
    * Path to the gif worker script
    */
  var workersPath: js.UndefOr[String] = js.native
}

object Settings {
  @scala.inline
  def apply(format: webm | gif | png | jpg | ffmpegserver): Settings = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: webm | gif | png | jpg | ffmpegserver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoSaveTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSaveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSaveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSaveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(js.undefined)
        ret
    }
    @scala.inline
    def withFramerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFramerate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framerate")(js.undefined)
        ret
    }
    @scala.inline
    def withMotionBlurFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlurFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMotionBlurFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motionBlurFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQuality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quality")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkersPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workersPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkersPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workersPath")(js.undefined)
        ret
    }
  }
  
}

