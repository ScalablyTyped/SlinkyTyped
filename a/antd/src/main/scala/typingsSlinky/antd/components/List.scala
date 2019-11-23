package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.antdNumbers.`false`
import typingsSlinky.antd.esListMod.ListGridType
import typingsSlinky.antd.esListMod.ListItemLayout
import typingsSlinky.antd.esListMod.ListLocale
import typingsSlinky.antd.esListMod.ListProps
import typingsSlinky.antd.esListMod.ListSize
import typingsSlinky.antd.esListMod.default
import typingsSlinky.antd.esPaginationPaginationMod.PaginationConfig
import typingsSlinky.antd.esSpinMod.SpinProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esListMod.default[js.Any]].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, id */
  def apply[T](
    bordered: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[T] = null,
    extra: TagMod[Any] = null,
    footer: TagMod[Any] = null,
    grid: ListGridType = null,
    header: TagMod[Any] = null,
    itemLayout: ListItemLayout = null,
    loadMore: TagMod[Any] = null,
    loading: Boolean | SpinProps = null,
    locale: ListLocale = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    renderItem: (T, /* index */ Double) => TagMod[Any] = null,
    rowKey: (js.Function1[T, String]) | String = null,
    size: ListSize = null,
    split: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default[js.Any]] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    if (loadMore != null) __obj.updateDynamic("loadMore")(loadMore.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.antd.esListMod.default[js.Any]]]
  }
  type Props = ListProps[js.Any]
}

