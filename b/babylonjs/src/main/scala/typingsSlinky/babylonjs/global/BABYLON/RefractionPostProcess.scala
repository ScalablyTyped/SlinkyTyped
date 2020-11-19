package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RefractionPostProcess")
@js.native
class RefractionPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.RefractionPostProcess {
  /**
    * Initializes the RefractionPostProcess
    * @see https://doc.babylonjs.com/how_to/how_to_use_postprocesses#refraction
    * @param name The name of the effect.
    * @param refractionTextureUrl Url of the refraction texture to use
    * @param color the base color of the refraction (used to taint the rendering)
    * @param depth simulated refraction depth
    * @param colorLevel the coefficient of the base color (0 to remove base color tainting)
    * @param camera The camera to apply the render pass to.
    * @param options The required width/height ratio to downsize to before computing the render pass.
    * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
    * @param engine The engine which the post process will be applied. (default: current engine)
    * @param reusable If the post process can be reused on the same frame. (default: false)
    */
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: Double,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: js.UndefOr[scala.Nothing],
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: js.UndefOr[scala.Nothing],
    reusable: Boolean
  ) = this()
  def this(
    name: String,
    refractionTextureUrl: String,
    /** the base color of the refraction (used to taint the rendering) */
  color: typingsSlinky.babylonjs.BABYLON.Color3,
    /** simulated refraction depth */
  depth: Double,
    /** the coefficient of the base color (0 to remove base color tainting) */
  colorLevel: Double,
    options: PostProcessOptions,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    samplingMode: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    reusable: Boolean
  ) = this()
}
