package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.anon.ClassName
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MultiValueGeneric {
  @JSImport("react-select/src/components/MultiValue", "MultiValueGeneric")
  @js.native
  object component extends js.Object
  
  def withProps(p: MultiValueGenericProps[js.Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: js.Any, innerProps: ClassName, selectProps: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[js.Any]]))
  }
}

