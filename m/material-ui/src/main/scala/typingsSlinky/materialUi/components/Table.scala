package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Table.TableProps
import typingsSlinky.materialUi.materialUiStrings.all
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("material-ui", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.Table] {
    
    @scala.inline
    def allRowsSelected(value: Boolean): this.type = set("allRowsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bodyStyle(value: CSSProperties): this.type = set("bodyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixedFooter(value: Boolean): this.type = set("fixedFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixedHeader(value: Boolean): this.type = set("fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerStyle(value: CSSProperties): this.type = set("footerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerStyle(value: CSSProperties): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
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
    def onRowSelection(value: /* selectedRows */ js.Array[Double] | all => Unit): this.type = set("onRowSelection", js.Any.fromFunction1(value))
    
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Table.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
