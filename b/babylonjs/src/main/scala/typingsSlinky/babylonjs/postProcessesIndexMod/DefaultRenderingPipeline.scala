package typingsSlinky.babylonjs.postProcessesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "DefaultRenderingPipeline")
@js.native
/**
  * @constructor
  * @param name - The rendering pipeline name (default: "")
  * @param hdr - If high dynamic range textures should be used (default: true)
  * @param scene - The scene linked to this pipeline (default: the last created scene)
  * @param cameras - The array of cameras that the rendering pipeline will be attached to (default: scene.cameras)
  * @param automaticBuild - if false, you will have to manually call prepare() to update the pipeline (default: true)
  */
class DefaultRenderingPipeline ()
  extends typingsSlinky.babylonjs.renderPipelineIndexMod.DefaultRenderingPipeline {
  def this(name: String) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean) = this()
  def this(name: String, hdr: Boolean) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene) = this()
  def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene) = this()
  def this(name: String, hdr: Boolean, scene: Scene) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera]
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(name: js.UndefOr[scala.Nothing], hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera]
  ) = this()
  def this(name: String, hdr: js.UndefOr[scala.Nothing], scene: Scene, cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: js.UndefOr[scala.Nothing], cameras: js.Array[Camera]) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera]) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: js.UndefOr[scala.Nothing],
    hdr: Boolean,
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: js.UndefOr[scala.Nothing],
    scene: Scene,
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: js.UndefOr[scala.Nothing],
    cameras: js.Array[Camera],
    automaticBuild: Boolean
  ) = this()
  def this(
    name: String,
    hdr: Boolean,
    scene: Scene,
    cameras: js.UndefOr[scala.Nothing],
    automaticBuild: Boolean
  ) = this()
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera], automaticBuild: Boolean) = this()
}
/* static members */
object DefaultRenderingPipeline {
  
  /**
    * Parse the serialized pipeline
    * @param source Source pipeline.
    * @param scene The scene to load the pipeline to.
    * @param rootUrl The URL of the serialized pipeline.
    * @returns An instantiated pipeline from the serialized object.
    */
  @JSImport("babylonjs/PostProcesses/index", "DefaultRenderingPipeline.Parse")
  @js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): typingsSlinky.babylonjs.defaultRenderingPipelineMod.DefaultRenderingPipeline = js.native
}
