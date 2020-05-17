package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MotionBlurPostProcess")
@js.native
class MotionBlurPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.MotionBlurPostProcess {
  /**
    * Creates a new instance MotionBlurPostProcess
    * @param name The name of the effect.
    * @param scene The scene containing the objects to blur according to their velocity.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    * @param textureType Type of textures used when performing the post process. (default: 0)
    * @param blockCompilation If compilation of the shader should not be done in the constructor. The updateEffect method can be used to compile the shader at a later time. (default: false)
    */
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera]
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: PostProcessOptions,
    camera: Nullable[typingsSlinky.babylonjs.BABYLON.Camera],
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean,
    textureType: Double,
    blockCompilation: Boolean
  ) = this()
}

