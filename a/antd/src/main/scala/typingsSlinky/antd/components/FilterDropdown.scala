package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libTableFilterDropdownMod.default
import typingsSlinky.antd.libTableInterfaceMod.ColumnProps
import typingsSlinky.antd.libTableInterfaceMod.FilterMenuProps
import typingsSlinky.antd.libTableInterfaceMod.TableLocale
import typingsSlinky.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilterDropdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("antd/lib/table/filterDropdown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    column: ColumnProps[T],
    confirmFilter: (ColumnProps[T], js.Array[Key]) => js.Any,
    dropdownPrefixCls: String,
    locale: TableLocale,
    prefixCls: String,
    selectedKeys: js.Array[String],
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], confirmFilter = js.Any.fromFunction2(confirmFilter), dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antd.libTableFilterDropdownMod.default[js.Any]]]
  }
  type Props = FilterMenuProps[js.Any]
}

