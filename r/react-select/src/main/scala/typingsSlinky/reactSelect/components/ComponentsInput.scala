package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.componentsInputMod.InputProps
import typingsSlinky.reactSelect.typesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsInput {
  @JSImport("react-select", "components.Input")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    cx: (Null | String, ClassNamesState, String) => String | Unit,
    getStyles: (String, js.Any) => js.Object,
    innerRef: Ref[_] => Unit,
    isHidden: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(cx = js.Any.fromFunction3(cx), getStyles = js.Any.fromFunction2(getStyles), innerRef = js.Any.fromFunction1(innerRef), isHidden = isHidden.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputProps]))
  }
}

