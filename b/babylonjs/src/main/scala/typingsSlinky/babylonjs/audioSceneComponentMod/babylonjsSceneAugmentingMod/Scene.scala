package typingsSlinky.babylonjs.audioSceneComponentMod.babylonjsSceneAugmentingMod

import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.soundMod.Sound
import typingsSlinky.babylonjs.soundTrackMod.SoundTrack
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scene extends js.Object {
  /**
    * @hidden
    * Backing field
    */
  var _mainSoundTrack: SoundTrack = js.native
  /**
    * Gets or sets if audio support is enabled
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioEnabled: Boolean = js.native
  /**
    * Gets or sets custom audio listener position provider
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var audioListenerPositionProvider: Nullable[js.Function0[Vector3]] = js.native
  /**
    * Gets or sets a refresh rate when using 3D audio positioning
    */
  var audioPositioningRefreshRate: Double = js.native
  /**
    * Gets or sets if audio will be output to headphones
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var headphone: Boolean = js.native
  /**
    * The main sound track played by the scene.
    * It cotains your primary collection of sounds.
    */
  var mainSoundTrack: SoundTrack = js.native
  /**
    * The list of sound tracks added to the scene
    * @see http://doc.babylonjs.com/how_to/playing_sounds_and_music
    */
  var soundTracks: Nullable[js.Array[SoundTrack]] = js.native
  /**
    * Gets a sound using a given name
    * @param name defines the name to search for
    * @return the found sound or null if not found at all.
    */
  def getSoundByName(name: String): Nullable[Sound] = js.native
}

object Scene {
  @scala.inline
  def apply(
    _mainSoundTrack: SoundTrack,
    audioEnabled: Boolean,
    audioPositioningRefreshRate: Double,
    getSoundByName: String => Nullable[Sound],
    headphone: Boolean,
    mainSoundTrack: SoundTrack
  ): Scene = {
    val __obj = js.Dynamic.literal(_mainSoundTrack = _mainSoundTrack.asInstanceOf[js.Any], audioEnabled = audioEnabled.asInstanceOf[js.Any], audioPositioningRefreshRate = audioPositioningRefreshRate.asInstanceOf[js.Any], getSoundByName = js.Any.fromFunction1(getSoundByName), headphone = headphone.asInstanceOf[js.Any], mainSoundTrack = mainSoundTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
  @scala.inline
  implicit class SceneOps[Self <: Scene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_mainSoundTrack(value: SoundTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mainSoundTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioPositioningRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioPositioningRefreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSoundByName(value: String => Nullable[Sound]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSoundByName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeadphone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headphone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainSoundTrack(value: SoundTrack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainSoundTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudioListenerPositionProvider(value: () => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioListenerPositionProvider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAudioListenerPositionProviderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioListenerPositionProvider")(null)
        ret
    }
    @scala.inline
    def withSoundTracks(value: Nullable[js.Array[SoundTrack]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundTracksNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soundTracks")(null)
        ret
    }
  }
  
}

