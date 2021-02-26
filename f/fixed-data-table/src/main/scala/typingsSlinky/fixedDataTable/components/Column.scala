package typingsSlinky.fixedDataTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable.mod.CellProps
import typingsSlinky.fixedDataTable.mod.ColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Column {
  
  @scala.inline
  def apply(width: Double): Builder = {
    val __props = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColumnProps]))
  }
  
  @JSImport("fixed-data-table", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable.mod.Column] {
    
    @scala.inline
    def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowCellsRecycling(value: Boolean): this.type = set("allowCellsRecycling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cell(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): this.type = set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellFunction1(value: /* props */ CellProps => String | ReactElement): this.type = set("cell", js.Any.fromFunction1(value))
    
    @scala.inline
    def cellReactElement(value: ReactElement): this.type = set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnKey(value: String | Double): this.type = set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerFunction1(value: /* props */ CellProps => String | ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: String | ReactElement | (js.Function1[/* props */ CellProps, String | ReactElement])): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction1(value: /* props */ CellProps => String | ReactElement): this.type = set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
