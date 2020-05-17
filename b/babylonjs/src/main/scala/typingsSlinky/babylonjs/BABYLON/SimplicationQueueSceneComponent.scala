package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplicationQueueSceneComponent extends ISceneComponent {
  var _beforeCameraUpdate: js.Any = js.native
}

object SimplicationQueueSceneComponent {
  @scala.inline
  def apply(
    _beforeCameraUpdate: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): SimplicationQueueSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeCameraUpdate = _beforeCameraUpdate.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplicationQueueSceneComponent]
  }
  @scala.inline
  implicit class SimplicationQueueSceneComponentOps[Self <: SimplicationQueueSceneComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_beforeCameraUpdate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_beforeCameraUpdate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

