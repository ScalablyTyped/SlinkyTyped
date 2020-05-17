package typingsSlinky.babylonjs.enginesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.babylonjs.uniformBufferMod.UniformBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("babylonjs/Engines/index", "babylonjs/scene")
@js.native
object babylonjsSceneAugmentingMod extends js.Object {
  @js.native
  trait Scene extends js.Object {
    /** @hidden */
    var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
    /** @hidden */
    var _transformMatrixR: Matrix = js.native
    /** @hidden */
    def _createMultiviewUbo(): Unit = js.native
    /** @hidden */
    def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
    /** @hidden */
    def _updateMultiviewUbo(): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
    def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
  }
  
}

