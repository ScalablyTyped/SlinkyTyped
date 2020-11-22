package typingsSlinky.babylonjs.audioIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.soundTrackMod.ISoundTrackOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Audio/index", "SoundTrack")
@js.native
class SoundTrack protected ()
  extends typingsSlinky.babylonjs.soundTrackMod.SoundTrack {
  /**
    * Creates a new sound track.
    * @see https://doc.babylonjs.com/how_to/playing_sounds_and_music#using-sound-tracks
    * @param scene Define the scene the sound track belongs to
    * @param options
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: ISoundTrackOptions) = this()
}
