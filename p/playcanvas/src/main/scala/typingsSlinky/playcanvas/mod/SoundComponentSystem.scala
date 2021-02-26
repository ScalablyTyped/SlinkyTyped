package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a SoundComponentSystem.
  * @property volume - Sets / gets the volume for the entire Sound system. All sounds will have their volume
  * multiplied by this value. Valid between [0, 1].
  * @property context - Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
  * @property manager - Gets / sets the sound manager.
  * @param app - The Application.
  * @param manager - The sound manager.
  */
@JSImport("playcanvas", "SoundComponentSystem")
@js.native
class SoundComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.SoundComponentSystem {
  def this(app: typingsSlinky.playcanvas.pc.Application, manager: typingsSlinky.playcanvas.pc.SoundManager) = this()
}
