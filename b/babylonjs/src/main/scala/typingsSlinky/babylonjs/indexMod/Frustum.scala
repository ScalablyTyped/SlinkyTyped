package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Frustum")
@js.native
class Frustum ()
  extends typingsSlinky.babylonjs.mathsIndexMod.Frustum
/* static members */
object Frustum {
  
  /**
    * Gets the bottom frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetBottomPlaneToRef")
  @js.native
  def GetBottomPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the far frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetFarPlaneToRef")
  @js.native
  def GetFarPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the left frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetLeftPlaneToRef")
  @js.native
  def GetLeftPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the near frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetNearPlaneToRef")
  @js.native
  def GetNearPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the planes representing the frustum
    * @param transform matrix to be applied to the returned planes
    * @returns a new array of 6 Frustum planes computed by the given transformation matrix.
    */
  @JSImport("babylonjs/index", "Frustum.GetPlanes")
  @js.native
  def GetPlanes(transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]): js.Array[typingsSlinky.babylonjs.mathPlaneMod.Plane] = js.native
  
  /**
    * Sets the given array "frustumPlanes" with the 6 Frustum planes computed by the given transformation matrix.
    * @param transform transformation matrix to be applied to the resulting frustum planes
    * @param frustumPlanes the resuling frustum planes
    */
  @JSImport("babylonjs/index", "Frustum.GetPlanesToRef")
  @js.native
  def GetPlanesToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlanes: js.Array[typingsSlinky.babylonjs.mathPlaneMod.Plane]
  ): Unit = js.native
  
  /**
    * Gets the right frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetRightPlaneToRef")
  @js.native
  def GetRightPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
  
  /**
    * Gets the top frustum plane transformed by the transform matrix
    * @param transform transformation matrix to be applied to the resulting frustum plane
    * @param frustumPlane the resuling frustum plane
    */
  @JSImport("babylonjs/index", "Frustum.GetTopPlaneToRef")
  @js.native
  def GetTopPlaneToRef(
    transform: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix],
    frustumPlane: typingsSlinky.babylonjs.mathPlaneMod.Plane
  ): Unit = js.native
}
