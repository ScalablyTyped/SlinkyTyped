package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new RigidBodyComponentSystem.
  * @property gravity - The world space vector representing global gravity in the physics simulation.
  * Defaults to [0, -9.81, 0] which is an approximation of the gravitational force on Earth.
  * @param app - The Application.
  */
@JSImport("playcanvas", "RigidBodyComponentSystem")
@js.native
class RigidBodyComponentSystem protected ()
  extends typingsSlinky.playcanvas.pc.RigidBodyComponentSystem {
  def this(app: typingsSlinky.playcanvas.pc.Application) = this()
}
