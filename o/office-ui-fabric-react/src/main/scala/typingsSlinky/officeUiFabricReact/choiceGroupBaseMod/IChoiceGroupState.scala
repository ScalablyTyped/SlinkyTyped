package typingsSlinky.officeUiFabricReact.choiceGroupBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChoiceGroupState extends js.Object {
  /**
    * Current selected option, for **internal use only**.
    * External users should access `IChoiceGroup.checkedOption` instead.
    */
  var keyChecked: js.UndefOr[String | Double] = js.native
  /** Is set when the control has focus. */
  var keyFocused: js.UndefOr[String | Double] = js.native
}

object IChoiceGroupState {
  @scala.inline
  def apply(): IChoiceGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupState]
  }
  @scala.inline
  implicit class IChoiceGroupStateOps[Self <: IChoiceGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyChecked(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFocused(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFocused")(js.undefined)
        ret
    }
  }
  
}

