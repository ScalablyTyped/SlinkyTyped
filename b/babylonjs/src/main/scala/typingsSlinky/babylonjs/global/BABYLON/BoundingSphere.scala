package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingSphere")
@js.native
class BoundingSphere protected ()
  extends typingsSlinky.babylonjs.BABYLON.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typingsSlinky.babylonjs.BABYLON.Matrix]
  ) = this()
}
/* static members */
@JSGlobal("BABYLON.BoundingSphere")
@js.native
object BoundingSphere extends js.Object {
  
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  def Intersects(
    sphere0: DeepImmutable[typingsSlinky.babylonjs.BABYLON.BoundingSphere],
    sphere1: DeepImmutable[typingsSlinky.babylonjs.BABYLON.BoundingSphere]
  ): Boolean = js.native
  
  val TmpVector3: js.Any = js.native
}
