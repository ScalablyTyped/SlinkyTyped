package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeTemplatesScopedList extends js.Object {
  /**
    * [Output Only] A list of node templates contained in this scope.
    */
  var nodeTemplates: js.UndefOr[js.Array[SchemaNodeTemplate]] = js.native
  /**
    * [Output Only] An informational warning that appears when the node
    * templates list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaNodeTemplatesScopedList {
  @scala.inline
  def apply(): SchemaNodeTemplatesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplatesScopedList]
  }
  @scala.inline
  implicit class SchemaNodeTemplatesScopedListOps[Self <: SchemaNodeTemplatesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNodeTemplates(value: js.Array[SchemaNodeTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeTemplates")(js.undefined)
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

