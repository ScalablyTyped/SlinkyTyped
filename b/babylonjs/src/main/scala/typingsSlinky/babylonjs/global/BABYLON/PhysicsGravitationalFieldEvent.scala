package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a gravitational field event
  */
@JSGlobal("BABYLON.PhysicsGravitationalFieldEvent")
@js.native
class PhysicsGravitationalFieldEvent protected ()
  extends typingsSlinky.babylonjs.BABYLON.PhysicsGravitationalFieldEvent {
  /**
    * Initializes the physics gravitational field event
    * @param _physicsHelper A physics helper
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the gravitational field event
    * @param _options The options for the vortex event
    */
  def this(
    _physicsHelper: typingsSlinky.babylonjs.BABYLON.PhysicsHelper,
    _scene: typingsSlinky.babylonjs.BABYLON.Scene,
    _origin: typingsSlinky.babylonjs.BABYLON.Vector3,
    _options: typingsSlinky.babylonjs.BABYLON.PhysicsRadialExplosionEventOptions
  ) = this()
}

