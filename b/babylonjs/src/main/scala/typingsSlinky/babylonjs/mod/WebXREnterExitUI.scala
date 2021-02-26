package typingsSlinky.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
class WebXREnterExitUI protected ()
  extends typingsSlinky.babylonjs.legacyMod.WebXREnterExitUI
/* static members */
object WebXREnterExitUI {
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  @JSImport("babylonjs", "WebXREnterExitUI.CreateAsync")
  @js.native
  def CreateAsync(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    helper: typingsSlinky.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper,
    options: typingsSlinky.babylonjs.webXREnterExitUIMod.WebXREnterExitUIOptions
  ): js.Promise[typingsSlinky.babylonjs.webXREnterExitUIMod.WebXREnterExitUI] = js.native
}
