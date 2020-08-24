package typingsSlinky.reactSelect.componentsSingleValueMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: ReactElement = js.native
  /* The data of the selected option rendered in the Single Value componentn */
  var data: OptionType = js.native
  /** Props passed to the wrapping element for the group. */
  var innerProps: js.Any = js.native
}

object ValueProps {
  @scala.inline
  def apply[/* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType](data: OptionType, innerProps: js.Any): ValueProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
  @scala.inline
  implicit class ValuePropsOps[Self <: ValueProps[_], /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */ OptionType] (val x: Self with ValueProps[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: OptionType): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerProps(value: js.Any): Self = this.set("innerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

