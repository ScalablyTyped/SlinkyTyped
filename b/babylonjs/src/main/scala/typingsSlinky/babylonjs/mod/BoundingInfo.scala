package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typingsSlinky.babylonjs.legacyMod.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    worldMatrix: DeepImmutable[typingsSlinky.babylonjs.mathVectorMod.Matrix]
  ) = this()
}
/* static members */
@JSImport("babylonjs", "BoundingInfo")
@js.native
object BoundingInfo extends js.Object {
  
  val TmpVector3: js.Any = js.native
}
