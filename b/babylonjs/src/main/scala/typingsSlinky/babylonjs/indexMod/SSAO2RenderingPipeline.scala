package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SSAO2RenderingPipeline")
@js.native
class SSAO2RenderingPipeline protected ()
  extends typingsSlinky.babylonjs.postProcessesIndexMod.SSAO2RenderingPipeline {
  /**
    * @constructor
    * @param name The rendering pipeline name
    * @param scene The scene linked to this pipeline
    * @param ratio The size of the postprocesses. Can be a number shared between passes or an object for more precision: { ssaoRatio: 0.5, blurRatio: 1.0 }
    * @param cameras The array of cameras that the rendering pipeline will be attached to
    */
  def this(name: String, scene: typingsSlinky.babylonjs.sceneMod.Scene, ratio: js.Any) = this()
  def this(
    name: String,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    ratio: js.Any,
    cameras: js.Array[typingsSlinky.babylonjs.cameraMod.Camera]
  ) = this()
}
/* static members */
@JSImport("babylonjs/index", "SSAO2RenderingPipeline")
@js.native
object SSAO2RenderingPipeline extends js.Object {
  
  /**
    *  Support test.
    */
  def IsSupported: Boolean = js.native
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  def Parse(source: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.ssao2RenderingPipelineMod.SSAO2RenderingPipeline = js.native
}
