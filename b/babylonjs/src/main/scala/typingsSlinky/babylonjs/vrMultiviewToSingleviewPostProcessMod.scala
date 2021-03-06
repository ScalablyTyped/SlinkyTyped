package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.postProcessMod.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vrMultiviewToSingleviewPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/vrMultiviewToSingleviewPostProcess", "VRMultiviewToSingleviewPostProcess")
  @js.native
  class VRMultiviewToSingleviewPostProcess protected () extends PostProcess {
    /**
      * Initializes a VRMultiviewToSingleview
      * @param name name of the post process
      * @param camera camera to be applied to
      * @param scaleFactor scaling factor to the size of the output texture
      */
    def this(name: String, camera: Camera, scaleFactor: Double) = this()
  }
}
