package typingsSlinky.reactSelect.componentsMod

import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[OptionType /* <: OptionTypeBase */] extends js.Object {
  var components: SelectComponentsConfig[OptionType] = js.native
}

object Props {
  @scala.inline
  def apply[OptionType](components: SelectComponentsConfig[OptionType]): Props[OptionType] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[OptionType]]
  }
  @scala.inline
  implicit class PropsOps[Self[optiontype] <: Props[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withComponents(value: SelectComponentsConfig[OptionType]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

