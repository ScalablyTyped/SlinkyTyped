package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldIndex extends js.Object {
  var index: Double = js.native
  var oldIndex: Double = js.native
  var oldParentId: String = js.native
  var parentId: String = js.native
}

object OldIndex {
  @scala.inline
  def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): OldIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
  @scala.inline
  implicit class OldIndexOps[Self <: OldIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldParentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

