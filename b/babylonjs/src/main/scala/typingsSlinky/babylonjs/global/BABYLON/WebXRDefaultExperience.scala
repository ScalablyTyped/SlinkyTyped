package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience

/* static members */
@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
object WebXRDefaultExperience extends js.Object {
  /**
    * Creates the default xr experience
    * @param scene scene
    * @param options options for basic configuration
    * @returns resulting WebXRDefaultExperience
    */
  def CreateAsync(scene: typingsSlinky.babylonjs.BABYLON.Scene): js.Promise[typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
  def CreateAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    options: typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperienceOptions
  ): js.Promise[typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience] = js.native
}

