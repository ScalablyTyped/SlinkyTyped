package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a free camera inputs manager
  */
@JSImport("babylonjs", "FreeCameraInputsManager")
@js.native
class FreeCameraInputsManager protected ()
  extends typingsSlinky.babylonjs.legacyMod.FreeCameraInputsManager {
  /**
    * Instantiates a new FreeCameraInputsManager.
    * @param camera Defines the camera the inputs belong to
    */
  def this(camera: typingsSlinky.babylonjs.freeCameraMod.FreeCamera) = this()
}
