package typingsSlinky.reactFileInput.components

import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileInput.mod.FileInputProps
import typingsSlinky.reactFileInput.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFileInput {
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FileInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    accept: String,
    className: String,
    name: String,
    onChange: SyntheticEvent[Event, _] => Unit,
    placeholder: String
  ): Builder = {
    val __props = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FileInputProps]))
  }
}

