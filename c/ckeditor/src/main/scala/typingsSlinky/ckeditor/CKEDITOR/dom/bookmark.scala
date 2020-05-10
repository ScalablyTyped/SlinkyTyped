package typingsSlinky.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait bookmark extends js.Object {
  var collapsed: Boolean = js.native
  var endNode: node | String = js.native
  var serializable: Boolean = js.native
  var startNode: node | String = js.native
}

object bookmark {
  @scala.inline
  def apply(collapsed: Boolean, endNode: node | String, serializable: Boolean, startNode: node | String): bookmark = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], endNode = endNode.asInstanceOf[js.Any], serializable = serializable.asInstanceOf[js.Any], startNode = startNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[bookmark]
  }
  @scala.inline
  implicit class bookmarkOps[Self <: bookmark] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndNode(value: node | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartNode(value: node | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

