package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthRendererSceneComponent extends ISceneComponent {
  var _gatherActiveCameraRenderTargets: js.Any = js.native
  var _gatherRenderTargets: js.Any = js.native
}

object DepthRendererSceneComponent {
  @scala.inline
  def apply(
    _gatherActiveCameraRenderTargets: js.Any,
    _gatherRenderTargets: js.Any,
    dispose: () => Unit,
    name: String,
    rebuild: () => Unit,
    register: () => Unit,
    scene: Scene
  ): DepthRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherActiveCameraRenderTargets = _gatherActiveCameraRenderTargets.asInstanceOf[js.Any], _gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRendererSceneComponent]
  }
  @scala.inline
  implicit class DepthRendererSceneComponentOps[Self <: DepthRendererSceneComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_gatherActiveCameraRenderTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gatherActiveCameraRenderTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_gatherRenderTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gatherRenderTargets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

