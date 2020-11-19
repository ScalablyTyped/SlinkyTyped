package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyCamera extends TargetCamera {
  
  /** @hidden */
  def _collideWithWorld(displacement: Vector3): Unit = js.native
  
  var _collider: js.Any = js.native
  
  var _collisionMask: js.Any = js.native
  
  var _diffPosition: js.Any = js.native
  
  /** @hidden */
  var _localDirection: Vector3 = js.native
  
  var _needMoveForGravity: js.Any = js.native
  
  var _newPosition: js.Any = js.native
  
  var _oldPosition: js.Any = js.native
  
  /** @hidden */
  var _onCollisionPositionChange: js.Any = js.native
  
  /**
    * Track Roll to maintain the wanted Rolling when looking around.
    */
  var _trackRoll: Double = js.native
  
  /** @hidden */
  var _transformedDirection: Vector3 = js.native
  
  /**
    * Gets the input sensibility for mouse input.
    * Higher values reduce sensitivity.
    */
  def angularSensibility: Double = js.native
  /**
    * Sets the input sensibility for a mouse input.
    * Higher values reduce sensitivity.
    */
  def angularSensibility_=(value: Double): Unit = js.native
  
  /**
    * Enable or disable gravity on the camera.
    */
  var applyGravity: Boolean = js.native
  
  /**
    * Mimic a banked turn, Rolling the camera when Yawing.
    * It's recommended to use rollCorrect = 10 for faster banking correction.
    */
  var bankedTurn: Boolean = js.native
  
  /**
    * Limit in radians for how much Roll banking will add. (Default: 90°)
    */
  var bankedTurnLimit: Double = js.native
  
  /**
    * Value of 0 disables the banked Roll.
    * Value of 1 is equal to the Yaw angle in radians.
    */
  var bankedTurnMultiplier: Double = js.native
  
  /**
    * Enable or disable collisions of the camera with the rest of the scene objects.
    */
  var checkCollisions: Boolean = js.native
  
  /**
    * Get the mask that the camera ignores in collision events.
    */
  def collisionMask: Double = js.native
  /**
    * Set the mask that the camera ignores in collision events.
    */
  def collisionMask_=(mask: Double): Unit = js.native
  
  /**
    * Define the collision ellipsoid of the camera.
    * This is helpful for simulating a camera body, like a player's body.
    * @see http://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity#arcrotatecamera
    */
  var ellipsoid: Vector3 = js.native
  
  /**
    * Define an offset for the position of the ellipsoid around the camera.
    * This can be helpful if the camera is attached away from the player's body center,
    * such as at its head.
    */
  var ellipsoidOffset: Vector3 = js.native
  
  /**
    * The inputs manager loads all the input sources, such as keyboard and mouse.
    */
  @JSName("inputs")
  var inputs_FlyCamera: FlyCameraInputsManager = js.native
  
  /**
    * Get the keys for camera movement backward.
    */
  def keysBackward: js.Array[Double] = js.native
  def keysBackward_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Get the keys for camera movement down.
    */
  def keysDown: js.Array[Double] = js.native
  /**
    * Set the keys for camera movement down.
    */
  def keysDown_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Get the keys for camera movement forward.
    */
  def keysForward: js.Array[Double] = js.native
  /**
    * Set the keys for camera movement forward.
    */
  def keysForward_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Get the keys for camera movement left.
    */
  def keysLeft: js.Array[Double] = js.native
  /**
    * Set the keys for camera movement left.
    */
  def keysLeft_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Set the keys for camera movement right.
    */
  def keysRight: js.Array[Double] = js.native
  /**
    * Set the keys for camera movement right.
    */
  def keysRight_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Get the keys for camera movement up.
    */
  def keysUp: js.Array[Double] = js.native
  /**
    * Set the keys for camera movement up.
    */
  def keysUp_=(value: js.Array[Double]): Unit = js.native
  
  /**
    * Event raised when the camera collides with a mesh in the scene.
    */
  def onCollide(collidedMesh: AbstractMesh): Unit = js.native
  
  /**
    * Restore the Roll to its target value at the rate specified.
    * @param rate - Higher means slower restoring.
    * @hidden
    */
  def restoreRoll(rate: Double): Unit = js.native
  
  /**
    * Slowly correct the Roll to its original value after a Pitch+Yaw rotation.
    */
  var rollCorrect: Double = js.native
}
