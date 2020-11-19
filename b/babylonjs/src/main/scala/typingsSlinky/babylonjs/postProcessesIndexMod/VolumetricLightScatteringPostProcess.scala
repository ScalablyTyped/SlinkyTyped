package typingsSlinky.babylonjs.postProcessesIndexMod

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.engineMod.Engine
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/PostProcesses/index", "VolumetricLightScatteringPostProcess")
@js.native
class VolumetricLightScatteringPostProcess protected ()
  extends typingsSlinky.babylonjs.volumetricLightScatteringPostProcessMod.VolumetricLightScatteringPostProcess {
  /**
    * @constructor
    * @param name The post-process name
    * @param ratio The size of the post-process and/or internal pass (0.5 means that your postprocess will have a width = canvas.width 0.5 and a height = canvas.height 0.5)
    * @param camera The camera that the post-process will be attached to
    * @param mesh The mesh used to create the light scattering
    * @param samples The post-process quality, default 100
    * @param samplingModeThe post-process filtering mode
    * @param engine The babylon engine
    * @param reusable If the post-process is reusable
    * @param scene The constructor needs a scene reference to initialize internal components. If "camera" is null a "scene" must be provided
    */
  def this(
    name: String,
    ratio: js.Any,
    camera: Camera,
    mesh: js.UndefOr[Mesh],
    samples: js.UndefOr[Double],
    samplingMode: js.UndefOr[Double],
    engine: js.UndefOr[Engine],
    reusable: js.UndefOr[Boolean],
    scene: js.UndefOr[Scene]
  ) = this()
}
/* static members */
@JSImport("babylonjs/PostProcesses/index", "VolumetricLightScatteringPostProcess")
@js.native
object VolumetricLightScatteringPostProcess extends js.Object {
  
  /**
    * Creates a default mesh for the Volumeric Light Scattering post-process
    * @param name The mesh name
    * @param scene The scene where to create the mesh
    * @return the default mesh
    */
  def CreateDefaultMesh(name: String, scene: Scene): Mesh = js.native
}
