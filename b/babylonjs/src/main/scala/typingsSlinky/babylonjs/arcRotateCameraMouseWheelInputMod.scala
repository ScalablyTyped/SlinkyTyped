package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typingsSlinky.babylonjs.cameraInputsManagerMod.ICameraInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcRotateCameraMouseWheelInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/arcRotateCameraMouseWheelInput", "ArcRotateCameraMouseWheelInput")
  @js.native
  class ArcRotateCameraMouseWheelInput () extends ICameraInput[ArcRotateCamera] {
    
    var _observer: js.Any = js.native
    
    var _wheel: js.Any = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_ArcRotateCameraMouseWheelInput: ArcRotateCamera = js.native
    
    var computeDeltaFromMouseWheelLegacyEvent: js.Any = js.native
    
    /**
      * wheelDeltaPercentage will be used instead of wheelPrecision if different from 0.
      * It defines the percentage of current camera.radius to use as delta when wheel is used.
      */
    var wheelDeltaPercentage: Double = js.native
    
    /**
      * Gets or Set the mouse wheel precision or how fast is the camera zooming.
      */
    var wheelPrecision: Double = js.native
  }
}
