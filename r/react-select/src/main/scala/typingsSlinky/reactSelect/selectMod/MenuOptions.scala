package typingsSlinky.reactSelect.selectMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuOptions[OptionType /* <: OptionTypeBase */] extends js.Object {
  var focusable: js.Array[OptionType] = js.native
  var render: js.Array[OptionType] = js.native
}

object MenuOptions {
  @scala.inline
  def apply[OptionType](focusable: js.Array[OptionType], render: js.Array[OptionType]): MenuOptions[OptionType] = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions[OptionType]]
  }
  @scala.inline
  implicit class MenuOptionsOps[Self[optiontype] <: MenuOptions[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withFocusable(value: js.Array[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: js.Array[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

