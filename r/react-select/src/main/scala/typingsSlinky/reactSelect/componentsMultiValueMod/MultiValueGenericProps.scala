package typingsSlinky.reactSelect.componentsMultiValueMod

import slinky.core.TagMod
import typingsSlinky.reactSelect.AnonClassName
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: TagMod[Any] = js.native
  var data: OptionType = js.native
  var innerProps: AnonClassName = js.native
  var selectProps: js.Any = js.native
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType](data: OptionType, innerProps: AnonClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
  @scala.inline
  implicit class MultiValueGenericPropsOps[Self[optiontype] <: MultiValueGenericProps[optiontype], OptionType] (val x: Self[OptionType]) extends AnyVal {
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
    def withInnerProps(value: AnonClassName): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectProps(value: js.Any): Self[OptionType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectProps")(value.asInstanceOf[js.Any])
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

