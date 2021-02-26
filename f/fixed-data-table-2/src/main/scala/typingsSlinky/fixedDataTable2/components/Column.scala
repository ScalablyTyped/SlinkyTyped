package typingsSlinky.fixedDataTable2.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.center
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.left
import typingsSlinky.fixedDataTable2.fixedDataTable2Strings.right
import typingsSlinky.fixedDataTable2.mod.ColumnCellProps
import typingsSlinky.fixedDataTable2.mod.ColumnHeaderProps
import typingsSlinky.fixedDataTable2.mod.ColumnProps
import typingsSlinky.fixedDataTable2.mod.ElementOrFunc
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
  
  @JSImport("fixed-data-table-2", "Column")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fixedDataTable2.mod.Column] {
    
    @scala.inline
    def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowCellsRecycling(value: Boolean): this.type = set("allowCellsRecycling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cell(value: ElementOrFunc[ColumnCellProps]): this.type = set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cellFunction1(value: ColumnCellProps => String | ReactElement): this.type = set("cell", js.Any.fromFunction1(value))
    
    @scala.inline
    def cellReactElement(value: ReactElement): this.type = set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnKey(value: String | Double): this.type = set("columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fixedRight(value: Boolean): this.type = set("fixedRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flexGrow(value: Double): this.type = set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footer(value: ElementOrFunc[ColumnHeaderProps]): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def footerFunction1(value: ColumnHeaderProps => String | ReactElement): this.type = set("footer", js.Any.fromFunction1(value))
    
    @scala.inline
    def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: ElementOrFunc[ColumnHeaderProps]): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerFunction1(value: ColumnHeaderProps => String | ReactElement): this.type = set("header", js.Any.fromFunction1(value))
    
    @scala.inline
    def headerReactElement(value: ReactElement): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isReorderable(value: Boolean): this.type = set("isReorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isResizable(value: Boolean): this.type = set("isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pureRendering(value: Boolean): this.type = set("pureRendering", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
