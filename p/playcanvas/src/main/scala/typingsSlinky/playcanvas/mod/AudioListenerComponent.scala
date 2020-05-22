package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create new AudioListenerComponent.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "AudioListenerComponent")
@js.native
class AudioListenerComponent protected ()
  extends typingsSlinky.playcanvas.pc.Component {
  def this(
    system: typingsSlinky.playcanvas.pc.AudioListenerComponentSystem,
    entity: typingsSlinky.playcanvas.pc.Entity
  ) = this()
}

