package typingsSlinky.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFolderDataRelationshipsParent extends js.Object {
  var data: CreateFolderDataRelationshipsParentData = js.native
}

object CreateFolderDataRelationshipsParent {
  @scala.inline
  def apply(data: CreateFolderDataRelationshipsParentData): CreateFolderDataRelationshipsParent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationshipsParent]
  }
  @scala.inline
  implicit class CreateFolderDataRelationshipsParentOps[Self <: CreateFolderDataRelationshipsParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: CreateFolderDataRelationshipsParentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

