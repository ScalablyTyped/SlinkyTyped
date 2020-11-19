package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.PointerEvent
import typingsSlinky.babylonjs.anon.OffsetX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeCameraMouseInput extends ICameraInput[FreeCamera] {
  
  /**
    * @hidden
    * If the camera should be rotated automatically based on pointer movement
    */
  var _allowCameraRotation: Boolean = js.native
  
  var _observer: js.Any = js.native
  
  var _onMouseMove: js.Any = js.native
  
  var _pointerInput: js.Any = js.native
  
  /**
    * Defines the pointer angular sensibility  along the X and Y axis or how fast is the camera rotating.
    */
  var angularSensibility: Double = js.native
  
  /**
    * Defines the buttons associated with the input to handle camera move.
    */
  var buttons: js.Array[Double] = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_FreeCameraMouseInput: FreeCamera = js.native
  
  /**
    * Called on JS contextmenu event.
    * Override this method to provide functionality.
    */
  /* protected */ def onContextMenu(evt: PointerEvent): Unit = js.native
  
  /**
    * Observable for when a pointer move event occurs containing the move offset
    */
  var onPointerMovedObservable: Observable[OffsetX] = js.native
  
  var previousPosition: js.Any = js.native
  
  /**
    * Define if touch is enabled in the mouse input
    */
  var touchEnabled: Boolean = js.native
}
