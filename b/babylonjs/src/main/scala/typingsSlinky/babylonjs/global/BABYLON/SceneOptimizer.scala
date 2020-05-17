package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SceneOptimizer")
@js.native
class SceneOptimizer protected ()
  extends typingsSlinky.babylonjs.BABYLON.SceneOptimizer {
  /**
    * Creates a new SceneOptimizer
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param autoGeneratePriorities defines if priorities must be generated and not read from SceneOptimization property (true by default)
    * @param improvementMode defines if the scene optimizer must run the maximum optimization while staying over a target frame instead of trying to reach the target framerate (false by default)
    */
  def this(scene: typingsSlinky.babylonjs.BABYLON.Scene) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions,
    autoGeneratePriorities: Boolean,
    improvementMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("BABYLON.SceneOptimizer")
@js.native
object SceneOptimizer extends js.Object {
  /**
    * Helper function to create a SceneOptimizer with one single line of code
    * @param scene defines the scene to work on
    * @param options defines the options to use with the SceneOptimizer
    * @param onSuccess defines a callback to call on success
    * @param onFailure defines a callback to call on failure
    * @returns the new SceneOptimizer object
    */
  def OptimizeAsync(scene: typingsSlinky.babylonjs.BABYLON.Scene): typingsSlinky.babylonjs.BABYLON.SceneOptimizer = js.native
  def OptimizeAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions
  ): typingsSlinky.babylonjs.BABYLON.SceneOptimizer = js.native
  def OptimizeAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit]
  ): typingsSlinky.babylonjs.BABYLON.SceneOptimizer = js.native
  def OptimizeAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.SceneOptimizerOptions,
    onSuccess: js.Function0[Unit],
    onFailure: js.Function0[Unit]
  ): typingsSlinky.babylonjs.BABYLON.SceneOptimizer = js.native
}

