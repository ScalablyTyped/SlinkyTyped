package typingsSlinky.officeUiFabricReact.choiceGroupTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroup extends js.Object {
  /**
    * Gets the current checked option.
    */
  var checkedOption: js.UndefOr[IChoiceGroupOption] = js.native
  /**
    * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
    */
  def focus(): Unit = js.native
}

object IChoiceGroup {
  @scala.inline
  def apply(focus: () => Unit): IChoiceGroup = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[IChoiceGroup]
  }
  @scala.inline
  implicit class IChoiceGroupOps[Self <: IChoiceGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCheckedOption(value: IChoiceGroupOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedOption")(js.undefined)
        ret
    }
  }
  
}

