package typingsSlinky.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMeta[OptionType /* <: OptionTypeBase */] extends js.Object {
  var action: ActionTypes = js.native
  var name: js.UndefOr[String] = js.native
  var option: js.UndefOr[OptionType] = js.native
}

object ActionMeta {
  @scala.inline
  def apply[OptionType](action: ActionTypes): ActionMeta[OptionType] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMeta[OptionType]]
  }
  @scala.inline
  implicit class ActionMetaOps[Self[optiontype] <: ActionMeta[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withAction(value: ActionTypes): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOption(value: OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.undefined)
        ret
    }
  }
  
}

