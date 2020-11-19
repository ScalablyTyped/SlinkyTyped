package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableBodyProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  @JSImport("material-ui", "TableBody")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.TableBody] {
    
    @scala.inline
    def allRowsSelected(value: Boolean): this.type = set("allRowsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deselectOnClickaway(value: Boolean): this.type = set("deselectOnClickaway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayRowCheckbox(value: Boolean): this.type = set("displayRowCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiSelectable(value: Boolean): this.type = set("multiSelectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCellClick(value: (/* row */ Double, /* column */ Double) => Unit): this.type = set("onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCellHover(value: (/* row */ Double, /* column */ Double) => Unit): this.type = set("onCellHover", js.Any.fromFunction2(value))
    
    @scala.inline
    def onCellHoverExit(value: (/* row */ Double, /* column */ Double) => Unit): this.type = set("onCellHoverExit", js.Any.fromFunction2(value))
    
    @scala.inline
    def onRowHover(value: /* row */ Double => Unit): this.type = set("onRowHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowHoverExit(value: /* row */ Double => Unit): this.type = set("onRowHoverExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRowSelection(value: /* selectedRows */ js.Array[Double] | String => Unit): this.type = set("onRowSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def preScanRows(value: Boolean): this.type = set("preScanRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showRowHover(value: Boolean): this.type = set("showRowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stripedRows(value: Boolean): this.type = set("stripedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableBodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableBody.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
