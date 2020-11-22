package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.GeometryBufferRenderer")
@js.native
class GeometryBufferRenderer protected ()
  extends typingsSlinky.babylonjs.BABYLON.GeometryBufferRenderer {
  /**
    * Creates a new G Buffer for the scene
    * @param scene The scene the buffer belongs to
    * @param ratio How big is the buffer related to the main canvas.
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene, ratio: Double) = this()
}
/* static members */
@JSGlobal("BABYLON.GeometryBufferRenderer")
@js.native
object GeometryBufferRenderer extends js.Object {
  
  /**
    * Constant used to retrieve the depth + normal texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.DEPTHNORMAL_TEXTURE_INDEX)
    */
  val DEPTHNORMAL_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the position texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
    */
  val POSITION_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
    * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
    */
  val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the velocity texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
    */
  val VELOCITY_TEXTURE_TYPE: Double = js.native
  
  /** @hidden */
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}
