package typingsSlinky.reactBootstrapTypeahead.components

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.facade.ReactRef
import slinky.web.html.ul.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.mod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("react-bootstrap-typeahead", "Menu")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Menu] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyLabel(value: String): this.type = set("emptyLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefRefObject(value: ReactRef[HTMLUListElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def innerRef(value: LegacyRef[HTMLUListElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def innerRefNull: this.type = set("innerRef", null)
    @scala.inline
    def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MenuProps]))
  }
}

