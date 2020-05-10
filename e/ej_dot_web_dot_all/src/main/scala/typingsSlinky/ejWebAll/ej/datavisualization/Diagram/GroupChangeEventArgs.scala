package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupChangeEventArgs extends js.Object {
  /** parameter returns the cause of group change("group", unGroup")
    */
  var cause: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the object that is added to/removed from a group
    */
  var element: js.UndefOr[js.Any] = js.native
  /** parameter returns the new parent group(if any) of the object
    */
  var newParent: js.UndefOr[js.Any] = js.native
  /** parameter returns the old parent group(if any) of the object
    */
  var oldParent: js.UndefOr[js.Any] = js.native
}

object GroupChangeEventArgs {
  @scala.inline
  def apply(): GroupChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupChangeEventArgs]
  }
  @scala.inline
  implicit class GroupChangeEventArgsOps[Self <: GroupChangeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCause(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagramId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagramId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagramId")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withNewParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newParent")(js.undefined)
        ret
    }
    @scala.inline
    def withOldParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldParent")(js.undefined)
        ret
    }
  }
  
}

