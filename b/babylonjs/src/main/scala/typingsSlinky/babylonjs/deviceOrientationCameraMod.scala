package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.freeCameraMod.FreeCamera
import typingsSlinky.babylonjs.mathAxisMod.Axis
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceOrientationCameraMod {
  
  @JSImport("babylonjs/Cameras/deviceOrientationCamera", "DeviceOrientationCamera")
  @js.native
  class DeviceOrientationCamera protected () extends FreeCamera {
    /**
      * Creates a new device orientation camera
      * @param name The name of the camera
      * @param position The start position camera
      * @param scene The scene the camera belongs to
      */
    def this(name: String, position: Vector3, scene: Scene) = this()
    
    var _disablePointerInputWhenUsingDeviceOrientation: js.Any = js.native
    
    var _dragFactor: js.Any = js.native
    
    var _initialQuaternion: js.Any = js.native
    
    var _quaternionCache: js.Any = js.native
    
    var _tmpDragQuaternion: js.Any = js.native
    
    /**
      * Gets or sets a boolean indicating that pointer input must be disabled on first orientation sensor update (Default: true)
      */
    def disablePointerInputWhenUsingDeviceOrientation: Boolean = js.native
    def disablePointerInputWhenUsingDeviceOrientation_=(value: Boolean): Unit = js.native
    
    /**
      * Enabled turning on the y axis when the orientation sensor is active
      * @param dragFactor the factor that controls the turn speed (default: 1/300)
      */
    def enableHorizontalDragging(): Unit = js.native
    def enableHorizontalDragging(dragFactor: Double): Unit = js.native
    
    /**
      * Reset the camera to its default orientation on the specified axis only.
      * @param axis The axis to reset
      */
    def resetToCurrentRotation(): Unit = js.native
    def resetToCurrentRotation(axis: Axis): Unit = js.native
  }
}
