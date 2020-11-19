package typingsSlinky.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
class WebXREnterExitUI protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXREnterExitUI
/* static members */
@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
object WebXREnterExitUI extends js.Object {
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  def CreateAsync(
    scene: typingsSlinky.babylonjs.BABYLON.Scene,
    helper: typingsSlinky.babylonjs.BABYLON.WebXRExperienceHelper,
    options: typingsSlinky.babylonjs.BABYLON.WebXREnterExitUIOptions
  ): js.Promise[typingsSlinky.babylonjs.BABYLON.WebXREnterExitUI] = js.native
}
