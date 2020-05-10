package typingsSlinky.antd.directoryTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTreeState extends js.Object {
  var expandedKeys: js.UndefOr[js.Array[String]] = js.native
  var selectedKeys: js.UndefOr[js.Array[String]] = js.native
}

object DirectoryTreeState {
  @scala.inline
  def apply(): DirectoryTreeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryTreeState]
  }
  @scala.inline
  implicit class DirectoryTreeStateOps[Self <: DirectoryTreeState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKeys")(js.undefined)
        ret
    }
  }
  
}

