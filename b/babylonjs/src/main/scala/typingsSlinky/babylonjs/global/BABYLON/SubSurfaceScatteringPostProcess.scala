package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.PostProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubSurfaceScatteringPostProcess")
@js.native
class SubSurfaceScatteringPostProcess protected ()
  extends typingsSlinky.babylonjs.BABYLON.SubSurfaceScatteringPostProcess {
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: Double | PostProcessOptions,
    camera: js.UndefOr[Nullable[typingsSlinky.babylonjs.BABYLON.Camera]],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[typingsSlinky.babylonjs.BABYLON.Engine],
    reusable: js.UndefOr[Boolean],
    textureType: js.UndefOr[Double]
  ) = this()
}
