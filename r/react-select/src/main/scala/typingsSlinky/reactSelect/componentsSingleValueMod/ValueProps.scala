package typingsSlinky.reactSelect.componentsSingleValueMod

import slinky.core.TagMod
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  /** The children to be rendered. */
  var children: TagMod[Any] = js.native
  /* The data of the selected option rendered in the Single Value componentn */
  var data: OptionType = js.native
  /** Props passed to the wrapping element for the group. */
  var innerProps: js.Any = js.native
}

object ValueProps {
  @scala.inline
  def apply[OptionType](data: OptionType, innerProps: js.Any): ValueProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps[OptionType]]
  }
  @scala.inline
  implicit class ValuePropsOps[Self[optiontype] <: ValueProps[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[OptionType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[OptionType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[OptionType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[OptionType] with Other]
    @scala.inline
    def withData(value: OptionType): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerProps(value: js.Any): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

