package typingsSlinky.reactBootstrap.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.mod.Sizes
import typingsSlinky.reactBootstrap.splitButtonMod.SplitButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitButton {
  @JSImport("react-bootstrap", "SplitButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.SplitButton] {
    @scala.inline
    def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dropdownTitle(value: js.Any): this.type = set("dropdownTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def dropup(value: Boolean): this.type = set("dropup", value.asInstanceOf[js.Any])
    @scala.inline
    def pullRight(value: Boolean): this.type = set("pullRight", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SplitButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SplitButtonProps]))
  }
}

