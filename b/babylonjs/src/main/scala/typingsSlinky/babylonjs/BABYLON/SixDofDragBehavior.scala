package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SixDofDragBehavior extends Behavior[Mesh] {
  var _moving: js.Any = js.native
  var _ownerNode: js.Any = js.native
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
  /**
    * In the case of multiplea active cameras, the cameraToUseForPointers should be used if set instead of active camera
    */
  /* private */ def _pointerCamera: js.Any = js.native
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MSixDofDragBehavior: String = js.native
}

object SixDofDragBehavior {
  @scala.inline
  def apply(
    _moving: js.Any,
    _ownerNode: js.Any,
    _pointerCamera: () => js.Any,
    _pointerObserver: js.Any,
    _scene: js.Any,
    _sceneRenderObserver: js.Any,
    _startingOrientation: js.Any,
    _targetPosition: js.Any,
    _virtualDragMesh: js.Any,
    _virtualOriginMesh: js.Any,
    attach: Mesh => Unit,
    currentDraggingPointerID: Double,
    detach: () => Unit,
    detachCameraControls: Boolean,
    dragDeltaRatio: Double,
    dragging: Boolean,
    init: () => Unit,
    name: () => String,
    onDragEndObservable: Observable[js.Object],
    onDragStartObservable: Observable[js.Object],
    rotateDraggedObject: Boolean,
    zDragFactor: js.Any
  ): SixDofDragBehavior = {
    val __obj = js.Dynamic.literal(_moving = _moving.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _pointerCamera = js.Any.fromFunction0(_pointerCamera), _pointerObserver = _pointerObserver.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _sceneRenderObserver = _sceneRenderObserver.asInstanceOf[js.Any], _startingOrientation = _startingOrientation.asInstanceOf[js.Any], _targetPosition = _targetPosition.asInstanceOf[js.Any], _virtualDragMesh = _virtualDragMesh.asInstanceOf[js.Any], _virtualOriginMesh = _virtualOriginMesh.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), currentDraggingPointerID = currentDraggingPointerID.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), detachCameraControls = detachCameraControls.asInstanceOf[js.Any], dragDeltaRatio = dragDeltaRatio.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name), onDragEndObservable = onDragEndObservable.asInstanceOf[js.Any], onDragStartObservable = onDragStartObservable.asInstanceOf[js.Any], rotateDraggedObject = rotateDraggedObject.asInstanceOf[js.Any], zDragFactor = zDragFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SixDofDragBehavior]
  }
  @scala.inline
  implicit class SixDofDragBehaviorOps[Self <: SixDofDragBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_moving(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_moving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ownerNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ownerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pointerCamera(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pointerCamera")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_pointerObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pointerObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sceneRenderObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sceneRenderObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_startingOrientation(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startingOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_targetPosition(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_virtualDragMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_virtualDragMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_virtualOriginMesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_virtualOriginMesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentDraggingPointerID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentDraggingPointerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetachCameraControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachCameraControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragDeltaRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragDeltaRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDragEndObservable(value: Observable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDragStartObservable(value: Observable[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotateDraggedObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateDraggedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZDragFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zDragFactor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

