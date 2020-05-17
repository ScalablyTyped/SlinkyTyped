package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typingsSlinky.babylonjs.BABYLON.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene, `type`: Double) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  /** @hidden */
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}

