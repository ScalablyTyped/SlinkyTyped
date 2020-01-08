package typingsSlinky.rcDashTable.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashTable.Anon_True
import typingsSlinky.rcDashTable.libInterfaceMod.ColumnType
import typingsSlinky.rcDashTable.libInterfaceMod.DefaultValueType
import typingsSlinky.rcDashTable.libInterfaceMod.GetRowKey
import typingsSlinky.rcDashTable.libInterfaceMod.TableComponents
import typingsSlinky.rcDashTable.libTableMod.TableProps
import typingsSlinky.rcDashTable.rcDashTableStrings.fixed
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TableProps_1756568672[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: className, id */
  def apply[ValueType](
    bodyStyle: CSSProperties = null,
    columns: js.Array[ColumnType[DefaultValueType]] = null,
    components: TableComponents = null,
    data: js.Array[ValueType] = null,
    emptyText: TagMod[Any] | js.Function0[TagMod[Any]] = null,
    footer: /* data */ js.Array[ValueType] => TagMod[Any] = null,
    getBodyWrapper: /* body */ ReactElement => ReactElement = null,
    onHeaderRow: (js.Array[ColumnType[DefaultValueType]], /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRow: (ValueType, /* index */ js.UndefOr[Double]) => HTMLAttributes[HTMLElement] = null,
    onRowClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onRowContextMenu: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onRowDoubleClick: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onRowMouseEnter: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    onRowMouseLeave: (ValueType, /* index */ Double, /* event */ SyntheticEvent[Event, org.scalajs.dom.raw.Element]) => Unit = null,
    prefixCls: String = null,
    rowClassName: String | (js.Function3[ValueType, /* index */ Double, /* indent */ Double, String]) = null,
    rowKey: String | GetRowKey[ValueType] = null,
    rowRef: (ValueType, /* index */ Double, /* indent */ Double) => Ref[ReactElement] = null,
    scroll: Anon_True = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tableLayout: fixed = null,
    title: /* data */ js.Array[ValueType] => TagMod[Any] = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (getBodyWrapper != null) __obj.updateDynamic("getBodyWrapper")(js.Any.fromFunction1(getBodyWrapper))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2(onHeaderRow))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2(onRow))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3(onRowClick))
    if (onRowContextMenu != null) __obj.updateDynamic("onRowContextMenu")(js.Any.fromFunction3(onRowContextMenu))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction3(onRowDoubleClick))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction3(onRowMouseEnter))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction3(onRowMouseLeave))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowRef != null) __obj.updateDynamic("rowRef")(js.Any.fromFunction3(rowRef))
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TableProps[js.Any]
}

