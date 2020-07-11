package typingsSlinky.rcTreeSelect.contextMod

import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextProps extends js.Object {
  var checkable: Boolean | ReactElement
  var checkedKeys: js.Array[Key]
  var halfCheckedKeys: js.Array[Key]
  var showTreeIcon: Boolean
  var switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  var treeDefaultExpandAll: Boolean
  var treeDefaultExpandedKeys: js.Array[Key]
  var treeExpandedKeys: js.Array[Key]
  var treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
  var treeLine: Boolean
  var treeLoadedKeys: js.Array[Key]
  var treeMotion: js.Any
  var treeNodeFilterProp: String
  def loadData(treeNode: LegacyDataNode): js.Promise[_]
  def onTreeExpand(keys: js.Array[Key]): Unit
  def onTreeLoad(loadedKeys: js.Array[Key]): Unit
}

object ContextProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    loadData: LegacyDataNode => js.Promise[_],
    onTreeExpand: js.Array[Key] => Unit,
    onTreeLoad: js.Array[Key] => Unit,
    showTreeIcon: Boolean,
    switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any,
    treeDefaultExpandAll: Boolean,
    treeDefaultExpandedKeys: js.Array[Key],
    treeExpandedKeys: js.Array[Key],
    treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any,
    treeLine: Boolean,
    treeLoadedKeys: js.Array[Key],
    treeMotion: js.Any,
    treeNodeFilterProp: String
  ): ContextProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1(onTreeExpand), onTreeLoad = js.Any.fromFunction1(onTreeLoad), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], switcherIcon = switcherIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeIcon = treeIcon.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextProps]
  }
  @scala.inline
  implicit class ContextPropsOps[Self <: ContextProps] (val x: Self) extends AnyVal {
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
    def setCheckedKeysVarargs(value: Key*): Self = this.set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def setCheckedKeys(value: js.Array[Key]): Self = this.set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfCheckedKeysVarargs(value: Key*): Self = this.set("halfCheckedKeys", js.Array(value :_*))
    @scala.inline
    def setHalfCheckedKeys(value: js.Array[Key]): Self = this.set("halfCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadData(value: LegacyDataNode => js.Promise[_]): Self = this.set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTreeExpand(value: js.Array[Key] => Unit): Self = this.set("onTreeExpand", js.Any.fromFunction1(value))
    @scala.inline
    def setOnTreeLoad(value: js.Array[Key] => Unit): Self = this.set("onTreeLoad", js.Any.fromFunction1(value))
    @scala.inline
    def setShowTreeIcon(value: Boolean): Self = this.set("showTreeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitcherIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = this.set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDefaultExpandAll(value: Boolean): Self = this.set("treeDefaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = this.set("treeDefaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = this.set("treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeExpandedKeysVarargs(value: Key*): Self = this.set("treeExpandedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeExpandedKeys(value: js.Array[Key]): Self = this.set("treeExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = this.set("treeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeLine(value: Boolean): Self = this.set("treeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeLoadedKeysVarargs(value: Key*): Self = this.set("treeLoadedKeys", js.Array(value :_*))
    @scala.inline
    def setTreeLoadedKeys(value: js.Array[Key]): Self = this.set("treeLoadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeMotion(value: js.Any): Self = this.set("treeMotion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreeNodeFilterProp(value: String): Self = this.set("treeNodeFilterProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckableReactElement(value: ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckable(value: Boolean | ReactElement): Self = this.set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckable: Self = this.set("checkable", js.undefined)
  }
  
}

