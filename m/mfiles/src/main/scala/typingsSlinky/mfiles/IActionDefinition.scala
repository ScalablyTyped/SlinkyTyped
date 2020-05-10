package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionDefinition extends js.Object {
  var ActionCreateSeparateAssignment: IActionCreateAssignment = js.native
  val ActionType: MFActionType = js.native
  def Clear(): Unit = js.native
  def Clone(): IActionDefinition = js.native
}

object IActionDefinition {
  @scala.inline
  def apply(
    ActionCreateSeparateAssignment: IActionCreateAssignment,
    ActionType: MFActionType,
    Clear: () => Unit,
    Clone: () => IActionDefinition
  ): IActionDefinition = {
    val __obj = js.Dynamic.literal(ActionCreateSeparateAssignment = ActionCreateSeparateAssignment.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IActionDefinition]
  }
  @scala.inline
  implicit class IActionDefinitionOps[Self <: IActionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionCreateSeparateAssignment(value: IActionCreateAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionCreateSeparateAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionType(value: MFActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withClone(value: () => IActionDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

