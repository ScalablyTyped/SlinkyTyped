package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typingsSlinky.babylonjs.cullingIndexMod.BoundingInfo {
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
object BoundingInfo {
  
  @JSImport("babylonjs/index", "BoundingInfo.TmpVector3")
  @js.native
  val TmpVector3: js.Any = js.native
}
