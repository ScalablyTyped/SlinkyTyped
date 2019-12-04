package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.antd.Anon_GoButton
import typingsSlinky.antd.antdStrings.`jump-next`
import typingsSlinky.antd.antdStrings.`jump-prev`
import typingsSlinky.antd.antdStrings.next
import typingsSlinky.antd.antdStrings.page
import typingsSlinky.antd.antdStrings.prev
import typingsSlinky.antd.libPaginationMod.default
import typingsSlinky.antd.libPaginationPaginationMod.PaginationProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("antd/lib/pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled */
  def apply(
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ ReactElement) => TagMod[Any] = null,
    locale: js.Object = null,
    onChange: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    prefixCls: String = null,
    role: String = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | Anon_GoButton = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => TagMod[Any] = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    style: CSSProperties = null,
    total: Int | Double = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems.asInstanceOf[js.Any])
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger.asInstanceOf[js.Any])
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PaginationProps
}

