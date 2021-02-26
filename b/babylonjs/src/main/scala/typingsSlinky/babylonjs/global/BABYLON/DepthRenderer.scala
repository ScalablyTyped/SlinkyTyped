package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    `type`: js.UndefOr[scala.Nothing],
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    `type`: js.UndefOr[scala.Nothing],
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    `type`: Double,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    storeNonLinearDepth: Boolean
  ) = this()
}
/* static members */
object DepthRenderer {
  
  /** @hidden */
  @JSGlobal("BABYLON.DepthRenderer._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typingsSlinky.babylonjs.BABYLON.Scene): Unit = js.native
}
