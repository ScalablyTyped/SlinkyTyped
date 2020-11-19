package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typingsSlinky.babylonjs.flyCameraMod.FlyCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/flyCameraInputsManager", JSImport.Namespace)
@js.native
object flyCameraInputsManagerMod extends js.Object {
  
  @js.native
  class FlyCameraInputsManager protected () extends CameraInputsManager[FlyCamera] {
    /**
      * Instantiates a new FlyCameraInputsManager.
      * @param camera Defines the camera the inputs belong to.
      */
    def this(camera: FlyCamera) = this()
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the new FlyCameraKeyboardMoveInput().
      */
    def addKeyboard(): FlyCameraInputsManager = js.native
    
    /**
      * Add mouse input support to the input manager.
      * @param touchEnabled Enable touch screen support.
      * @returns the new FlyCameraMouseInput().
      */
    def addMouse(): FlyCameraInputsManager = js.native
    def addMouse(touchEnabled: Boolean): FlyCameraInputsManager = js.native
  }
}
