package typingsSlinky.babylonjs.babylonjsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod {
  
  @js.native
  trait ArcRotateCameraInputsManager extends StObject {
    
    /**
      * Add orientation input support to the input manager.
      * @returns the current input manager
      */
    def addVRDeviceOrientation(): typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = js.native
  }
  object ArcRotateCameraInputsManager {
    
    @scala.inline
    def apply(
      addVRDeviceOrientation: () => typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
    ): typingsSlinky.babylonjs.babylonjsMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager = {
      val __obj = js.Dynamic.literal(addVRDeviceOrientation = js.Any.fromFunction0(addVRDeviceOrientation))
      __obj.asInstanceOf[typingsSlinky.babylonjs.babylonjsMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager]
    }
    
    @scala.inline
    implicit class ArcRotateCameraInputsManagerMutableBuilder[Self <: typingsSlinky.babylonjs.babylonjsMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddVRDeviceOrientation(
        value: () => typingsSlinky.babylonjs.arcRotateCameraVRDeviceOrientationInputMod.babylonjsCamerasArcRotateCameraInputsManagerAugmentingMod.ArcRotateCameraInputsManager
      ): Self = StObject.set(x, "addVRDeviceOrientation", js.Any.fromFunction0(value))
    }
  }
}
