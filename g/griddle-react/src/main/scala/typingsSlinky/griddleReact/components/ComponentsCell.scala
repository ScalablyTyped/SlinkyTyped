package typingsSlinky.griddleReact.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.griddleReact.mod.components.Cell
import typingsSlinky.griddleReact.mod.components.CellProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsCell {
  @JSImport("griddle-react", "components.Cell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Cell] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columnId(value: String): this.type = set("columnId", value.asInstanceOf[js.Any])
    @scala.inline
    def griddleKey(value: Double): this.type = set("griddleKey", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[Element] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ComponentsCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

