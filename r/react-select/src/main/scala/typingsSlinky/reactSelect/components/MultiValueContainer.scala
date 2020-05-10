package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.AnonClassName
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValueContainer {
  @JSImport("react-select/src/components/MultiValue", "MultiValueContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: MultiValueGenericProps[js.Any]): SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueContainer] = new SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueContainer](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Any, innerProps: AnonClassName, selectProps: js.Any): SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueContainer] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueContainer](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[js.Any]]))
  }
}

