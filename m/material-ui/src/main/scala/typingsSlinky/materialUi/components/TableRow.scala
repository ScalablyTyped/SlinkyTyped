package typingsSlinky.materialUi.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableRowProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableRow {
  
  @JSImport("material-ui", "TableRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.TableRow] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayBorder(value: Boolean): this.type = set("displayBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hoverable(value: Boolean): this.type = set("hoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hovered(value: Boolean): this.type = set("hovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCellClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): this.type = set("onCellClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def onCellHover(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): this.type = set("onCellHover", js.Any.fromFunction3(value))
    
    @scala.inline
    def onCellHoverExit(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double, /* column */ Double) => Unit): this.type = set("onCellHoverExit", js.Any.fromFunction3(value))
    
    @scala.inline
    def onRowClick(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): this.type = set("onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowHover(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): this.type = set("onRowHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowHoverExit(value: (/* e */ SyntheticMouseEvent[js.Object], /* row */ Double) => Unit): this.type = set("onRowHoverExit", js.Any.fromFunction2(value))
    
    @scala.inline
    def rowNumber(value: Double): this.type = set("rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableRow.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableRowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
