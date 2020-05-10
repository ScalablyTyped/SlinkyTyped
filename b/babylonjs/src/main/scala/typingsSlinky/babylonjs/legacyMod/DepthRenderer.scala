package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typingsSlinky.babylonjs.indexMod.DepthRenderer {
  /**
    * Instantiates a depth renderer
    * @param scene The scene the renderer belongs to
    * @param type The texture type of the depth map (default: Engine.TEXTURETYPE_FLOAT)
    * @param camera The camera to be used to render the depth map (default: scene's active camera)
    * @param storeNonLinearDepth Defines whether the depth is stored linearly like in Babylon Shadows or directly like glFragCoord.z
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene, `type`: Double) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera],
    storeNonLinearDepth: Boolean
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "DepthRenderer")
@js.native
object DepthRenderer extends js.Object {
  /** @hidden */
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
}

