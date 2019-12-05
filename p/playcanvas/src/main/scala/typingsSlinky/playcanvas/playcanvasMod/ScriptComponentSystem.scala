package typingsSlinky.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptComponentSystem
  * @extends pc.ComponentSystem
  * @description Create a new ScriptComponentSystem
  * @classdesc Allows scripts to be attached to an Entity and executed
  * @param {pc.Application} app The application
  */
@JSImport("playcanvas", "ScriptComponentSystem")
@js.native
class ScriptComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.ScriptComponentSystem {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

