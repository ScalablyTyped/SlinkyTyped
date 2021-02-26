package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.GetPopupContainer
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.useFilterMod.FilterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterDropdownMod {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterDropdown", JSImport.Default)
  @js.native
  def default[RecordType](props: FilterDropdownProps[RecordType]): ReactElement = js.native
  
  @js.native
  trait FilterDropdownProps[RecordType] extends StObject {
    
    var children: ReactElement = js.native
    
    var column: ColumnType[RecordType] = js.native
    
    var columnKey: Key = js.native
    
    var dropdownPrefixCls: String = js.native
    
    var filterMultiple: Boolean = js.native
    
    var filterState: js.UndefOr[FilterState[RecordType]] = js.native
    
    var getPopupContainer: js.UndefOr[GetPopupContainer] = js.native
    
    var locale: TableLocale = js.native
    
    var prefixCls: String = js.native
    
    def triggerFilter(filterState: FilterState[RecordType]): Unit = js.native
  }
  object FilterDropdownProps {
    
    @scala.inline
    def apply[RecordType](
      column: ColumnType[RecordType],
      columnKey: Key,
      dropdownPrefixCls: String,
      filterMultiple: Boolean,
      locale: TableLocale,
      prefixCls: String,
      triggerFilter: FilterState[RecordType] => Unit
    ): FilterDropdownProps[RecordType] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
      __obj.asInstanceOf[FilterDropdownProps[RecordType]]
    }
    
    @scala.inline
    implicit class FilterDropdownPropsMutableBuilder[Self <: FilterDropdownProps[_], RecordType] (val x: Self with FilterDropdownProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColumn(value: ColumnType[RecordType]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnKey(value: Key): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterMultiple(value: Boolean): Self = StObject.set(x, "filterMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterState(value: FilterState[RecordType]): Self = StObject.set(x, "filterState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterStateUndefined: Self = StObject.set(x, "filterState", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerFilter(value: FilterState[RecordType] => Unit): Self = StObject.set(x, "triggerFilter", js.Any.fromFunction1(value))
    }
  }
}
