package typingsSlinky.playcanvas.global.pc

import typingsSlinky.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.Sound} resources.
  * @param manager - The sound manager.
  */
@JSGlobal("pc.AudioHandler")
@js.native
class AudioHandler protected () extends ResourceHandler {
  def this(manager: typingsSlinky.playcanvas.pc.SoundManager) = this()
}
