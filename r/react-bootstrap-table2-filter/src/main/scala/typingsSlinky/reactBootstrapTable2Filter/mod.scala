package typingsSlinky.reactBootstrapTable2Filter

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactBootstrapTable2Filter.anon.Date
import typingsSlinky.reactBootstrapTable2Filter.anon.Label
import typingsSlinky.reactBootstrapTable2Filter.anon.PartialMultiSelectFilterP
import typingsSlinky.reactBootstrapTable2Filter.anon.PartialNumberFilterPropsa
import typingsSlinky.reactBootstrapTable2Filter.anon.PartialSelectFilterPropsa
import typingsSlinky.reactBootstrapTable2Filter.anon.PartialTextFilterPropsany
import typingsSlinky.reactBootstrapTableNext.mod.ColumnDescription
import typingsSlinky.reactBootstrapTableNext.mod.TableColumnFilterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * declaration for table filter sub module
    */
  @JSImport("react-bootstrap-table2-filter", JSImport.Default)
  @js.native
  def default(): js.Any = js.native
  
  @js.native
  sealed trait Comparator extends StObject
  @JSImport("react-bootstrap-table2-filter", "Comparator")
  @js.native
  object Comparator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Comparator with String] = js.native
    
    @js.native
    sealed trait EQ extends Comparator
    /* "=" */ val EQ: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.EQ with String = js.native
    
    @js.native
    sealed trait GE extends Comparator
    /* ">=" */ val GE: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.GE with String = js.native
    
    @js.native
    sealed trait GT extends Comparator
    /* ">" */ val GT: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.GT with String = js.native
    
    @js.native
    sealed trait LE extends Comparator
    /* "<=" */ val LE: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.LE with String = js.native
    
    @js.native
    sealed trait LIKE extends Comparator
    /* "LIKE" */ val LIKE: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.LIKE with String = js.native
    
    @js.native
    sealed trait LT extends Comparator
    /* "<" */ val LT: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.LT with String = js.native
    
    @js.native
    sealed trait NE extends Comparator
    /* "!=" */ val NE: typingsSlinky.reactBootstrapTable2Filter.mod.Comparator.NE with String = js.native
  }
  
  @js.native
  sealed trait FILTER_TYPES extends StObject
  @JSImport("react-bootstrap-table2-filter", "FILTER_TYPES")
  @js.native
  object FILTER_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FILTER_TYPES with String] = js.native
    
    @js.native
    sealed trait DATE extends FILTER_TYPES
    /* "DATE" */ val DATE: typingsSlinky.reactBootstrapTable2Filter.mod.FILTER_TYPES.DATE with String = js.native
    
    @js.native
    sealed trait MULTISELECT extends FILTER_TYPES
    /* "MULTISELECT" */ val MULTISELECT: typingsSlinky.reactBootstrapTable2Filter.mod.FILTER_TYPES.MULTISELECT with String = js.native
    
    @js.native
    sealed trait NUMBER extends FILTER_TYPES
    /* "NUMBER" */ val NUMBER: typingsSlinky.reactBootstrapTable2Filter.mod.FILTER_TYPES.NUMBER with String = js.native
    
    @js.native
    sealed trait SELECT extends FILTER_TYPES
    /* "SELECT" */ val SELECT: typingsSlinky.reactBootstrapTable2Filter.mod.FILTER_TYPES.SELECT with String = js.native
    
    @js.native
    sealed trait TEXT extends FILTER_TYPES
    /* "TEXT" */ val TEXT: typingsSlinky.reactBootstrapTable2Filter.mod.FILTER_TYPES.TEXT with String = js.native
  }
  
  @JSImport("react-bootstrap-table2-filter", "customFilter")
  @js.native
  def customFilter(props: CustomFilterProps): TableColumnFilterProps[_, _] = js.native
  
  @JSImport("react-bootstrap-table2-filter", "dateFilter")
  @js.native
  def dateFilter(props: DateFilter_[_]): TableColumnFilterProps[_, _] = js.native
  
  @JSImport("react-bootstrap-table2-filter", "multiSelectFilter")
  @js.native
  def multiSelectFilter(props: PartialMultiSelectFilterP): TableColumnFilterProps[_, _] = js.native
  
  @JSImport("react-bootstrap-table2-filter", "numberFilter")
  @js.native
  def numberFilter(props: PartialNumberFilterPropsa): TableColumnFilterProps[_, _] = js.native
  
  @JSImport("react-bootstrap-table2-filter", "selectFilter")
  @js.native
  def selectFilter(props: PartialSelectFilterPropsa): TableColumnFilterProps[_, _] = js.native
  
  @JSImport("react-bootstrap-table2-filter", "textFilter")
  @js.native
  def textFilter(): TableColumnFilterProps[_, _] = js.native
  @JSImport("react-bootstrap-table2-filter", "textFilter")
  @js.native
  def textFilter(props: PartialTextFilterPropsany): TableColumnFilterProps[_, _] = js.native
  
  @js.native
  trait CustomFilterProps extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var comparator: js.UndefOr[Comparator] = js.native
    
    var `type`: js.UndefOr[String | FILTER_TYPES] = js.native
  }
  object CustomFilterProps {
    
    @scala.inline
    def apply(): CustomFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFilterProps]
    }
    
    @scala.inline
    implicit class CustomFilterPropsMutableBuilder[Self <: CustomFilterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setType(value: String | FILTER_TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DateFilter_[T /* <: js.Object */]
    extends TableColumnFilterProps[TableColumnFilterProps[js.Any, js.Any], T] {
    
    var comparator: js.UndefOr[js.Array[Comparator]] = js.native
    
    var comparatorClassName: js.UndefOr[String] = js.native
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.native
    
    var dateClassName: js.UndefOr[String] = js.native
    
    var dateStyle: js.UndefOr[CSSProperties] = js.native
    
    @JSName("defaultValue")
    var defaultValue_DateFilter_ : js.UndefOr[Date] = js.native
    
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
  }
  object DateFilter_ {
    
    @scala.inline
    def apply[T /* <: js.Object */](): DateFilter_[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateFilter_[T]]
    }
    
    @scala.inline
    implicit class DateFilter_MutableBuilder[Self <: DateFilter_[_], T /* <: js.Object */] (val x: Self with DateFilter_[T]) extends AnyVal {
      
      @scala.inline
      def setComparator(value: js.Array[Comparator]): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      @scala.inline
      def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setComparatorVarargs(value: Comparator*): Self = StObject.set(x, "comparator", js.Array(value :_*))
      
      @scala.inline
      def setDateClassName(value: String): Self = StObject.set(x, "dateClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateClassNameUndefined: Self = StObject.set(x, "dateClassName", js.undefined)
      
      @scala.inline
      def setDateStyle(value: CSSProperties): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
    }
  }
  
  type MultiSelectFilterOptions = StringDictionary[String]
  
  /* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<string, T> & {  options :react-bootstrap-table2-filter.react-bootstrap-table2-filter.MultiSelectFilterOptions | (): react-bootstrap-table2-filter.react-bootstrap-table2-filter.MultiSelectFilterOptions,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator | undefined,   withoutEmptyOption :boolean | undefined} */
  @js.native
  trait MultiSelectFilterProps[T /* <: js.Object */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var comparator: js.UndefOr[Comparator] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[T]]] = js.native
    
    var options: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * When set the default selection is hidden from dropdown
      */
    var withoutEmptyOption: js.UndefOr[Boolean] = js.native
  }
  object MultiSelectFilterProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](options: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): MultiSelectFilterProps[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectFilterProps[T]]
    }
    
    @scala.inline
    implicit class MultiSelectFilterPropsMutableBuilder[Self <: MultiSelectFilterProps[_], T /* <: js.Object */] (val x: Self with MultiSelectFilterProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ String => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ String => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(value: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsFunction0(value: () => MultiSelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<any, any>, T> & {  options :std.Array<number> | undefined,   comparators :std.Array<react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator> | undefined,   withoutEmptyComparatorOption :boolean | undefined,   withoutEmptyNumberOption :boolean | undefined,   comparatorClassName :string | undefined,   numberClassName :string | undefined,   comparatorStyle :react.react.CSSProperties | undefined,   numberStyle :react.react.CSSProperties | undefined,   defaultValue :{  number :number,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator} | undefined} */
  @js.native
  trait NumberFilterProps[T /* <: js.Object */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var comparatorClassName: js.UndefOr[String] = js.native
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.native
    
    var comparators: js.UndefOr[js.Array[Comparator]] = js.native
    
    var defaultValue: js.UndefOr[js.Any] with js.UndefOr[typingsSlinky.reactBootstrapTable2Filter.anon.Comparator] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var numberClassName: js.UndefOr[String] = js.native
    
    var numberStyle: js.UndefOr[CSSProperties] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[T]]] = js.native
    
    var options: js.UndefOr[js.Array[Double]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * When set to true comparator dropdown does not show a "no selection" option
      */
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.native
    
    var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.native
  }
  object NumberFilterProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](
      defaultValue: js.UndefOr[js.Any] with js.UndefOr[typingsSlinky.reactBootstrapTable2Filter.anon.Comparator]
    ): NumberFilterProps[T] = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFilterProps[T]]
    }
    
    @scala.inline
    implicit class NumberFilterPropsMutableBuilder[Self <: NumberFilterProps[_], T /* <: js.Object */] (val x: Self with NumberFilterProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      @scala.inline
      def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      @scala.inline
      def setComparators(value: js.Array[Comparator]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      @scala.inline
      def setComparatorsVarargs(value: Comparator*): Self = StObject.set(x, "comparators", js.Array(value :_*))
      
      @scala.inline
      def setDefaultValue(
        value: js.UndefOr[js.Any] with js.UndefOr[typingsSlinky.reactBootstrapTable2Filter.anon.Comparator]
      ): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setNumberClassName(value: String): Self = StObject.set(x, "numberClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberClassNameUndefined: Self = StObject.set(x, "numberClassName", js.undefined)
      
      @scala.inline
      def setNumberStyle(value: CSSProperties): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
      
      @scala.inline
      def setWithoutEmptyNumberOption(value: Boolean): Self = StObject.set(x, "withoutEmptyNumberOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyNumberOptionUndefined: Self = StObject.set(x, "withoutEmptyNumberOption", js.undefined)
    }
  }
  
  type SelectFilterOptions = StringDictionary[String] | js.Array[Label]
  
  /* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<string, T> & {  options :react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions | (column : react-bootstrap-table-next.react-bootstrap-table-next.ColumnDescription<T, any>): react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterOptions,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator | undefined,   withoutEmptyOption :boolean | undefined} */
  @js.native
  trait SelectFilterProps[T /* <: js.Object */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var comparator: js.UndefOr[Comparator] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ String, Unit]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[T]]] = js.native
    
    var options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions]) = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * When the default unset selection is hidden from dropdown
      */
    var withoutEmptyOption: js.UndefOr[Boolean] = js.native
  }
  object SelectFilterProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](
      options: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions])
    ): SelectFilterProps[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectFilterProps[T]]
    }
    
    @scala.inline
    implicit class SelectFilterPropsMutableBuilder[Self <: SelectFilterProps[_], T /* <: js.Object */] (val x: Self with SelectFilterProps[T]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ String => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ String => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setOptions(
        value: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[T, _], SelectFilterOptions])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsFunction1(value: /* column */ ColumnDescription[T, _] => SelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<any, any>, T> & std.Partial<{  caseSensitive :boolean,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator,   onClick :(e : react.react.SyntheticEvent<std.Element, std.Event>): void | undefined}> */
  @js.native
  trait TextFilterProps[T /* <: js.Object */] extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var comparator: js.UndefOr[Comparator] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Event, Element], Unit]] = js.native
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[T]]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TextFilterProps {
    
    @scala.inline
    def apply[T /* <: js.Object */](): TextFilterProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextFilterProps[T]]
    }
    
    @scala.inline
    implicit class TextFilterPropsMutableBuilder[Self <: TextFilterProps[_], T /* <: js.Object */] (val x: Self with TextFilterProps[T]) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComparator(value: Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
