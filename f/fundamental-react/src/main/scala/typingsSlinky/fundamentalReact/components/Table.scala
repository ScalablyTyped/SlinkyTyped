package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.RowData
import typingsSlinky.fundamentalReact.tableMod.TableProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  @JSImport("fundamental-react", "Table")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBodyClassName(value: String): this.type = set("tableBodyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBodyProps(value: js.Any): this.type = set("tableBodyProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBodyRowPropsFunction2(value: (/* rowData */ js.Array[String], /* index */ Double) => Unit): this.type = set("tableBodyRowProps", js.Any.fromFunction2(value))
    
    @scala.inline
    def tableBodyRowProps(
      value: StringDictionary[js.Any] | (js.Function2[/* rowData */ js.Array[String], /* index */ Double, Unit])
    ): this.type = set("tableBodyRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableCellClassName(value: String): this.type = set("tableCellClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableDataVarargs(value: RowData*): this.type = set("tableData", js.Array(value :_*))
    
    @scala.inline
    def tableData(value: js.Array[RowData]): this.type = set("tableData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderClassName(value: String): this.type = set("tableHeaderClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderProps(value: js.Any): this.type = set("tableHeaderProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderRowClassName(value: String): this.type = set("tableHeaderRowClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderRowProps(value: js.Any): this.type = set("tableHeaderRowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableRowClassName(value: String): this.type = set("tableRowClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[TableProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(headers: js.Array[String | ReactElement]): Builder = {
    val __props = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[TableProps]]))
  }
}
