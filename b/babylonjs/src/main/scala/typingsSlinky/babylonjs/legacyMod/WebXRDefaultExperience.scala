package typingsSlinky.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.indexMod.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  @JSImport("babylonjs/Legacy/legacy", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(scene: typingsSlinky.babylonjs.sceneMod.Scene): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
  @JSImport("babylonjs/Legacy/legacy", "WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    options: typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperienceOptions
  ): js.Promise[typingsSlinky.babylonjs.webXRDefaultExperienceMod.WebXRDefaultExperience] = js.native
}
