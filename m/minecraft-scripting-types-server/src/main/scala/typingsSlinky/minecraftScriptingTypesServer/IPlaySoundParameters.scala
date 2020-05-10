package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to play a sound effect. Currently, sounds can only be played at a fixed position in the world. Global sounds and sounds played by an entity will be supported in a later update.
  */
@js.native
trait IPlaySoundParameters extends js.Object {
  /**
    * The pitch of the sound effect. A value of 1.0 will play the sound effect with regular pitch
    * @default 1.0
    */
  var pitch: Double = js.native
  /**
    * The position in the world we want to play the sound at
    * @default [0, 0, 0]
    */
  var position: VectorArray = js.native
  /**
    * The identifier of the sound you want to play. Only sounds defined in the applied resource packs can be played
    */
  var sound: String = js.native
  /**
    * The volume of the sound effect. A value of 1.0 will play the sound effect at the volume it was recorded at
    * @default 1.0
    */
  var volume: Double = js.native
}

object IPlaySoundParameters {
  @scala.inline
  def apply(pitch: Double, position: VectorArray, sound: String, volume: Double): IPlaySoundParameters = {
    val __obj = js.Dynamic.literal(pitch = pitch.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaySoundParameters]
  }
  @scala.inline
  implicit class IPlaySoundParametersOps[Self <: IPlaySoundParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: VectorArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

