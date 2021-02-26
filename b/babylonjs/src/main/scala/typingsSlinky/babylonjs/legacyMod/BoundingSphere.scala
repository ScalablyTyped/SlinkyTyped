package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BoundingSphere")
@js.native
class BoundingSphere protected ()
  extends typingsSlinky.babylonjs.indexMod.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    worldMatrix: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ) = this()
}
/* static members */
object BoundingSphere {
  
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  @JSImport("babylonjs/Legacy/legacy", "BoundingSphere.Intersects")
  @js.native
  def Intersects(
    sphere0: DeepImmutable[typingsSlinky.babylonjs.boundingSphereMod.BoundingSphere],
    sphere1: DeepImmutable[typingsSlinky.babylonjs.boundingSphereMod.BoundingSphere]
  ): Boolean = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "BoundingSphere.TmpVector3")
  @js.native
  val TmpVector3: js.Any = js.native
}
