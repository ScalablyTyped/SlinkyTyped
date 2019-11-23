package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antd.esCascaderMod.CascaderExpandTrigger
import typingsSlinky.antd.esCascaderMod.CascaderOptionType
import typingsSlinky.antd.esCascaderMod.CascaderProps
import typingsSlinky.antd.esCascaderMod.FieldNamesType
import typingsSlinky.antd.esCascaderMod.ShowSearchType
import typingsSlinky.antd.esCascaderMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esCascaderMod.default].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: className, disabled, placeholder */
  def apply(
    options: js.Array[CascaderOptionType],
    allowClear: js.UndefOr[Boolean] = js.undefined,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Array[String] = null,
    displayRender: (/* label */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => TagMod[Any] = null,
    expandTrigger: CascaderExpandTrigger = null,
    fieldNames: FieldNamesType = null,
    filedNames: FieldNamesType = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    inputPrefixCls: String = null,
    loadData: /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]] => Unit = null,
    notFoundContent: TagMod[Any] = null,
    onChange: (/* value */ js.Array[String], /* selectedOptions */ js.UndefOr[js.Array[CascaderOptionType]]) => Unit = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Unit = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    showSearch: Boolean | ShowSearchType = null,
    size: String = null,
    style: CSSProperties = null,
    suffixIcon: TagMod[Any] = null,
    value: js.Array[String] = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (displayRender != null) __obj.updateDynamic("displayRender")(js.Any.fromFunction2(displayRender))
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (filedNames != null) __obj.updateDynamic("filedNames")(filedNames.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (showSearch != null) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CascaderProps
}

