package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a physics updraft event
  */
@JSGlobal("BABYLON.PhysicsUpdraftEvent")
@js.native
class PhysicsUpdraftEvent protected ()
  extends typingsSlinky.babylonjs.BABYLON.PhysicsUpdraftEvent {
  /**
    * Initializes the physics updraft event
    * @param _scene BabylonJS scene
    * @param _origin The origin position of the updraft
    * @param _options The options for the updraft event
    */
  def this(
    _scene: typingsSlinky.babylonjs.BABYLON.Scene,
    _origin: typingsSlinky.babylonjs.BABYLON.Vector3,
    _options: typingsSlinky.babylonjs.BABYLON.PhysicsUpdraftEventOptions
  ) = this()
}
