package typingsSlinky.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "WebXRExperienceHelper")
@js.native
/**
  * Creates a WebXRExperienceHelper
  * @param scene The scene the helper should be created in
  */
class WebXRExperienceHelper protected ()
  extends typingsSlinky.babylonjs.indexMod.WebXRExperienceHelper

/* static members */
@JSImport("babylonjs/Legacy/legacy", "WebXRExperienceHelper")
@js.native
object WebXRExperienceHelper extends js.Object {
  /**
    * Creates the experience helper
    * @param scene the scene to attach the experience helper to
    * @returns a promise for the experience helper
    */
  def CreateAsync(scene: typingsSlinky.babylonjs.sceneMod.Scene): js.Promise[typingsSlinky.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper] = js.native
}

