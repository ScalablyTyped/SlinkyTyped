package typingsSlinky.babylonjs.webXRAnchorSystemMod

import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRAnchorSystemOptions extends js.Object {
  /**
    * Should a new anchor be added every time a select event is triggered
    */
  var addAnchorOnSelect: js.UndefOr[Boolean] = js.native
  /**
    * should the anchor system use plane detection.
    * If set to true, the plane-detection feature should be set using setPlaneDetector
    */
  var usePlaneDetection: js.UndefOr[Boolean] = js.native
  /**
    * a node that will be used to convert local to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}

object IWebXRAnchorSystemOptions {
  @scala.inline
  def apply(): IWebXRAnchorSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRAnchorSystemOptions]
  }
  @scala.inline
  implicit class IWebXRAnchorSystemOptionsOps[Self <: IWebXRAnchorSystemOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAnchorOnSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAnchorOnSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAnchorOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAnchorOnSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePlaneDetection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlaneDetection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePlaneDetection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePlaneDetection")(js.undefined)
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

