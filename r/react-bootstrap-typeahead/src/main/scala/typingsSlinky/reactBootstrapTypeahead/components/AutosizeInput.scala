package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.html.input.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.PickCSSPropertiesboxSizin
import typingsSlinky.reactBootstrapTypeahead.mod.AutosizeInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AutosizeInput {
  @JSImport("react-bootstrap-typeahead", "AutosizeInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.AutosizeInput] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefRefObject(value: ReactRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): this.type = set("inputRef", js.Any.fromFunction1(value))
    @scala.inline
    def inputRef(value: LegacyRef[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    @scala.inline
    def inputRefNull: this.type = set("inputRef", null)
    @scala.inline
    def inputStyle(value: PickCSSPropertiesboxSizin): this.type = set("inputStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutosizeInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(style: CSSProperties): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutosizeInputProps]))
  }
}

