package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNodeTypesScopedList {
  @scala.inline
  def apply(): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
  @scala.inline
  implicit class SchemaNodeTypesScopedListOps[Self <: SchemaNodeTypesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeTypes(value: js.Array[SchemaNodeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

