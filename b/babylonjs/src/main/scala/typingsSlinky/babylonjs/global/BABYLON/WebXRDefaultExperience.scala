package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience
/* static members */
object WebXRDefaultExperience {
  
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  @JSGlobal("BABYLON.WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(scene: typingsSlinky.babylonjs.BABYLON.Scene): js.Promise[typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
  @JSGlobal("BABYLON.WebXRDefaultExperience.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
}
