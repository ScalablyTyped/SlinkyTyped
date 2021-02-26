package typingsSlinky.babylonjs.postProcessesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "SSAORenderingPipeline")
@js.native
class SSAORenderingPipeline protected ()
  extends typingsSlinky.babylonjs.renderPipelineIndexMod.SSAORenderingPipeline {
  /**
    * @constructor
    * @param name - The rendering pipeline name
    * @param scene - The scene linked to this pipeline
    * @param ratio - The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, combineRatio: 1.0 }
    * @param cameras - The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: Scene, ratio: js.Any) = this()
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
}
