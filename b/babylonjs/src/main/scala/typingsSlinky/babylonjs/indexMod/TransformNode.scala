package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TransformNode")
@js.native
class TransformNode protected ()
  extends typingsSlinky.babylonjs.babylonjsIndexMod.TransformNode {
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]) = this()
  def this(name: String, scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]], isPure: Boolean) = this()
}
/* static members */
@JSImport("babylonjs/index", "TransformNode")
@js.native
object TransformNode extends js.Object {
  
  /**
    * Object will rotate to face the camera
    */
  var BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * Object will not rotate to face the camera
    */
  var BILLBOARDMODE_NONE: Double = js.native
  
  /**
    * Object will rotate to face the camera's position instead of orientation
    */
  var BILLBOARDMODE_USE_POSITION: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the x axis
    */
  var BILLBOARDMODE_X: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the y axis
    */
  var BILLBOARDMODE_Y: Double = js.native
  
  /**
    * Object will rotate to face the camera but only on the z axis
    */
  var BILLBOARDMODE_Z: Double = js.native
  
  /**
    * Returns a new TransformNode object parsed from the source provided.
    * @param parsedTransformNode is the source.
    * @param scene the scne the object belongs to
    * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
    * @returns a new TransformNode object parsed from the source provided.
    */
  def Parse(parsedTransformNode: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.transformNodeMod.TransformNode = js.native
  
  var _lookAtVectorCache: js.Any = js.native
  
  var _rotationAxisCache: js.Any = js.native
}
