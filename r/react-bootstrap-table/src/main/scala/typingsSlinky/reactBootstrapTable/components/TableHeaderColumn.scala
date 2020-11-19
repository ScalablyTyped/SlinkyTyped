package typingsSlinky.reactBootstrapTable.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable.anon.GetElement
import typingsSlinky.reactBootstrapTable.mod.CSVFieldType
import typingsSlinky.reactBootstrapTable.mod.CustomAttrs
import typingsSlinky.reactBootstrapTable.mod.CustomEditor
import typingsSlinky.reactBootstrapTable.mod.DataAlignType
import typingsSlinky.reactBootstrapTable.mod.EditValidatorObject
import typingsSlinky.reactBootstrapTable.mod.Editable
import typingsSlinky.reactBootstrapTable.mod.Filter
import typingsSlinky.reactBootstrapTable.mod.SortOrder
import typingsSlinky.reactBootstrapTable.mod.TableHeaderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeaderColumn {
  
  @JSImport("react-bootstrap-table", "TableHeaderColumn")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.TableHeaderColumn] {
    
    @scala.inline
    def autoValueFunction0(value: () => _): this.type = set("autoValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def autoValue(value: Boolean | js.Function0[_]): this.type = set("autoValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def caretRender(value: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | ReactElement): this.type = set("caretRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def classNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): this.type = set("className", js.Any.fromFunction4(value))
    
    @scala.inline
    def className(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnClassNameFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => String
    ): this.type = set("columnClassName", js.Any.fromFunction4(value))
    
    @scala.inline
    def columnClassName(
      value: String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          String
        ])
    ): this.type = set("columnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columnTitleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* colIndex */ Double) => String
    ): this.type = set("columnTitle", js.Any.fromFunction4(value))
    
    @scala.inline
    def columnTitle(
      value: Boolean | String | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* colIndex */ Double, 
          String
        ])
    ): this.type = set("columnTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csvFieldType(value: CSVFieldType): this.type = set("csvFieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csvFormat(value: (/* cell */ js.Any, /* row */ js.Any) => String): this.type = set("csvFormat", js.Any.fromFunction2(value))
    
    @scala.inline
    def csvFormatExtraData(value: js.Any): this.type = set("csvFormatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def csvHeader(value: String): this.type = set("csvHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customEditor(value: CustomEditor[_, _]): this.type = set("customEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def customInsertEditor(value: GetElement): this.type = set("customInsertEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataAlign(value: DataAlignType): this.type = set("dataAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataField(value: String): this.type = set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataFormat(
      value: (/* cell */ js.Any, /* row */ js.Any, /* formatExtraData */ js.Any, /* rowIndex */ Double) => String | ReactElement
    ): this.type = set("dataFormat", js.Any.fromFunction4(value))
    
    @scala.inline
    def dataSort(value: Boolean): this.type = set("dataSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultASC(value: Boolean): this.type = set("defaultASC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): this.type = set("editColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def editColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): this.type = set("editColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editTdAttr(value: CustomAttrs): this.type = set("editTdAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editableFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): this.type = set("editable", js.Any.fromFunction4(value))
    
    @scala.inline
    def editable(
      value: Boolean | (Editable[_, _]) | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): this.type = set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def export(value: Boolean): this.type = set("export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: Filter): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterFormatted(value: Boolean): this.type = set("filterFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filterValue(value: (/* cell */ js.Any, /* row */ js.Any) => _): this.type = set("filterValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def formatExtraData(value: js.Any): this.type = set("formatExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerAlign(value: DataAlignType): this.type = set("headerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerText(value: String): this.type = set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerTitle(value: Boolean): this.type = set("headerTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hiddenOnInsert(value: Boolean): this.type = set("hiddenOnInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invalidEditColumnClassNameFunction2(value: (/* cell */ js.Any, /* row */ js.Any) => String): this.type = set("invalidEditColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def invalidEditColumnClassName(value: String | (js.Function2[/* cell */ js.Any, /* row */ js.Any, String])): this.type = set("invalidEditColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isKey(value: Boolean): this.type = set("isKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortFunc(
      value: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* keyof object */ /* sortField */ String, /* extraData */ js.Any) => Double
    ): this.type = set("sortFunc", js.Any.fromFunction5(value))
    
    @scala.inline
    def sortFuncExtraData(value: js.Any): this.type = set("sortFuncExtraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sortHeaderColumnClassNameFunction2(value: (/* order */ SortOrder, /* dataField */ String) => String): this.type = set("sortHeaderColumnClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def sortHeaderColumnClassName(value: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])): this.type = set("sortHeaderColumnClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tdAttr(value: CustomAttrs): this.type = set("tdAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tdStyleFunction4(
      value: (/* cell */ js.Any, /* row */ js.Any, /* rowIndex */ Double, /* columnIndex */ Double) => CSSProperties
    ): this.type = set("tdStyle", js.Any.fromFunction4(value))
    
    @scala.inline
    def tdStyle(
      value: CSSProperties | (js.Function4[
          /* cell */ js.Any, 
          /* row */ js.Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          CSSProperties
        ])
    ): this.type = set("tdStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thStyle(value: CSSProperties): this.type = set("thStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableHeaderColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TableHeaderColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
