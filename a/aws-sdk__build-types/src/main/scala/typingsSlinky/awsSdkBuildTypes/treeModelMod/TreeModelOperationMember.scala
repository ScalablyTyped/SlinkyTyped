package typingsSlinky.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeModelOperationMember extends TreeModelMember {
  @JSName("shape")
  var shape_TreeModelOperationMember: TreeModelStructure = js.native
}

object TreeModelOperationMember {
  @scala.inline
  def apply(shape: TreeModelStructure): TreeModelOperationMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeModelOperationMember]
  }
  @scala.inline
  implicit class TreeModelOperationMemberOps[Self <: TreeModelOperationMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShape(value: TreeModelStructure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

