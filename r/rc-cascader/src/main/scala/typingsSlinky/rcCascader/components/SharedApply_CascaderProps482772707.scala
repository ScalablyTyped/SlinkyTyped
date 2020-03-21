package typingsSlinky.rcCascader.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.SyntheticKeyboardEvent
import slinky.web.html.`*`.tag
import typingsSlinky.rcCascader.cascaderMod.CascaderFieldNames
import typingsSlinky.rcCascader.cascaderMod.CascaderOption
import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_CascaderProps482772707[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    getPopupContainer: js.Any,
    builtinPlacements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Array[String] = null,
    dropdownMenuColumnStyle: CSSProperties = null,
    expandIcon: TagMod[Any] = null,
    expandTrigger: String = null,
    fieldNames: CascaderFieldNames = null,
    filedNames: CascaderFieldNames = null,
    loadData: /* selectOptions */ js.Array[CascaderOption] => Unit = null,
    loadingIcon: TagMod[Any] = null,
    onChange: (/* value */ js.Array[String], /* selectOptions */ js.Array[CascaderOption]) => Unit = null,
    onKeyDown: /* e */ SyntheticKeyboardEvent[HTMLElement] => Unit = null,
    onPopupVisibleChange: /* popupVisible */ Boolean => Unit = null,
    options: js.Array[CascaderOption] = null,
    popupClassName: String = null,
    popupPlacement: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    transitionName: String = null,
    value: js.Array[String] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (!js.isUndefined(changeOnSelect)) __obj.updateDynamic("changeOnSelect")(changeOnSelect.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownMenuColumnStyle != null) __obj.updateDynamic("dropdownMenuColumnStyle")(dropdownMenuColumnStyle.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (expandTrigger != null) __obj.updateDynamic("expandTrigger")(expandTrigger.asInstanceOf[js.Any])
    if (fieldNames != null) __obj.updateDynamic("fieldNames")(fieldNames.asInstanceOf[js.Any])
    if (filedNames != null) __obj.updateDynamic("filedNames")(filedNames.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (loadingIcon != null) __obj.updateDynamic("loadingIcon")(loadingIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupPlacement != null) __obj.updateDynamic("popupPlacement")(popupPlacement.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CascaderProps
}

