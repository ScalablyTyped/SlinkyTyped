package typingsSlinky.reactSelect.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupType[OptionType /* <: OptionTypeBase */]
  extends /* key */ StringDictionary[js.Any] {
  var options: OptionsType[OptionType] = js.native
}

object GroupType {
  @scala.inline
  def apply[OptionType](options: OptionsType[OptionType]): GroupType[OptionType] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupType[OptionType]]
  }
  @scala.inline
  implicit class GroupTypeOps[Self[optiontype] <: GroupType[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withOptions(value: OptionsType[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

