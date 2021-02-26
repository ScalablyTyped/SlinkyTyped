package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotLight extends ShadowLight {
  
  var _angle: js.Any = js.native
  
  var _computeAngleValues: js.Any = js.native
  
  /**
    * Main function for light texture projection matrix computing.
    */
  /* protected */ def _computeProjectionTextureMatrix(): Unit = js.native
  
  /* protected */ def _computeProjectionTextureProjectionLightMatrix(): Unit = js.native
  
  /* protected */ def _computeProjectionTextureViewLightMatrix(): Unit = js.native
  
  var _cosHalfAngle: js.Any = js.native
  
  var _innerAngle: js.Any = js.native
  
  var _lightAngleOffset: js.Any = js.native
  
  var _lightAngleScale: js.Any = js.native
  
  var _projectionTexture: js.Any = js.native
  
  var _projectionTextureDirty: js.Any = js.native
  
  var _projectionTextureLightFar: Double = js.native
  
  var _projectionTextureLightNear: Double = js.native
  
  var _projectionTextureMatrix: js.Any = js.native
  
  var _projectionTextureProjectionLightDirty: js.Any = js.native
  
  var _projectionTextureProjectionLightMatrix: js.Any = js.native
  
  var _projectionTextureScalingMatrix: js.Any = js.native
  
  var _projectionTextureUpDirection: Vector3 = js.native
  
  var _projectionTextureViewLightDirty: js.Any = js.native
  
  var _projectionTextureViewLightMatrix: js.Any = js.native
  
  var _projectionTextureViewTargetVector: js.Any = js.native
  
  var _shadowAngleScale: js.Any = js.native
  
  /**
    * Gets the cone angle of the spot light in Radians.
    */
  def angle: Double = js.native
  /**
    * Sets the cone angle of the spot light in Radians.
    */
  def angle_=(value: Double): Unit = js.native
  
  /**
    * The light decay speed with the distance from the emission spot.
    */
  var exponent: Double = js.native
  
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  def innerAngle: Double = js.native
  /**
    * Only used in gltf falloff mode, this defines the angle where
    * the directional falloff will start before cutting at angle which could be seen
    * as outer angle.
    */
  def innerAngle_=(value: Double): Unit = js.native
  
  /**
    * Gets the projection texture of the light.
    */
  def projectionTexture: Nullable[BaseTexture] = js.native
  
  /**
    * Gets the far clip of the Spotlight for texture projection.
    */
  def projectionTextureLightFar: Double = js.native
  /**
    * Sets the far clip of the Spotlight for texture projection.
    */
  def projectionTextureLightFar_=(value: Double): Unit = js.native
  
  /**
    * Gets the near clip of the Spotlight for texture projection.
    */
  def projectionTextureLightNear: Double = js.native
  /**
    * Sets the near clip of the Spotlight for texture projection.
    */
  def projectionTextureLightNear_=(value: Double): Unit = js.native
  
  /**
    * Allows reading the projecton texture
    */
  def projectionTextureMatrix: Matrix = js.native
  
  /**
    * Gets the Up vector of the Spotlight for texture projection.
    */
  def projectionTextureUpDirection: Vector3 = js.native
  /**
    * Sets the Up vector of the Spotlight for texture projection.
    */
  def projectionTextureUpDirection_=(value: Vector3): Unit = js.native
  
  /**
    * Sets the projection texture of the light.
    */
  def projectionTexture_=(value: Nullable[BaseTexture]): Unit = js.native
  
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  def shadowAngleScale: Double = js.native
  /**
    * Allows scaling the angle of the light for shadow generation only.
    */
  def shadowAngleScale_=(value: Double): Unit = js.native
}
