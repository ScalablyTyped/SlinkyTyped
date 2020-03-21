package typingsSlinky.rcPagination.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcPagination.mod.PaginationProps
import typingsSlinky.rcPagination.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcPagination
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ String, /* element */ TagMod[Any]) => TagMod[Any] = null,
    jumpNextIcon: ReactComponentClass[js.Object] | TagMod[Any] = null,
    jumpPrevIcon: ReactComponentClass[js.Object] | TagMod[Any] = null,
    locale: js.Object = null,
    nextIcon: ReactComponentClass[js.Object] | TagMod[Any] = null,
    onChange: (/* page */ Double, /* pageSize */ Double) => Unit = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Unit = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    prefixCls: String = null,
    prevIcon: ReactComponentClass[js.Object] | TagMod[Any] = null,
    selectComponentClass: ReactComponentClass[js.Object] = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showPrevNextJumpers: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | js.Object = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => TagMod[Any] = null,
    total: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3(itemRender))
    if (jumpNextIcon != null) __obj.updateDynamic("jumpNextIcon")(jumpNextIcon.asInstanceOf[js.Any])
    if (jumpPrevIcon != null) __obj.updateDynamic("jumpPrevIcon")(jumpPrevIcon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2(onShowSizeChange))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.asInstanceOf[js.Any])
    if (selectComponentClass != null) __obj.updateDynamic("selectComponentClass")(selectComponentClass.asInstanceOf[js.Any])
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems.asInstanceOf[js.Any])
    if (!js.isUndefined(showPrevNextJumpers)) __obj.updateDynamic("showPrevNextJumpers")(showPrevNextJumpers.asInstanceOf[js.Any])
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2(showTotal))
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.rcPagination.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = PaginationProps
}

