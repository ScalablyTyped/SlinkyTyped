package typingsSlinky.playcanvas.mod

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AudioHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler used for loading {@link pc.Sound} resources.
  * @param {pc.SoundManager} manager - The sound manager.
  */
@JSImport("playcanvas", "AudioHandler")
@js.native
class AudioHandler protected () extends ResourceHandler {
  def this(manager: typingsSlinky.playcanvas.pc.SoundManager) = this()
}

