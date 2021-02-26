package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCamera extends Camera {
  
  var _cachedQuaternionRotationZ: js.Any = js.native
  
  var _cachedRotationZ: js.Any = js.native
  
  /** @hidden */
  var _camMatrix: Matrix = js.native
  
  /** @hidden */
  var _cameraRotationMatrix: Matrix = js.native
  
  /** @hidden */
  var _cameraTransformMatrix: Matrix = js.native
  
  /** @hidden */
  def _computeLocalCameraSpeed(): Double = js.native
  
  /* protected */ def _computeViewMatrix(position: Vector3, target: Vector3, up: Vector3): Unit = js.native
  
  /** @hidden */
  var _currentTarget: Vector3 = js.native
  
  /** @hidden */
  def _decideIfNeedsToMove(): Boolean = js.native
  
  var _defaultUp: js.Any = js.native
  
  /** @hidden */
  def _getLockedTargetPosition(): Nullable[Vector3] = js.native
  
  var _getRigCamPositionAndTarget: js.Any = js.native
  
  /** @hidden */
  var _initialFocalDistance: Double = js.native
  
  /** @hidden */
  var _referencePoint: Vector3 = js.native
  
  /** @hidden */
  def _reset(): Unit = js.native
  
  /**
    * Update the up vector to apply the rotation of the camera (So if you changed the camera rotation.z this will let you update the up vector as well)
    * @returns the current camera
    */
  var _rotateUpVectorWithCameraRotationMatrix: js.Any = js.native
  
  var _storedPosition: js.Any = js.native
  
  var _storedRotation: js.Any = js.native
  
  var _storedRotationQuaternion: js.Any = js.native
  
  var _tmpQuaternion: js.Any = js.native
  
  var _tmpTargetVector: js.Any = js.native
  
  var _tmpUpVector: js.Any = js.native
  
  /** @hidden */
  var _transformedReferencePoint: Vector3 = js.native
  
  /** @hidden */
  def _updatePosition(): Unit = js.native
  
  /** @hidden */
  var _viewMatrix: Matrix = js.native
  
  /**
    * Define the current direction the camera is moving to
    */
  var cameraDirection: Vector3 = js.native
  
  /**
    * Define the current rotation the camera is rotating to
    */
  var cameraRotation: Vector2 = js.native
  
  /**
    * Gets the position in front of the camera at a given distance.
    * @param distance The distance from the camera we want the position to be
    * @returns the position
    */
  def getFrontPosition(distance: Double): Vector3 = js.native
  
  /**
    * Return the current target position of the camera. This value is expressed in local space.
    * @returns the target position
    */
  def getTarget(): Vector3 = js.native
  
  /** Gets or sets a boolean indicating that the scaling of the parent hierarchy will not be taken in account by the camera */
  var ignoreParentScaling: Boolean = js.native
  
  /**
    * Speed multiplier for inverse camera panning
    */
  var inverseRotationSpeed: Double = js.native
  
  /**
    * Reverses mouselook direction to 'natural' panning as opposed to traditional direct
    * panning
    */
  var invertRotation: Boolean = js.native
  
  /**
    * Define the current target of the camera as an object or a position.
    */
  var lockedTarget: js.Any = js.native
  
  /**
    * Add constraint to the camera to prevent it to move freely in all directions and
    * around all axis.
    */
  var noRotationConstraint: Boolean = js.native
  
  /**
    * Define the current rotation of the camera
    */
  var rotation: Vector3 = js.native
  
  /**
    * Define the current rotation of the camera as a quaternion to prevent Gimbal lock
    */
  var rotationQuaternion: Quaternion = js.native
  
  /**
    * Defines the target the camera should look at.
    * @param target Defines the new target as a Vector or a mesh
    */
  def setTarget(target: Vector3): Unit = js.native
  
  /**
    * Define the current speed of the camera
    */
  var speed: Double = js.native
  
  /**
    * Defines the target point of the camera.
    * The camera looks towards it form the radius distance.
    */
  def target: Vector3 = js.native
  def target_=(value: Vector3): Unit = js.native
  
  /**
    * When set, the up vector of the camera will be updated by the rotation of the camera
    */
  var updateUpVectorFromRotation: Boolean = js.native
}
