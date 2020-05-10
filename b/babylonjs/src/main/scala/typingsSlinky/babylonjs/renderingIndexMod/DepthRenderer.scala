package typingsSlinky.babylonjs.renderingIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Rendering/index", "DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typingsSlinky.babylonjs.depthRendererMod.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, `type`: Double) = this()
  def this(scene: Scene, `type`: Double, camera: Nullable[Camera]) = this()
  def this(scene: Scene, `type`: Double, camera: Nullable[Camera], storeNonLinearDepth: Boolean) = this()
}

/* static members */
@JSImport("babylonjs/Rendering/index", "DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}

