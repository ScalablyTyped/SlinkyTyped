package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraInputsManagerMod.CameraInputsManager
import typingsSlinky.babylonjs.followCameraMod.FollowCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Cameras/followCameraInputsManager", JSImport.Namespace)
@js.native
object followCameraInputsManagerMod extends js.Object {
  
  @js.native
  class FollowCameraInputsManager protected () extends CameraInputsManager[FollowCamera] {
    /**
      * Instantiates a new FollowCameraInputsManager.
      * @param camera Defines the camera the inputs belong to
      */
    def this(camera: FollowCamera) = this()
    
    /**
      * Add keyboard input support to the input manager.
      * @returns the current input manager
      */
    def addKeyboard(): FollowCameraInputsManager = js.native
    
    /**
      * Add mouse wheel input support to the input manager.
      * @returns the current input manager
      */
    def addMouseWheel(): FollowCameraInputsManager = js.native
    
    /**
      * Add pointers input support to the input manager.
      * @returns the current input manager
      */
    def addPointers(): FollowCameraInputsManager = js.native
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): FollowCameraInputsManager = js.native
  }
}
