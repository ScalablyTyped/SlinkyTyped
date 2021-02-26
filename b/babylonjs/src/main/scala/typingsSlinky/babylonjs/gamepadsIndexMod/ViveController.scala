package typingsSlinky.babylonjs.gamepadsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Gamepads/index", "ViveController")
@js.native
class ViveController protected ()
  extends typingsSlinky.babylonjs.controllersIndexMod.ViveController {
  /**
    * Creates a new ViveController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object ViveController {
  
  @JSImport("babylonjs/Gamepads/index", "ViveController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSImport("babylonjs/Gamepads/index", "ViveController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  @scala.inline
  def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the controller model.
    */
  @JSImport("babylonjs/Gamepads/index", "ViveController.MODEL_FILENAME")
  @js.native
  def MODEL_FILENAME: String = js.native
  @scala.inline
  def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
}
