package typingsSlinky.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param scene The scene the helper should be created in
  */
class WebXRExperienceHelper protected ()
  extends typingsSlinky.babylonjs.xRIndexMod.WebXRExperienceHelper
/* static members */
@JSImport("babylonjs/index", "WebXRExperienceHelper")
@js.native
object WebXRExperienceHelper extends js.Object {
  
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  def CreateAsync(scene: typingsSlinky.babylonjs.sceneMod.Scene): js.Promise[typingsSlinky.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper] = js.native
}
