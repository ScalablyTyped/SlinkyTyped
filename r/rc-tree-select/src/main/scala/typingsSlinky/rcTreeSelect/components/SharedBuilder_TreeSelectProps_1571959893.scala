package typingsSlinky.rcTreeSelect.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
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

@scala.inline
class SharedBuilder_TreeSelectProps_1571959893[R <: js.Object, ValueType] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def autoClearSearchValue(value: Boolean): this.type = set("autoClearSearchValue", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultValue(value: ValueType): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def dropdownPopupAlign(value: js.Any): this.type = set("dropdownPopupAlign", value.asInstanceOf[js.Any])
  @scala.inline
  def filterTreeNode(
    value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
  ): this.type = set("filterTreeNode", value.asInstanceOf[js.Any])
  @scala.inline
  def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
  @scala.inline
  def loadData(value: /* dataNode */ LegacyDataNode => js.Promise[_]): this.type = set("loadData", js.Any.fromFunction1(value))
  @scala.inline
  def maxTagCount(value: Double): this.type = set("maxTagCount", value.asInstanceOf[js.Any])
  @scala.inline
  def maxTagPlaceholder(value: /* omittedValues */ js.Array[LabelValueType] => TagMod[Any]): this.type = set("maxTagPlaceholder", js.Any.fromFunction1(value))
  @scala.inline
  def maxTagTextLength(value: Double): this.type = set("maxTagTextLength", value.asInstanceOf[js.Any])
  @scala.inline
  def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: (ValueType, /* labelList */ js.Array[TagMod[Any]], /* extra */ ChangeEventExtra) => Unit): this.type = set("onChange", js.Any.fromFunction3(value))
  @scala.inline
  def onSearch(value: /* value */ String => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
  @scala.inline
  def onTreeExpand(value: /* expandedKeys */ js.Array[Key] => Unit): this.type = set("onTreeExpand", js.Any.fromFunction1(value))
  @scala.inline
  def onTreeLoad(value: /* loadedKeys */ js.Array[Key] => Unit): this.type = set("onTreeLoad", js.Any.fromFunction1(value))
  @scala.inline
  def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholderReactElement(value: ReactElement): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def placeholder(value: TagMod[Any]): this.type = set("placeholder", value.asInstanceOf[js.Any])
  @scala.inline
  def searchPlaceholderReactElement(value: ReactElement): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
  @scala.inline
  def searchPlaceholder(value: TagMod[Any]): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
  @scala.inline
  def searchValue(value: String): this.type = set("searchValue", value.asInstanceOf[js.Any])
  @scala.inline
  def showArrow(value: Boolean): this.type = set("showArrow", value.asInstanceOf[js.Any])
  @scala.inline
  def showCheckedStrategy(value: CheckedStrategy): this.type = set("showCheckedStrategy", value.asInstanceOf[js.Any])
  @scala.inline
  def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
  @scala.inline
  def showTreeIcon(value: Boolean): this.type = set("showTreeIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def switcherIcon(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def treeCheckStrictly(value: Boolean): this.type = set("treeCheckStrictly", value.asInstanceOf[js.Any])
  @scala.inline
  def treeCheckableReactElement(value: ReactElement): this.type = set("treeCheckable", value.asInstanceOf[js.Any])
  @scala.inline
  def treeCheckable(value: Boolean | TagMod[Any]): this.type = set("treeCheckable", value.asInstanceOf[js.Any])
  @scala.inline
  def treeData(value: js.Array[DataNode]): this.type = set("treeData", value.asInstanceOf[js.Any])
  @scala.inline
  def treeDataSimpleMode(value: Boolean | SimpleModeConfig): this.type = set("treeDataSimpleMode", value.asInstanceOf[js.Any])
  @scala.inline
  def treeDefaultExpandAll(value: Boolean): this.type = set("treeDefaultExpandAll", value.asInstanceOf[js.Any])
  @scala.inline
  def treeDefaultExpandedKeys(value: js.Array[Key]): this.type = set("treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
  @scala.inline
  def treeExpandedKeys(value: js.Array[Key]): this.type = set("treeExpandedKeys", value.asInstanceOf[js.Any])
  @scala.inline
  def treeIcon(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  ): this.type = set("treeIcon", value.asInstanceOf[js.Any])
  @scala.inline
  def treeLine(value: Boolean): this.type = set("treeLine", value.asInstanceOf[js.Any])
  @scala.inline
  def treeLoadedKeys(value: js.Array[Key]): this.type = set("treeLoadedKeys", value.asInstanceOf[js.Any])
  @scala.inline
  def treeMotion(value: js.Any): this.type = set("treeMotion", value.asInstanceOf[js.Any])
  @scala.inline
  def treeNodeFilterProp(value: String): this.type = set("treeNodeFilterProp", value.asInstanceOf[js.Any])
  @scala.inline
  def treeNodeLabelProp(value: String): this.type = set("treeNodeLabelProp", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: ValueType): this.type = set("value", value.asInstanceOf[js.Any])
}

