package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SixDofDragBehavior extends Behavior[Mesh] {
  
  var _moving: js.Any = js.native
  
  var _ownerNode: js.Any = js.native
  
  /**
    * In the case of multiplea active cameras, the cameraToUseForPointers should be used if set instead of active camera
    */
  /* private */ def _pointerCamera: js.Any = js.native
  
  var _pointerObserver: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _sceneRenderObserver: js.Any = js.native
  
  var _startingOrientation: js.Any = js.native
  
  var _targetPosition: js.Any = js.native
  
  var _virtualDragMesh: js.Any = js.native
  
  var _virtualOriginMesh: js.Any = js.native
  
  /**
    * The id of the pointer that is currently interacting with the behavior (-1 when no pointer is active)
    */
  var currentDraggingPointerID: Double = js.native
  
  /**
    * If camera controls should be detached during the drag
    */
  var detachCameraControls: Boolean = js.native
  
  /**
    * The distance towards the target drag position to move each frame. This can be useful to avoid jitter. Set this to 1 for no delay. (Default: 0.2)
    */
  var dragDeltaRatio: Double = js.native
  
  /**
    * If the behavior is currently in a dragging state
    */
  var dragging: Boolean = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MSixDofDragBehavior: String = js.native
  
  /**
    *  Fires each time a drag ends (eg. mouse release after drag)
    */
  var onDragEndObservable: Observable[js.Object] = js.native
  
  /**
    * Fires each time a drag starts
    */
  var onDragStartObservable: Observable[js.Object] = js.native
  
  /**
    * If the object should rotate to face the drag origin
    */
  var rotateDraggedObject: Boolean = js.native
  
  /**
    * How much faster the object should move when the controller is moving towards it. This is useful to bring objects that are far away from the user to them faster. Set this to 0 to avoid any speed increase. (Default: 3)
    */
  var zDragFactor: js.Any = js.native
}
