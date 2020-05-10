package typingsSlinky.reactFileReaderInput.components

import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFileReaderInput.mod.Format
import typingsSlinky.reactFileReaderInput.mod.Props
import typingsSlinky.reactFileReaderInput.mod.Result
import typingsSlinky.reactFileReaderInput.mod.^
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFileReaderInput {
  @JSImport("react-file-reader-input", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def as(value: Format): this.type = set("as", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (SyntheticEvent[Event_, _], js.Array[Result]) => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

