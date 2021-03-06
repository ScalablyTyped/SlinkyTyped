package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DaydreamController")
@js.native
class DaydreamController protected ()
  extends typingsSlinky.babylonjs.BABYLON.DaydreamController {
  /**
    * Creates a new DaydreamController from a gamepad
    * @param vrGamepad the gamepad that the controller should be created from
    */
  def this(vrGamepad: js.Any) = this()
}
/* static members */
object DaydreamController {
  
  @JSGlobal("BABYLON.DaydreamController")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gamepad Id prefix used to identify Daydream Controller.
    */
  @JSGlobal("BABYLON.DaydreamController.GAMEPAD_ID_PREFIX")
  @js.native
  val GAMEPAD_ID_PREFIX: String = js.native
  
  /**
    * Base Url for the controller model.
    */
  @JSGlobal("BABYLON.DaydreamController.MODEL_BASE_URL")
  @js.native
  def MODEL_BASE_URL: String = js.native
  @scala.inline
  def MODEL_BASE_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_BASE_URL")(x.asInstanceOf[js.Any])
  
  /**
    * File name for the controller model.
    */
  @JSGlobal("BABYLON.DaydreamController.MODEL_FILENAME")
  @js.native
  def MODEL_FILENAME: String = js.native
  @scala.inline
  def MODEL_FILENAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODEL_FILENAME")(x.asInstanceOf[js.Any])
}
