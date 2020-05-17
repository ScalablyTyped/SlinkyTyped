package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.anon.ClassName
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValueGeneric {
  @JSImport("react-select/src/components/MultiValue", "MultiValueGeneric")
  @js.native
  object component extends js.Object
  
  def withProps(p: MultiValueGenericProps[js.Any]): SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGeneric] = new SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGeneric](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Any, innerProps: ClassName, selectProps: js.Any): SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGeneric] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new SharedBuilder_MultiValueGenericProps_351876057[typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGeneric](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[js.Any]]))
  }
}

