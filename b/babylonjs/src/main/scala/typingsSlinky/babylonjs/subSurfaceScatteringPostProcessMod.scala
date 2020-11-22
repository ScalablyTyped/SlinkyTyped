package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import typingsSlinky.babylonjs.postProcessMod.PostProcessOptions
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/subSurfaceScatteringPostProcess", JSImport.Namespace)
@js.native
object subSurfaceScatteringPostProcessMod extends js.Object {
  
  @js.native
  class SubSurfaceScatteringPostProcess protected () extends PostProcess {
    def this(
      name: String,
      scene: Scene,
      options: Double | PostProcessOptions,
      camera: js.UndefOr[Nullable[Camera]],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      textureType: js.UndefOr[Double]
    ) = this()
  }
}
