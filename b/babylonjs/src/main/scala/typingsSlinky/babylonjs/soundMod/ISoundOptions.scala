package typingsSlinky.babylonjs.soundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISoundOptions extends js.Object {
  /**
    * Does the sound autoplay once loaded.
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  /**
    * Define the distance attenuation model the sound will follow.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var distanceModel: js.UndefOr[String] = js.native
  /**
    * Defines an optional length (in seconds) inside the sound file
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Does the sound loop after it finishes playing once.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Maximum distance to hear that sound
    */
  var maxDistance: js.UndefOr[Double] = js.native
  /**
    * Defines an optional offset (in seconds) inside the sound file
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Defines the playback speed (1 by default)
    */
  var playbackRate: js.UndefOr[Double] = js.native
  /**
    * Define the reference distance the sound should be heard perfectly.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var refDistance: js.UndefOr[Double] = js.native
  /**
    * Define the roll off factor of spatial sounds.
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music#creating-a-spatial-3d-sound
    */
  var rolloffFactor: js.UndefOr[Double] = js.native
  /**
    * If true, URLs will not be required to state the audio file codec to use.
    */
  var skipCodecCheck: js.UndefOr[Boolean] = js.native
  /**
    * Is it a spatial sound?
    */
  var spatialSound: js.UndefOr[Boolean] = js.native
  /**
    * Defines if the sound is from a streaming source
    */
  var streaming: js.UndefOr[Boolean] = js.native
  /**
    * Uses user defined attenuation function
    */
  var useCustomAttenuation: js.UndefOr[Boolean] = js.native
  /**
    * Sound's volume
    */
  var volume: js.UndefOr[Double] = js.native
}

object ISoundOptions {
  @scala.inline
  def apply(): ISoundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundOptions]
  }
  @scala.inline
  implicit class ISoundOptionsOps[Self <: ISoundOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
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
    def withMaxDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaybackRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaybackRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRefDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withRolloffFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloffFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloffFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloffFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCodecCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCodecCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCodecCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCodecCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialSound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialSound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialSound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialSound")(js.undefined)
        ret
    }
    @scala.inline
    def withStreaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streaming")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCustomAttenuation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomAttenuation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCustomAttenuation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomAttenuation")(js.undefined)
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

