package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPointerScaleBehavior extends Behavior[Mesh] {
  var _dragBehaviorA: js.Any = js.native
  var _dragBehaviorB: js.Any = js.native
  var _getCurrentDistance: js.Any = js.native
  var _initialScale: js.Any = js.native
  var _ownerNode: js.Any = js.native
  var _sceneRenderObserver: js.Any = js.native
  var _startDistance: js.Any = js.native
  var _targetScale: js.Any = js.native
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MMultiPointerScaleBehavior: String = js.native
}

object MultiPointerScaleBehavior {
  @scala.inline
  def apply(
    _dragBehaviorA: js.Any,
    _dragBehaviorB: js.Any,
    _getCurrentDistance: js.Any,
    _initialScale: js.Any,
    _ownerNode: js.Any,
    _sceneRenderObserver: js.Any,
    _startDistance: js.Any,
    _targetScale: js.Any,
    attach: Mesh => Unit,
    detach: () => Unit,
    init: () => Unit,
    name: () => String
  ): MultiPointerScaleBehavior = {
    val __obj = js.Dynamic.literal(_dragBehaviorA = _dragBehaviorA.asInstanceOf[js.Any], _dragBehaviorB = _dragBehaviorB.asInstanceOf[js.Any], _getCurrentDistance = _getCurrentDistance.asInstanceOf[js.Any], _initialScale = _initialScale.asInstanceOf[js.Any], _ownerNode = _ownerNode.asInstanceOf[js.Any], _sceneRenderObserver = _sceneRenderObserver.asInstanceOf[js.Any], _startDistance = _startDistance.asInstanceOf[js.Any], _targetScale = _targetScale.asInstanceOf[js.Any], attach = js.Any.fromFunction1(attach), detach = js.Any.fromFunction0(detach), init = js.Any.fromFunction0(init), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[MultiPointerScaleBehavior]
  }
  @scala.inline
  implicit class MultiPointerScaleBehaviorOps[Self <: MultiPointerScaleBehavior] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dragBehaviorA(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dragBehaviorA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_dragBehaviorB(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dragBehaviorB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_getCurrentDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_getCurrentDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_initialScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_initialScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_ownerNode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ownerNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_sceneRenderObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_sceneRenderObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_startDistance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_startDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_targetScale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

