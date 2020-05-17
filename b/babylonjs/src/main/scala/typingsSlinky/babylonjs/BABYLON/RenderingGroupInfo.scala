package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingGroupInfo extends js.Object {
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: Double = js.native
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}

object RenderingGroupInfo {
  @scala.inline
  def apply(renderingGroupId: Double, scene: Scene): RenderingGroupInfo = {
    val __obj = js.Dynamic.literal(renderingGroupId = renderingGroupId.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingGroupInfo]
  }
  @scala.inline
  implicit class RenderingGroupInfoOps[Self <: RenderingGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderingGroupId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCamera(value: Nullable[Camera]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCameraNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(null)
        ret
    }
  }
  
}

