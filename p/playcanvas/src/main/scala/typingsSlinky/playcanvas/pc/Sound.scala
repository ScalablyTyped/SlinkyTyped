package typingsSlinky.playcanvas.pc

import org.scalajs.dom.raw.AudioBuffer
import org.scalajs.dom.raw.HTMLAudioElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Sound
  * @classdesc Represents the resource of an audio asset.
  * @param {HTMLAudioElement|AudioBuffer} resource - If the Web Audio API is supported, pass an AudioBuffer object, otherwise
  * an Audio object.
  * @property {AudioBuffer} buffer If the Web Audio API is supported this contains the audio data.
  * @property {HTMLAudioElement} audio If the Web Audio API is not supported this contains the audio data.
  * @property {number} duration Returns the duration of the sound. If the sound is not loaded it returns 0.
  */
@js.native
trait Sound extends js.Object {
  /**
    * If the Web Audio API is not supported this contains the audio data.
    */
  var audio: HTMLAudioElement = js.native
  /**
    * If the Web Audio API is supported this contains the audio data.
    */
  var buffer: AudioBuffer = js.native
  /**
    * Returns the duration of the sound. If the sound is not loaded it returns 0.
    */
  var duration: Double = js.native
}

object Sound {
  @scala.inline
  def apply(audio: HTMLAudioElement, buffer: AudioBuffer, duration: Double): Sound = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sound]
  }
  @scala.inline
  implicit class SoundOps[Self <: Sound] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudio(value: HTMLAudioElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuffer(value: AudioBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

