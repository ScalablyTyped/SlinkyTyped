package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.filterDropdownMod.FilterDropdownProps
import typingsSlinky.antd.tableInterfaceMod.ColumnType
import typingsSlinky.antd.tableInterfaceMod.Key
import typingsSlinky.antd.tableInterfaceMod.TableLocale
import typingsSlinky.antd.useFilterMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterDropdown {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterDropdown", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[RecordType] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def filterState(value: FilterState[RecordType]): this.type = set("filterState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
  }
  
  def withProps[RecordType](p: FilterDropdownProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Unit
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], triggerFilter = js.Any.fromFunction1(triggerFilter))
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[FilterDropdownProps[RecordType]]))
  }
}
