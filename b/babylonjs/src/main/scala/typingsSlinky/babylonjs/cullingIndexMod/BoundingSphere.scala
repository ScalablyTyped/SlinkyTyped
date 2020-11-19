package typingsSlinky.babylonjs.cullingIndexMod

import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Culling/index", "BoundingSphere")
@js.native
class BoundingSphere protected ()
  extends typingsSlinky.babylonjs.boundingSphereMod.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3]) = this()
  def this(min: DeepImmutable[Vector3], max: DeepImmutable[Vector3], worldMatrix: DeepImmutable[Matrix]) = this()
}
/* static members */
@JSImport("babylonjs/Culling/index", "BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  def Intersects(
    sphere0: DeepImmutable[typingsSlinky.babylonjs.boundingSphereMod.BoundingSphere],
    sphere1: DeepImmutable[typingsSlinky.babylonjs.boundingSphereMod.BoundingSphere]
  ): Boolean = js.native
  
  val TmpVector3: js.Any = js.native
}
