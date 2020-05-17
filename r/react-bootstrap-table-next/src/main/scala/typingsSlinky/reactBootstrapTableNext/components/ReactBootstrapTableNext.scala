package typingsSlinky.reactBootstrapTableNext.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTableNext.anon.DataSize
import typingsSlinky.reactBootstrapTableNext.anon.OptionsPaginationOptions
import typingsSlinky.reactBootstrapTableNext.anon.Order
import typingsSlinky.reactBootstrapTableNext.anon.Partialpaginationbooleanf
import typingsSlinky.reactBootstrapTableNext.anon.SortCaret
import typingsSlinky.reactBootstrapTableNext.mod.BootstrapTableProps
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import typingsSlinky.reactBootstrapTableNext.mod.ExpandRowProps
import typingsSlinky.reactBootstrapTableNext.mod.FilterPosition
import typingsSlinky.reactBootstrapTableNext.mod.RowEventHandlerProps
import typingsSlinky.reactBootstrapTableNext.mod.SearchProps
import typingsSlinky.reactBootstrapTableNext.mod.SelectRowProps
import typingsSlinky.reactBootstrapTableNext.mod.SortOrder
import typingsSlinky.reactBootstrapTableNext.mod.TableChangeState
import typingsSlinky.reactBootstrapTableNext.mod.TableChangeType
import typingsSlinky.reactBootstrapTableNext.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBootstrapTableNext {
  @JSImport("react-bootstrap-table-next", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: js.Object] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[js.Any]] {
    @scala.inline
    def bodyClasses(value: String): this.type = set("bodyClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def bootstrap4(value: Boolean): this.type = set("bootstrap4", value.asInstanceOf[js.Any])
    @scala.inline
    def bordered(value: Boolean): this.type = set("bordered", value.asInstanceOf[js.Any])
    @scala.inline
    def captionReactElement(value: ReactElement): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def caption(value: ReactElement | String): this.type = set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def cellEdit(value: js.Any): this.type = set("cellEdit", value.asInstanceOf[js.Any])
    @scala.inline
    def classes(value: String): this.type = set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def condensed(value: Boolean): this.type = set("condensed", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSortDirection(value: SortOrder): this.type = set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSorted(value: js.Array[Order]): this.type = set("defaultSorted", value.asInstanceOf[js.Any])
    @scala.inline
    def expandRow(value: ExpandRowProps[T]): this.type = set("expandRow", value.asInstanceOf[js.Any])
    @scala.inline
    def filter(value: js.Any): this.type = set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def filterPosition(value: FilterPosition): this.type = set("filterPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def filtersClasses(value: String): this.type = set("filtersClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def footerClasses(value: String): this.type = set("footerClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def headerClasses(value: String): this.type = set("headerClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def headerWrapperClasses(value: String): this.type = set("headerWrapperClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def hover(value: Boolean): this.type = set("hover", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def noDataIndication(value: () => ReactElement | String): this.type = set("noDataIndication", js.Any.fromFunction0(value))
    @scala.inline
    def onDataSizeChange(value: /* props */ DataSize => Unit): this.type = set("onDataSizeChange", js.Any.fromFunction1(value))
    @scala.inline
    def onExternalFilter(value: js.Any): this.type = set("onExternalFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def onFilter(value: js.Any): this.type = set("onFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def onSort(value: js.Any): this.type = set("onSort", value.asInstanceOf[js.Any])
    @scala.inline
    def onTableChange(value: (/* type */ TableChangeType, /* newState */ TableChangeState[T]) => Unit): this.type = set("onTableChange", js.Any.fromFunction2(value))
    @scala.inline
    def overlay(value: js.Any): this.type = set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def pagination(value: OptionsPaginationOptions): this.type = set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def parentClassNameFunction3(value: (/* isExpand */ Boolean, T, /* rowIndex */ Double) => String): this.type = set("parentClassName", js.Any.fromFunction3(value))
    @scala.inline
    def parentClassName(value: String | (js.Function3[/* isExpand */ Boolean, T, /* rowIndex */ Double, String])): this.type = set("parentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def remote(value: Boolean | Partialpaginationbooleanf): this.type = set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def rowClassesFunction2(value: (T, /* rowIndex */ Double) => String): this.type = set("rowClasses", js.Any.fromFunction2(value))
    @scala.inline
    def rowClasses(value: (js.Function2[T, /* rowIndex */ Double, String]) | String): this.type = set("rowClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def rowEvents(value: RowEventHandlerProps[_]): this.type = set("rowEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def rowStyleFunction2(value: (T, /* rowIndex */ Double) => CSSProperties): this.type = set("rowStyle", js.Any.fromFunction2(value))
    @scala.inline
    def rowStyle(value: (js.Function2[T, /* rowIndex */ Double, CSSProperties]) | CSSProperties): this.type = set("rowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def search(value: SearchProps[T] | Boolean): this.type = set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def selectRow(value: SelectRowProps[T]): this.type = set("selectRow", value.asInstanceOf[js.Any])
    @scala.inline
    def sort(value: SortCaret): this.type = set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def striped(value: Boolean): this.type = set("striped", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndexCell(value: Boolean): this.type = set("tabIndexCell", value.asInstanceOf[js.Any])
    @scala.inline
    def wrapperClasses(value: String): this.type = set("wrapperClasses", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: js.Object](p: BootstrapTableProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: js.Object](columns: js.Array[ColumnDescription[_, _]], data: js.Array[_], keyField: String): Builder[T] = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], keyField = keyField.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[BootstrapTableProps[T]]))
  }
}

