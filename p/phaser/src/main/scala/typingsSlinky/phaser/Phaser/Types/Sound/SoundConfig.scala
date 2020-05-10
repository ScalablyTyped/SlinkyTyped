package typingsSlinky.phaser.Phaser.Types.Sound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config object containing various sound settings.
  */
@js.native
trait SoundConfig extends js.Object {
  /**
    * Time, in seconds, that should elapse before the sound actually starts its playback.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Represents detuning of sound in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
    */
  var detune: js.UndefOr[Double] = js.native
  /**
    * Whether or not the sound or current sound marker should loop.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Boolean indicating whether the sound should be muted or not.
    */
  var mute: js.UndefOr[Boolean] = js.native
  /**
    * Defines the speed at which the sound should be played.
    */
  var rate: js.UndefOr[Double] = js.native
  /**
    * Position of playback for this sound, in seconds.
    */
  var seek: js.UndefOr[Double] = js.native
  /**
    * A value between 0 (silence) and 1 (full volume).
    */
  var volume: js.UndefOr[Double] = js.native
}

object SoundConfig {
  @scala.inline
  def apply(): SoundConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoundConfig]
  }
  @scala.inline
  implicit class SoundConfigOps[Self <: SoundConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withDetune(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetune: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detune")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
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
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withSeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seek")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

