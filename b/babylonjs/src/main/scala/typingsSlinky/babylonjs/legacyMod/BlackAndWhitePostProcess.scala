package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BlackAndWhitePostProcess")
@js.native
class BlackAndWhitePostProcess protected ()
  extends typingsSlinky.babylonjs.indexMod.BlackAndWhitePostProcess {
  /**
    * Creates a black and white post process
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#black-and-white
    * @param name The name of the effect.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param camera The camera to apply the render pass to.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(name: String, options: Double, camera: typingsSlinky.babylonjs.cameraMod.Camera) = this()
  def this(name: String, options: PostProcessOptions, camera: typingsSlinky.babylonjs.cameraMod.Camera) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: Double,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.cameraMod.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.engineMod.Engine,
    reusable: Boolean
  ) = this()
}
/* static members */
object BlackAndWhitePostProcess {
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "BlackAndWhitePostProcess._Parse")
  @js.native
  def _Parse(
    parsedPostProcess: js.Any,
    targetCamera: typingsSlinky.babylonjs.cameraMod.Camera,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    rootUrl: String
  ): Nullable[typingsSlinky.babylonjs.blackAndWhitePostProcessMod.BlackAndWhitePostProcess] = js.native
}
