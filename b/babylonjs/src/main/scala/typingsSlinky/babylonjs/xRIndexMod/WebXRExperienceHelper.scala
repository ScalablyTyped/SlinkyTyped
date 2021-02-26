package typingsSlinky.babylonjs.xRIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/index", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param scene The scene the helper should be created in
  */
class WebXRExperienceHelper protected ()
  extends typingsSlinky.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper
/* static members */
object WebXRExperienceHelper {
  
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  @JSImport("babylonjs/XR/index", "WebXRExperienceHelper.CreateAsync")
  @js.native
  def CreateAsync(scene: Scene): js.Promise[typingsSlinky.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper] = js.native
}
