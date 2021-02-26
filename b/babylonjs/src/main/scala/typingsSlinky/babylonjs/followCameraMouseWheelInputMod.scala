package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.cameraInputsManagerMod.ICameraInput
import typingsSlinky.babylonjs.followCameraMod.FollowCamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object followCameraMouseWheelInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/followCameraMouseWheelInput", "FollowCameraMouseWheelInput")
  @js.native
  class FollowCameraMouseWheelInput () extends ICameraInput[FollowCamera] {
    
    var _observer: js.Any = js.native
    
    var _wheel: js.Any = js.native
    
    /**
      * Moue wheel controls height. (Mouse wheel modifies camera.heightOffset value.)
      */
    var axisControlHeight: Boolean = js.native
    
    /**
      * Moue wheel controls zoom. (Mouse wheel modifies camera.radius value.)
      */
    var axisControlRadius: Boolean = js.native
    
    /**
      * Moue wheel controls angle. (Mouse wheel modifies camera.rotationOffset value.)
      */
    var axisControlRotation: Boolean = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_FollowCameraMouseWheelInput: FollowCamera = js.native
    
    /**
      * wheelDeltaPercentage will be used instead of wheelPrecision if different from 0.
      * It defines the percentage of current camera.radius to use as delta when wheel is used.
      */
    var wheelDeltaPercentage: Double = js.native
    
    /**
      * Gets or Set the mouse wheel precision or how fast is the camera moves in
      * relation to mouseWheel events.
      */
    var wheelPrecision: Double = js.native
  }
}
