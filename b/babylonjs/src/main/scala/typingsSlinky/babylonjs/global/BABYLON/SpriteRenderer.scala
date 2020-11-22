package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SpriteRenderer")
@js.native
class SpriteRenderer protected ()
  extends typingsSlinky.babylonjs.BABYLON.SpriteRenderer {
  /**
    * Creates a new sprite Renderer
    * @param engine defines the engine the renderer works with
    * @param capacity defines the maximum allowed number of sprites
    * @param epsilon defines the epsilon value to align texture (0.01 by default)
    * @param scene defines the hosting scene
    */
  def this(engine: typingsSlinky.babylonjs.BABYLON.ThinEngine, capacity: Double) = this()
  def this(engine: typingsSlinky.babylonjs.BABYLON.ThinEngine, capacity: Double, epsilon: Double) = this()
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    capacity: Double,
    epsilon: js.UndefOr[scala.Nothing],
    scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]
  ) = this()
  def this(
    engine: typingsSlinky.babylonjs.BABYLON.ThinEngine,
    capacity: Double,
    epsilon: Double,
    scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]
  ) = this()
}
