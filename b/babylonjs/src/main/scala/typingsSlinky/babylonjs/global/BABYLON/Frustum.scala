package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Frustum")
@js.native
class Frustum ()
  extends typingsSlinky.babylonjs.BABYLON.Frustum
/* static members */
object Frustum {
  
  /**
    * Gets the bottom frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetBottomPlaneToRef")
  @js.native
  def GetBottomPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
  
  /**
    * Gets the far frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetFarPlaneToRef")
  @js.native
  def GetFarPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
  
  /**
    * Gets the left frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetLeftPlaneToRef")
  @js.native
  def GetLeftPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
  
  /**
    * Gets the near frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetNearPlaneToRef")
  @js.native
  def GetNearPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
  
  /**
    * Gets the planes representing the frustum
    * @param transform matrix to be applied to the returned planes
    * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
    */
  @JSGlobal("BABYLON.Frustum.GetPlanes")
  @js.native
  def GetPlanes(transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]): js.Array[typingsSlinky.babylonjs.BABYLON.Plane] = js.native
  
  /**
    * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
    * @param transform transformation matrix to be applied to the resulting frustum planes
    * @param frustumPlanes the resuling frustum planes
    */
  @JSGlobal("BABYLON.Frustum.GetPlanesToRef")
  @js.native
  def GetPlanesToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlanes: js.Array[typingsSlinky.babylonjs.BABYLON.Plane]
  ): Unit = js.native
  
  /**
    * Gets the right frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetRightPlaneToRef")
  @js.native
  def GetRightPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
  
  /**
    * Gets the top frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSGlobal("BABYLON.Frustum.GetTopPlaneToRef")
  @js.native
  def GetTopPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix],
    frustumPlane: typingsSlinky.babylonjs.BABYLON.Plane
  ): Unit = js.native
}
