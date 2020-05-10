package typingsSlinky.blueprintjsTable.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsTable.cellMod.ICellProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cell {
  @JSImport("@blueprintjs/table", "Cell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsTable.mod.Cell] {
    @scala.inline
    def cellRef(value: /* ref */ HTMLElement | Null => Unit): this.type = set("cellRef", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def columnIndex(value: Double): this.type = set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def interactive(value: Boolean): this.type = set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyPress(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyUp(value: SyntheticKeyboardEvent[HTMLElement] => Unit): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def rowIndex(value: Double): this.type = set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def truncated(value: Boolean): this.type = set("truncated", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapText(value: Boolean): this.type = set("wrapText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ICellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Cell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

