package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRHitTestOptions extends js.Object {
  /**
    * Only test when user interacted with the scene. Default - hit test every frame
    */
  var testOnPointerDownOnly: js.UndefOr[Boolean] = js.native
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}

object IWebXRHitTestOptions {
  @scala.inline
  def apply(): IWebXRHitTestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRHitTestOptions]
  }
  @scala.inline
  implicit class IWebXRHitTestOptionsOps[Self <: IWebXRHitTestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestOnPointerDownOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOnPointerDownOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestOnPointerDownOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testOnPointerDownOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withWorldParentNode(value: TransformNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldParentNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorldParentNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worldParentNode")(js.undefined)
        ret
    }
  }
  
}

