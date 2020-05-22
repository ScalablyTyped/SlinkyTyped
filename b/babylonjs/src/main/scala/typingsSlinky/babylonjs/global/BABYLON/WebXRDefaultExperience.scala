package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.WebXRRenderTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXRDefaultExperience")
@js.native
class WebXRDefaultExperience protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXRDefaultExperience {
  /**
    * Base experience
    */
  /* CompleteClass */
  override var baseExperience: typingsSlinky.babylonjs.BABYLON.WebXRExperienceHelper = js.native
  /**
    * Enables ui for entering/exiting xr
    */
  /* CompleteClass */
  override var enterExitUI: typingsSlinky.babylonjs.BABYLON.WebXREnterExitUI = js.native
  /**
    * Input experience extension
    */
  /* CompleteClass */
  override var input: typingsSlinky.babylonjs.BABYLON.WebXRInput = js.native
  /**
    * Enables laser pointer and selection
    */
  /* CompleteClass */
  override var pointerSelection: typingsSlinky.babylonjs.BABYLON.WebXRControllerPointerSelection = js.native
  /**
    * Default target xr should render to
    */
  /* CompleteClass */
  override var renderTarget: WebXRRenderTarget = js.native
  /**
    * Enables teleportation
    */
  /* CompleteClass */
  override var teleportation: typingsSlinky.babylonjs.BABYLON.WebXRMotionControllerTeleportation = js.native
  /**
    * DIsposes of the experience helper
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

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

