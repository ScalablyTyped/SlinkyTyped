package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBrowserExpandedParams extends js.Object {
  var children: js.Array[FileTreeNode] = js.native
  var expandPath: String = js.native
  var message: String = js.native
  var ownerUri: String = js.native
  var succeeded: Boolean = js.native
}

object FileBrowserExpandedParams {
  @scala.inline
  def apply(
    children: js.Array[FileTreeNode],
    expandPath: String,
    message: String,
    ownerUri: String,
    succeeded: Boolean
  ): FileBrowserExpandedParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expandPath = expandPath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserExpandedParams]
  }
  @scala.inline
  implicit class FileBrowserExpandedParamsOps[Self <: FileBrowserExpandedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[FileTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeeded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

