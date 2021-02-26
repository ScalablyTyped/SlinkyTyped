package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  @JSImport("babylonjs/XR/index", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(scene: Scene): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
  @JSImport("babylonjs/XR/index", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(
    scene: Scene,
    options: typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
}
