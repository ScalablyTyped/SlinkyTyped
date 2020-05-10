package typingsSlinky.rcTreeSelect.treeSelectMod

import slinky.core.TagMod
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
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any, 'onChange' | 'mode' | 'menuItemSelectedIcon' | 'dropdownRender' | 'dropdownAlign' | 'backfill' | 'getInputElement' | 'optionLabelProp' | 'tokenSeparators' | 'filterOption'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SelectProps<Array<DataNode>, ValueType> * / any[P]} */ @js.native
trait TreeSelectProps[ValueType] extends js.Object {
  var autoClearSearchValue: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[TagMod[Any]] = js.native
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var defaultValue: js.UndefOr[ValueType] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dropdownPopupAlign: js.UndefOr[js.Any] = js.native
  var filterTreeNode: js.UndefOr[
    Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
  ] = js.native
  /** @deprecated Use `searchValue` instead */
  var inputValue: js.UndefOr[String] = js.native
  var loadData: js.UndefOr[js.Function1[/* dataNode */ LegacyDataNode, js.Promise[_]]] = js.native
  var maxTagCount: js.UndefOr[Double] = js.native
  var maxTagPlaceholder: js.UndefOr[js.Function1[/* omittedValues */ js.Array[LabelValueType], TagMod[Any]]] = js.native
  var maxTagTextLength: js.UndefOr[Double] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function3[
      /* value */ ValueType, 
      /* labelList */ js.Array[TagMod[Any]], 
      /* extra */ ChangeEventExtra, 
      Unit
    ]
  ] = js.native
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onTreeExpand: js.UndefOr[js.Function1[/* expandedKeys */ js.Array[Key], Unit]] = js.native
  var onTreeLoad: js.UndefOr[js.Function1[/* loadedKeys */ js.Array[Key], Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[TagMod[Any]] = js.native
  /** `searchPlaceholder` has been removed since search box has been merged into input box */
  var searchPlaceholder: js.UndefOr[TagMod[Any]] = js.native
  var searchValue: js.UndefOr[String] = js.native
  var showArrow: js.UndefOr[Boolean] = js.native
  var showCheckedStrategy: js.UndefOr[CheckedStrategy] = js.native
  var showSearch: js.UndefOr[Boolean] = js.native
  var showTreeIcon: js.UndefOr[Boolean] = js.native
  var switcherIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.native
  var treeCheckStrictly: js.UndefOr[Boolean] = js.native
  var treeCheckable: js.UndefOr[Boolean | TagMod[Any]] = js.native
  var treeData: js.UndefOr[js.Array[DataNode]] = js.native
  var treeDataSimpleMode: js.UndefOr[Boolean | SimpleModeConfig] = js.native
  var treeDefaultExpandAll: js.UndefOr[Boolean] = js.native
  var treeDefaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
  var treeExpandedKeys: js.UndefOr[js.Array[Key]] = js.native
  var treeIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ] = js.native
  var treeLine: js.UndefOr[Boolean] = js.native
  var treeLoadedKeys: js.UndefOr[js.Array[Key]] = js.native
  var treeMotion: js.UndefOr[js.Any] = js.native
  var treeNodeFilterProp: js.UndefOr[String] = js.native
  var treeNodeLabelProp: js.UndefOr[String] = js.native
  var value: js.UndefOr[ValueType] = js.native
}

object TreeSelectProps {
  @scala.inline
  def apply[ValueType](): TreeSelectProps[ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeSelectProps[ValueType]]
  }
  @scala.inline
  implicit class TreeSelectPropsOps[Self[valuetype] <: TreeSelectProps[valuetype], ValueType] (val x: Self[ValueType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ValueType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ValueType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ValueType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ValueType] with Other]
    @scala.inline
    def withAutoClearSearchValue(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClearSearchValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoClearSearchValue: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClearSearchValue")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultOpen(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultOpen: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: ValueType): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownPopupAlign(value: js.Any): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPopupAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownPopupAlign: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownPopupAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTreeNode(
      value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
    ): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTreeNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTreeNode: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTreeNode")(js.undefined)
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputValue: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadData(value: /* dataNode */ LegacyDataNode => js.Promise[_]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadData: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagCount(value: Double): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTagCount: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagPlaceholder(value: /* omittedValues */ js.Array[LabelValueType] => TagMod[Any]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagPlaceholder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMaxTagPlaceholder: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTagTextLength(value: Double): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagTextLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTagTextLength: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTagTextLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiple(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiple: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiple")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* value */ ValueType, /* labelList */ js.Array[TagMod[Any]], /* extra */ ChangeEventExtra) => Unit
    ): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSearch(value: /* value */ String => Unit): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSearch: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTreeExpand(value: /* expandedKeys */ js.Array[Key] => Unit): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTreeExpand: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTreeLoad(value: /* loadedKeys */ js.Array[Key] => Unit): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTreeLoad: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: TagMod[Any]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchPlaceholderReactElement(value: ReactElement): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchPlaceholder(value: TagMod[Any]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchPlaceholder: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchValue(value: String): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchValue: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShowArrow(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowArrow: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckedStrategy(value: CheckedStrategy): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckedStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckedStrategy: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckedStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSearch(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSearch: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTreeIcon(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTreeIcon: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitcherIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switcherIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwitcherIcon: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switcherIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeCheckStrictly(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCheckStrictly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeCheckStrictly: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCheckStrictly")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeCheckableReactElement(value: ReactElement): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCheckable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeCheckable(value: Boolean | TagMod[Any]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCheckable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeCheckable: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeCheckable")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeData(value: js.Array[DataNode]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeData: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeData")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeDataSimpleMode(value: Boolean | SimpleModeConfig): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDataSimpleMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeDataSimpleMode: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDataSimpleMode")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeDefaultExpandAll(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeDefaultExpandAll: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandAll")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeDefaultExpandedKeys(value: js.Array[Key]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeDefaultExpandedKeys: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeExpandedKeys(value: js.Array[Key]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeExpandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeExpandedKeys: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeExpandedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeIcon: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeLine(value: Boolean): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeLine: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLine")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeLoadedKeys(value: js.Array[Key]): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLoadedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeLoadedKeys: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLoadedKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeMotion(value: js.Any): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeMotion: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMotion")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeNodeFilterProp(value: String): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeFilterProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeNodeFilterProp: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeFilterProp")(js.undefined)
        ret
    }
    @scala.inline
    def withTreeNodeLabelProp(value: String): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeLabelProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeNodeLabelProp: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeLabelProp")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: ValueType): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

