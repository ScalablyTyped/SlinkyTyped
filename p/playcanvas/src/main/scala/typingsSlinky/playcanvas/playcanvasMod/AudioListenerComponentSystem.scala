package typingsSlinky.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.AudioListenerComponentSystem
  * @extends pc.ComponentSystem
  * @classdesc Component System for adding and removing {@link pc.AudioComponent} objects to Entities.
  * @description Create a new AudioListenerComponentSystem
  * @param {pc.Application} app The application managing this system.
  * @param {pc.SoundManager} manager A sound manager instance.
  */
@JSImport("playcanvas", "AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.AudioListenerComponentSystem {
  def this(app: typingsSlinky.playcanvas.pc.Application, manager: typingsSlinky.playcanvas.pc.SoundManager) = this()
}

