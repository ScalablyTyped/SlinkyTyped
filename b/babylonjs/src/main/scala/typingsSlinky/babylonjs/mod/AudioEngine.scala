package typingsSlinky.babylonjs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  */
class AudioEngine ()
  extends typingsSlinky.babylonjs.legacyMod.AudioEngine {
  def this(hostElement: Nullable[HTMLElement]) = this()
}

