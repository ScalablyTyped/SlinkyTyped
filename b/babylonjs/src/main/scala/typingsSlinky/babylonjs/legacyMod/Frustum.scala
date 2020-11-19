package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Frustum")
@js.native
class Frustum ()
  extends typingsSlinky.babylonjs.indexMod.Frustum
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Frustum")
@js.native
object Frustum extends js.Object {
  
  /**
    * Gets the bottom frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetBottomPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the far frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetFarPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the left frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetLeftPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the near frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetNearPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the planes representing the frustum
    * @param transform matrix to be applied to the returned planes
    * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
    */
  def GetPlanes(transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]): js.Array[typingsSlinky.babylonjs.mathPlaneMod.Plane] = js.native
  
  /**
    * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
    * @param transform transformation matrix to be applied to the resulting frustum planes
    * @param frustumPlanes the resuling frustum planes
    */
  def GetPlanesToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlanes: js.Array[typingsSlinky.babylonjs.mathPlaneMod.Plane]
  ): Unit = js.native
  
  /**
    * Gets the right frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetRightPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the top frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  def GetTopPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
}
