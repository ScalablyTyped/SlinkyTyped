package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "DepthRenderer")
@js.native
class DepthRenderer protected ()
  extends typingsSlinky.babylonjs.legacyMod.DepthRenderer {
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
    `type`: js.UndefOr[scala.Nothing],
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    `type`: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    `type`: Double,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.cameraMod.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
}
/* static members */
object DepthRenderer {
  
  /** @hidden */
  @JSImport("babylonjs", "DepthRenderer._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.sceneMod.Scene): Unit = js.native
}
