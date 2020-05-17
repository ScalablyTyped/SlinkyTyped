package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.CameraComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Used to add and remove {@link pc.CameraComponent}s from Entities. It also holds an
  * array of all active cameras.
  * @description Create a new CameraComponentSystem.
  * @param {pc.Application} app - The Application.
  * @property {pc.CameraComponent[]} cameras Holds all the active camera components.
  */
@JSGlobal("pc.CameraComponentSystem")
@js.native
class CameraComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.CameraComponentSystem {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}

