package typingsSlinky.phaser.Phaser

import typingsSlinky.phaser.Phaser.Device.Audio
import typingsSlinky.phaser.Phaser.Device.Browser
import typingsSlinky.phaser.Phaser.Device.CanvasFeatures
import typingsSlinky.phaser.Phaser.Device.Features
import typingsSlinky.phaser.Phaser.Device.Fullscreen
import typingsSlinky.phaser.Phaser.Device.OS
import typingsSlinky.phaser.Phaser.Device.Video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConf extends js.Object {
  /**
    * The Audio Device functions.
    */
  var audio: Audio = js.native
  /**
    * The Browser Device functions.
    */
  var browser: Browser = js.native
  /**
    * The Canvas Device functions.
    */
  var canvasFeatures: CanvasFeatures = js.native
  /**
    * The Features Device functions.
    */
  var features: Features = js.native
  /**
    * The Fullscreen Device functions.
    */
  var fullscreen: Fullscreen = js.native
  /**
    * The Input Device functions.
    */
  var input: typingsSlinky.phaser.Phaser.Device.Input = js.native
  /**
    * The OS Device functions.
    */
  var os: OS = js.native
  /**
    * The Video Device functions.
    */
  var video: Video = js.native
}

object DeviceConf {
  @scala.inline
  def apply(
    audio: Audio,
    browser: Browser,
    canvasFeatures: CanvasFeatures,
    features: Features,
    fullscreen: Fullscreen,
    input: typingsSlinky.phaser.Phaser.Device.Input,
    os: OS,
    video: Video
  ): DeviceConf = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], canvasFeatures = canvasFeatures.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConf]
  }
  @scala.inline
  implicit class DeviceConfOps[Self <: DeviceConf] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: Audio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrowser(value: Browser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanvasFeatures(value: CanvasFeatures): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canvasFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatures(value: Features): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullscreen(value: Fullscreen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullscreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: typingsSlinky.phaser.Phaser.Device.Input): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOs(value: OS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Video): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

