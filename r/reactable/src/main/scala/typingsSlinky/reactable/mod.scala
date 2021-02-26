package typingsSlinky.reactable

import typingsSlinky.react.mod.Component
import typingsSlinky.reactable.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactable", "Table")
  @js.native
  class Table[T] protected ()
    extends Component[TableComponentProperties[T], js.Object, js.Any] {
    def this(props: TableComponentProperties[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableComponentProperties[T], context: js.Any) = this()
  }
  
  @JSImport("reactable", "Td")
  @js.native
  class Td protected ()
    extends Component[TdProperties, js.Object, js.Any] {
    def this(props: TdProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TdProperties, context: js.Any) = this()
  }
  
  @JSImport("reactable", "Tfoot")
  @js.native
  class Tfoot protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("reactable", "Th")
  @js.native
  class Th protected ()
    extends Component[ThProperties, js.Object, js.Any] {
    def this(props: ThProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ThProperties, context: js.Any) = this()
  }
  
  @JSImport("reactable", "Thead")
  @js.native
  class Thead protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("reactable", "Tr")
  @js.native
  class Tr[T] protected ()
    extends Component[TrProperties[T], js.Object, js.Any] {
    def this(props: TrProperties[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TrProperties[T], context: js.Any) = this()
  }
  
  type ColumnsType = String | KeyLabelObject
  
  type FilterMethodType = js.Function1[/* text */ String, Unit]
  
  @js.native
  trait KeyLabelObject extends StObject {
    
    var key: String = js.native
    
    var label: String = js.native
  }
  object KeyLabelObject {
    
    @scala.inline
    def apply(key: String, label: String): KeyLabelObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyLabelObject]
    }
    
    @scala.inline
    implicit class KeyLabelObjectMutableBuilder[Self <: KeyLabelObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactable.reactableStrings.asc
    - typingsSlinky.reactable.reactableStrings.desc
  */
  trait SortDirection extends StObject
  object SortDirection {
    
    @scala.inline
    def asc: typingsSlinky.reactable.reactableStrings.asc = "asc".asInstanceOf[typingsSlinky.reactable.reactableStrings.asc]
    
    @scala.inline
    def desc: typingsSlinky.reactable.reactableStrings.desc = "desc".asInstanceOf[typingsSlinky.reactable.reactableStrings.desc]
  }
  
  @js.native
  trait TableComponentProperties[T] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var columns: js.UndefOr[js.Array[ColumnsType]] = js.native
    
    var currentPage: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Array[T]] = js.native
    
    var defaultSort: js.UndefOr[Column] = js.native
    
    var filterBy: js.UndefOr[String] = js.native
    
    var filterable: js.UndefOr[js.Array[String]] = js.native
    
    var hideFilterInput: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var itemsPerPage: js.UndefOr[Double] = js.native
    
    var noDataText: js.UndefOr[String] = js.native
    
    var onFilter: js.UndefOr[FilterMethodType] = js.native
    
    var pageButtonLimit: js.UndefOr[Double] = js.native
    
    var sortBy: js.UndefOr[Boolean] = js.native
    
    var sortable: js.UndefOr[js.Array[String] | Boolean] = js.native
  }
  object TableComponentProperties {
    
    @scala.inline
    def apply[T](): TableComponentProperties[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableComponentProperties[T]]
    }
    
    @scala.inline
    implicit class TableComponentPropertiesMutableBuilder[Self <: TableComponentProperties[_], T] (val x: Self with TableComponentProperties[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[ColumnsType]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: ColumnsType*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSort(value: Column): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
      
      @scala.inline
      def setFilterBy(value: String): Self = StObject.set(x, "filterBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      @scala.inline
      def setFilterable(value: js.Array[String]): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      @scala.inline
      def setFilterableVarargs(value: String*): Self = StObject.set(x, "filterable", js.Array(value :_*))
      
      @scala.inline
      def setHideFilterInput(value: Boolean): Self = StObject.set(x, "hideFilterInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFilterInputUndefined: Self = StObject.set(x, "hideFilterInput", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      @scala.inline
      def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* text */ String => Unit): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setPageButtonLimit(value: Double): Self = StObject.set(x, "pageButtonLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageButtonLimitUndefined: Self = StObject.set(x, "pageButtonLimit", js.undefined)
      
      @scala.inline
      def setSortBy(value: Boolean): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      @scala.inline
      def setSortable(value: js.Array[String] | Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setSortableVarargs(value: String*): Self = StObject.set(x, "sortable", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TdProperties extends StObject {
    
    var column: String = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object TdProperties {
    
    @scala.inline
    def apply(column: String): TdProperties = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
      __obj.asInstanceOf[TdProperties]
    }
    
    @scala.inline
    implicit class TdPropertiesMutableBuilder[Self <: TdProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait ThProperties extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var column: String = js.native
  }
  object ThProperties {
    
    @scala.inline
    def apply(column: String): ThProperties = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThProperties]
    }
    
    @scala.inline
    implicit class ThPropertiesMutableBuilder[Self <: ThProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TrProperties[T] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var data: js.UndefOr[T] = js.native
  }
  object TrProperties {
    
    @scala.inline
    def apply[T](): TrProperties[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrProperties[T]]
    }
    
    @scala.inline
    implicit class TrPropertiesMutableBuilder[Self <: TrProperties[_], T] (val x: Self with TrProperties[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
}
