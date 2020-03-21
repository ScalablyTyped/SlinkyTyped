package typingsSlinky.rcTreeSelect.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcTreeSelect.interfaceMod.ChangeEventExtra
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import typingsSlinky.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typingsSlinky.rcTreeSelect.treeSelectMod.TreeSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TreeSelectProps1188603901[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  /* The following DOM/SVG props were specified: disabled, multiple, open */
  def apply[ValueType](
    autoClearSearchValue: js.UndefOr[Boolean] = js.undefined,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    defaultValue: ValueType = null,
    dropdownPopupAlign: js.Any = null,
    filterTreeNode: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any) = null,
    inputValue: String = null,
    loadData: /* dataNode */ LegacyDataNode => js.Promise[_] = null,
    maxTagCount: Int | Double = null,
    maxTagPlaceholder: /* omittedValues */ js.Array[LabelValueType] => TagMod[Any] = null,
    maxTagTextLength: Int | Double = null,
    onChange: (ValueType, /* labelList */ js.Array[TagMod[Any]], /* extra */ ChangeEventExtra) => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onTreeExpand: /* expandedKeys */ js.Array[Key] => Unit = null,
    onTreeLoad: /* loadedKeys */ js.Array[Key] => Unit = null,
    placeholder: TagMod[Any] = null,
    searchPlaceholder: TagMod[Any] = null,
    searchValue: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    showCheckedStrategy: CheckedStrategy = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showTreeIcon: js.UndefOr[Boolean] = js.undefined,
    switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = null,
    treeCheckStrictly: js.UndefOr[Boolean] = js.undefined,
    treeCheckable: Boolean | TagMod[Any] = null,
    treeData: js.Array[DataNode] = null,
    treeDataSimpleMode: Boolean | SimpleModeConfig = null,
    treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined,
    treeDefaultExpandedKeys: js.Array[Key] = null,
    treeExpandedKeys: js.Array[Key] = null,
    treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = null,
    treeLine: js.UndefOr[Boolean] = js.undefined,
    treeLoadedKeys: js.Array[Key] = null,
    treeMotion: js.Any = null,
    treeNodeFilterProp: String = null,
    treeNodeLabelProp: String = null,
    value: ValueType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClearSearchValue)) __obj.updateDynamic("autoClearSearchValue")(autoClearSearchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dropdownPopupAlign != null) __obj.updateDynamic("dropdownPopupAlign")(dropdownPopupAlign.asInstanceOf[js.Any])
    if (filterTreeNode != null) __obj.updateDynamic("filterTreeNode")(filterTreeNode.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction1(loadData))
    if (maxTagCount != null) __obj.updateDynamic("maxTagCount")(maxTagCount.asInstanceOf[js.Any])
    if (maxTagPlaceholder != null) __obj.updateDynamic("maxTagPlaceholder")(js.Any.fromFunction1(maxTagPlaceholder))
    if (maxTagTextLength != null) __obj.updateDynamic("maxTagTextLength")(maxTagTextLength.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onTreeExpand != null) __obj.updateDynamic("onTreeExpand")(js.Any.fromFunction1(onTreeExpand))
    if (onTreeLoad != null) __obj.updateDynamic("onTreeLoad")(js.Any.fromFunction1(onTreeLoad))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchValue != null) __obj.updateDynamic("searchValue")(searchValue.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow.asInstanceOf[js.Any])
    if (showCheckedStrategy != null) __obj.updateDynamic("showCheckedStrategy")(showCheckedStrategy.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showTreeIcon)) __obj.updateDynamic("showTreeIcon")(showTreeIcon.asInstanceOf[js.Any])
    if (switcherIcon != null) __obj.updateDynamic("switcherIcon")(switcherIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(treeCheckStrictly)) __obj.updateDynamic("treeCheckStrictly")(treeCheckStrictly.asInstanceOf[js.Any])
    if (treeCheckable != null) __obj.updateDynamic("treeCheckable")(treeCheckable.asInstanceOf[js.Any])
    if (treeData != null) __obj.updateDynamic("treeData")(treeData.asInstanceOf[js.Any])
    if (treeDataSimpleMode != null) __obj.updateDynamic("treeDataSimpleMode")(treeDataSimpleMode.asInstanceOf[js.Any])
    if (!js.isUndefined(treeDefaultExpandAll)) __obj.updateDynamic("treeDefaultExpandAll")(treeDefaultExpandAll.asInstanceOf[js.Any])
    if (treeDefaultExpandedKeys != null) __obj.updateDynamic("treeDefaultExpandedKeys")(treeDefaultExpandedKeys.asInstanceOf[js.Any])
    if (treeExpandedKeys != null) __obj.updateDynamic("treeExpandedKeys")(treeExpandedKeys.asInstanceOf[js.Any])
    if (treeIcon != null) __obj.updateDynamic("treeIcon")(treeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(treeLine)) __obj.updateDynamic("treeLine")(treeLine.asInstanceOf[js.Any])
    if (treeLoadedKeys != null) __obj.updateDynamic("treeLoadedKeys")(treeLoadedKeys.asInstanceOf[js.Any])
    if (treeMotion != null) __obj.updateDynamic("treeMotion")(treeMotion.asInstanceOf[js.Any])
    if (treeNodeFilterProp != null) __obj.updateDynamic("treeNodeFilterProp")(treeNodeFilterProp.asInstanceOf[js.Any])
    if (treeNodeLabelProp != null) __obj.updateDynamic("treeNodeLabelProp")(treeNodeLabelProp.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef]]
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, ComponentRef] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, ComponentRef](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TreeSelectProps[js.Any]
}

