package typingsSlinky.babylonjs.cullingIndexMod

import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Culling/index", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typingsSlinky.babylonjs.boundingInfoMod.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(minimum: DeepImmutable[Vector3], maximum: DeepImmutable[Vector3]) = this()
  def this(
    minimum: DeepImmutable[Vector3],
    maximum: DeepImmutable[Vector3],
    worldMatrix: DeepImmutable[Matrix]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Culling/index", "BoundingInfo")
@js.native
object BoundingInfo extends js.Object {
  
  val TmpVector3: js.Any = js.native
}
