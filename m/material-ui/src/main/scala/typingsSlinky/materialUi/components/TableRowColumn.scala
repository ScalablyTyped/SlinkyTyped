package typingsSlinky.materialUi.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableRowColumnProps
import typingsSlinky.materialUi.tableRowColumnMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRowColumn {
  @JSImport("material-ui/Table/TableRowColumn", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def columnNumber(value: Double): this.type = set("columnNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onHover(value: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit): this.type = set("onHover", js.Any.fromFunction2(value))
    @scala.inline
    def onHoverExit(value: (/* e */ SyntheticMouseEvent[js.Object], /* column */ Double) => Unit): this.type = set("onHoverExit", js.Any.fromFunction2(value))
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableRowColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TableRowColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

