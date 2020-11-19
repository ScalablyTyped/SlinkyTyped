package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience
/* static members */
@JSImport("babylonjs/XR/index", "WebXRDefaultExperience")
@js.native
object WebXRDefaultExperience extends js.Object {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  def CreateAsync(scene: Scene): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
  def CreateAsync(
    scene: Scene,
    options: typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
}
