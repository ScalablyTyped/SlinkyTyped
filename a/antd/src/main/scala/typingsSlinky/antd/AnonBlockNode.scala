package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlockNode extends js.Object {
  var blockNode: Boolean = js.native
  var checkable: Boolean = js.native
  var motion: AnonLeavedClassName = js.native
  var showIcon: Boolean = js.native
}

object AnonBlockNode {
  @scala.inline
  def apply(blockNode: Boolean, checkable: Boolean, motion: AnonLeavedClassName, showIcon: Boolean): AnonBlockNode = {
    val __obj = js.Dynamic.literal(blockNode = blockNode.asInstanceOf[js.Any], checkable = checkable.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlockNode]
  }
  @scala.inline
  implicit class AnonBlockNodeOps[Self <: AnonBlockNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockNode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMotion(value: AnonLeavedClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("motion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

