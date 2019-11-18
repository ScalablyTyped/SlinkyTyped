package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esTransferListMod.TransferListProps
import typingsSlinky.antd.esTransferMod.RenderResult
import typingsSlinky.antd.esTransferMod.TransferDirection
import typingsSlinky.antd.esTransferMod.TransferItem
import typingsSlinky.antd.esTransferMod.TransferProps
import typingsSlinky.antd.esTransferMod.default
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: className, disabled */
object Transfer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esTransferMod.default].asInstanceOf[String | js.Object]
  def apply(
    dataSource: js.Array[TransferItem],
    body: /* props */ TransferListProps => TagMod[Any] = null,
    filterOption: (/* inputValue */ String, /* item */ TransferItem) => Boolean = null,
    footer: /* props */ TransferListProps => TagMod[Any] = null,
    `lazy`: js.Object | Boolean = null,
    listStyle: CSSProperties = null,
    locale: js.Object = null,
    notFoundContent: TagMod[Any] = null,
    onChange: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Unit = null,
    onScroll: (/* direction */ TransferDirection, /* e */ SyntheticEvent[Event, HTMLDivElement]) => Unit = null,
    onSearch: (/* direction */ TransferDirection, /* value */ String) => Unit = null,
    onSearchChange: (/* direction */ TransferDirection, /* e */ ChangeEvent[HTMLInputElement]) => Unit = null,
    onSelectChange: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Unit = null,
    operationStyle: CSSProperties = null,
    operations: js.Array[String] = null,
    prefixCls: String = null,
    render: /* item */ TransferItem => RenderResult = null,
    rowKey: /* record */ TransferItem => String = null,
    searchPlaceholder: String = null,
    selectedKeys: js.Array[String] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetKeys: js.Array[String] = null,
    titles: js.Array[String] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1(body))
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2(onScroll))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2(onSearch))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2(onSearchChange))
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(js.Any.fromFunction2(onSelectChange))
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (rowKey != null) __obj.updateDynamic("rowKey")(js.Any.fromFunction1(rowKey))
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransferProps
}

