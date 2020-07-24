package typingsSlinky.rcTreeSelect.treeSelectMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.interfaceMod.ChangeEventExtra
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.SimpleModeConfig
import typingsSlinky.rcTreeSelect.strategyUtilMod.CheckedStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any, 'onChange' | 'mode' | 'menuItemSelectedIcon' | 'dropdownAlign' | 'backfill' | 'getInputElement' | 'optionLabelProp' | 'tokenSeparators' | 'filterOption'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any[P]} */ trait TreeSelectProps[ValueType] extends js.Object {
  var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var dropdownPopupAlign: js.UndefOr[js.Any] = js.undefined
  var filterTreeNode: js.UndefOr[
    Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
  ] = js.undefined
  /** @deprecated Use `searchValue` instead */
  var inputValue: js.UndefOr[String] = js.undefined
  var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[_]]] = js.undefined
  var maxTagCount: js.UndefOr[Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement]] = js.undefined
  var maxTagTextLength: js.UndefOr[Double] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ ValueType, 
      /* labelList */ js.Array[ReactElement], 
      /* extra */ ChangeEventExtra, 
      Unit
    ]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.undefined
  var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[Key], Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[ReactElement] = js.undefined
  /** `searchPlaceholder` has been removed since search box has been merged into input box */
  var searchPlaceholder: js.UndefOr[ReactElement] = js.undefined
  var searchValue: js.UndefOr[String] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showTreeIcon: js.UndefOr[Boolean] = js.undefined
  var switcherIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.undefined
  var treeCheckStrictly: js.UndefOr[Boolean] = js.undefined
  var treeCheckable: js.UndefOr[Boolean | ReactElement] = js.undefined
  var treeData: js.UndefOr[js.Array[DataNode]] = js.undefined
  var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.undefined
  var treeDefaultExpandAll: js.UndefOr[Boolean] = js.undefined
  var treeDefaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.undefined
  var treeLine: js.UndefOr[Boolean] = js.undefined
  var treeLoadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var treeMotion: js.UndefOr[js.Any] = js.undefined
  var treeNodeFilterProp: js.UndefOr[String] = js.undefined
  var treeNodeLabelProp: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[ValueType](): TreeSelectProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSelectProps[ValueType]]
  }
  @scala.inline
  implicit class TreeSelectPropsOps[Self <: TreeSelectProps[_], ValueType] (val x: Self with TreeSelectProps[ValueType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoClearSearchValue(value: Boolean): Self = this.set("autoClearSearchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClearSearchValue: Self = this.set("autoClearSearchValue", js.undefined)
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setDefaultValue(value: ValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDropdownPopupAlign(value: js.Any): Self = this.set("dropdownPopupAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownPopupAlign: Self = this.set("dropdownPopupAlign", js.undefined)
    @scala.inline
    def setFilterTreeNode(
      value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
    ): Self = this.set("filterTreeNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterTreeNode: Self = this.set("filterTreeNode", js.undefined)
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    @scala.inline
    def setLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[_]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    @scala.inline
    def setMaxTagCount(value: Double): Self = this.set("maxTagCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagCount: Self = this.set("maxTagCount", js.undefined)
    @scala.inline
    def setMaxTagPlaceholder(value: /* omittedValues */ js.Array[LabelValueType] => ReactElement): Self = this.set("maxTagPlaceholder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMaxTagPlaceholder: Self = this.set("maxTagPlaceholder", js.undefined)
    @scala.inline
    def setMaxTagTextLength(value: Double): Self = this.set("maxTagTextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTagTextLength: Self = this.set("maxTagTextLength", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* value */ ValueType, /* labelList */ js.Array[ReactElement], /* extra */ ChangeEventExtra) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSearch(value: /* value */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnTreeExpand(value: /* expandedKeys */ js.Array[Key] => Unit): Self = this.set("onTreeExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTreeExpand: Self = this.set("onTreeExpand", js.undefined)
    @scala.inline
    def setOnTreeLoad(value: /* loadedKeys */ js.Array[Key] => Unit): Self = this.set("onTreeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTreeLoad: Self = this.set("onTreeLoad", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPlaceholderReactElement(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceholder(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSearchPlaceholderReactElement(value: ReactElement): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchPlaceholder(value: ReactElement): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
    @scala.inline
    def setShowArrow(value: Boolean): Self = this.set("showArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowArrow: Self = this.set("showArrow", js.undefined)
    @scala.inline
    def setShowCheckedStrategy(value: CheckedStrategy): Self = this.set("showCheckedStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCheckedStrategy: Self = this.set("showCheckedStrategy", js.undefined)
    @scala.inline
    def setShowSearch(value: Boolean): Self = this.set("showSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSearch: Self = this.set("showSearch", js.undefined)
    @scala.inline
    def setShowTreeIcon(value: Boolean): Self = this.set("showTreeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTreeIcon: Self = this.set("showTreeIcon", js.undefined)
    @scala.inline
    def setSwitcherIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitcherIcon: Self = this.set("switcherIcon", js.undefined)
    @scala.inline
    def setTreeCheckStrictly(value: Boolean): Self = this.set("treeCheckStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeCheckStrictly: Self = this.set("treeCheckStrictly", js.undefined)
    @scala.inline
    def setTreeCheckableReactElement(value: ReactElement): Self = this.set("treeCheckable", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeCheckable(value: Boolean | ReactElement): Self = this.set("treeCheckable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeCheckable: Self = this.set("treeCheckable", js.undefined)
    @scala.inline
    def setTreeDataVarargs(value: DataNode*): Self = this.set("treeData", js.Array(value :_*))
    @scala.inline
    def setTreeData(value: js.Array[DataNode]): Self = this.set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeData: Self = this.set("treeData", js.undefined)
    @scala.inline
    def setTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self = this.set("treeDataSimpleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeDataSimpleMode: Self = this.set("treeDataSimpleMode", js.undefined)
    @scala.inline
    def setTreeDefaultExpandAll(value: Boolean): Self = this.set("treeDefaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeDefaultExpandAll: Self = this.set("treeDefaultExpandAll", js.undefined)
    @scala.inline
    def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = this.set("treeDefaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = this.set("treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeDefaultExpandedKeys: Self = this.set("treeDefaultExpandedKeys", js.undefined)
    @scala.inline
    def setTreeExpandedKeysVarargs(value: Key*): Self = this.set("treeExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeExpandedKeys(value: js.Array[Key]): Self = this.set("treeExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeExpandedKeys: Self = this.set("treeExpandedKeys", js.undefined)
    @scala.inline
    def setTreeIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = this.set("treeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeIcon: Self = this.set("treeIcon", js.undefined)
    @scala.inline
    def setTreeLine(value: Boolean): Self = this.set("treeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeLine: Self = this.set("treeLine", js.undefined)
    @scala.inline
    def setTreeLoadedKeysVarargs(value: Key*): Self = this.set("treeLoadedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeLoadedKeys(value: js.Array[Key]): Self = this.set("treeLoadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeLoadedKeys: Self = this.set("treeLoadedKeys", js.undefined)
    @scala.inline
    def setTreeMotion(value: js.Any): Self = this.set("treeMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeMotion: Self = this.set("treeMotion", js.undefined)
    @scala.inline
    def setTreeNodeFilterProp(value: String): Self = this.set("treeNodeFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeNodeFilterProp: Self = this.set("treeNodeFilterProp", js.undefined)
    @scala.inline
    def setTreeNodeLabelProp(value: String): Self = this.set("treeNodeLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeNodeLabelProp: Self = this.set("treeNodeLabelProp", js.undefined)
    @scala.inline
    def setValue(value: ValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

