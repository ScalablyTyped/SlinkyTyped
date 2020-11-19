package typingsSlinky.muiDatatables.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.muiDatatables.mod.MUIDataTableBodyCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBodyCell {
  
  @JSImport("mui-datatables", "TableBodyCell")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colIndex(value: Double): this.type = set("colIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnHeader(value: js.Any): this.type = set("columnHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataIndex(value: Double): this.type = set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def otherProps(value: js.Any): this.type = set("otherProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowIndex(value: Double): this.type = set("rowIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableBodyCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableBodyCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
