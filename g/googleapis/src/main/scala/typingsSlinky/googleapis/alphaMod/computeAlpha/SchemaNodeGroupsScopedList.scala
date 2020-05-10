package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsScopedList extends js.Object {
  /**
    * [Output Only] A list of node groups contained in this scope.
    */
  var nodeGroups: js.UndefOr[js.Array[SchemaNodeGroup]] = js.native
  /**
    * [Output Only] An informational warning that appears when the nodeGroup
    * list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNodeGroupsScopedList {
  @scala.inline
  def apply(): SchemaNodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsScopedList]
  }
  @scala.inline
  implicit class SchemaNodeGroupsScopedListOps[Self <: SchemaNodeGroupsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeGroups(value: js.Array[SchemaNodeGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeGroups")(js.undefined)
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

