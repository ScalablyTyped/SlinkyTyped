package typingsSlinky.reactSelect.componentsMultiValueMod

import slinky.core.TagMod
import typingsSlinky.reactSelect.AnonClassName
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiValueGenericProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  var children: TagMod[Any]
  var data: OptionType
  var innerProps: AnonClassName
  var selectProps: js.Any
}

object MultiValueGenericProps {
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](children: TagMod[Any], data: OptionType, innerProps: AnonClassName, selectProps: js.Any): MultiValueGenericProps[OptionType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiValueGenericProps[OptionType]]
  }
}

