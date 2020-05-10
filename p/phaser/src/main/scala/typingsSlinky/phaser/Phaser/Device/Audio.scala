package typingsSlinky.phaser.Phaser.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines the audio playback capabilities of the device running this Phaser Game instance.
  * These values are read-only and populated during the boot sequence of the game.
  * They are then referenced by internal game systems and are available for you to access
  * via `this.sys.game.device.audio` from within any Scene.
  */
@js.native
trait Audio extends js.Object {
  /**
    * Can this device play HTML Audio tags?
    */
  var audioData: Boolean = js.native
  /**
    * Can this device play EC-3 Dolby Digital Plus files?
    */
  var dolby: Boolean = js.native
  /**
    * Can this device can play m4a files.
    */
  var m4a: Boolean = js.native
  /**
    * Can this device play mp3 files?
    */
  var mp3: Boolean = js.native
  /**
    * Can this device play ogg files?
    */
  var ogg: Boolean = js.native
  /**
    * Can this device play opus files?
    */
  var opus: Boolean = js.native
  /**
    * Can this device play wav files?
    */
  var wav: Boolean = js.native
  /**
    * Does this device have the Web Audio API?
    */
  var webAudio: Boolean = js.native
  /**
    * Can this device play webm files?
    */
  var webm: Boolean = js.native
}

object Audio {
  @scala.inline
  def apply(
    audioData: Boolean,
    dolby: Boolean,
    m4a: Boolean,
    mp3: Boolean,
    ogg: Boolean,
    opus: Boolean,
    wav: Boolean,
    webAudio: Boolean,
    webm: Boolean
  ): Audio = {
    val __obj = js.Dynamic.literal(audioData = audioData.asInstanceOf[js.Any], dolby = dolby.asInstanceOf[js.Any], m4a = m4a.asInstanceOf[js.Any], mp3 = mp3.asInstanceOf[js.Any], ogg = ogg.asInstanceOf[js.Any], opus = opus.asInstanceOf[js.Any], wav = wav.asInstanceOf[js.Any], webAudio = webAudio.asInstanceOf[js.Any], webm = webm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDolby(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dolby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM4a(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m4a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMp3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mp3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOgg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ogg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webm")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

