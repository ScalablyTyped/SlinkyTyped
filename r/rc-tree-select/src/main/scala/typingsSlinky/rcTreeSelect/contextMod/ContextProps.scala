package typingsSlinky.rcTreeSelect.contextMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.LegacyDataNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextProps extends js.Object {
  var checkable: Boolean | TagMod[Any] = js.native
  var checkedKeys: js.Array[Key] = js.native
  var halfCheckedKeys: js.Array[Key] = js.native
  var showTreeIcon: Boolean = js.native
  var switcherIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = js.native
  var treeDefaultExpandAll: Boolean = js.native
  var treeDefaultExpandedKeys: js.Array[Key] = js.native
  var treeExpandedKeys: js.Array[Key] = js.native
  var treeIcon: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any = js.native
  var treeLine: Boolean = js.native
  var treeLoadedKeys: js.Array[Key] = js.native
  var treeMotion: js.Any = js.native
  var treeNodeFilterProp: String = js.native
  def loadData(treeNode: LegacyDataNode): js.Promise[_] = js.native
  def onTreeExpand(keys: js.Array[Key]): Unit = js.native
  def onTreeLoad(loadedKeys: js.Array[Key]): Unit = js.native
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
    def withCheckedKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfCheckedKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfCheckedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadData(value: LegacyDataNode => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTreeExpand(value: js.Array[Key] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTreeLoad(value: js.Array[Key] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTreeLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowTreeIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTreeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitcherIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switcherIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeDefaultExpandAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeDefaultExpandedKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeDefaultExpandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeExpandedKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeExpandedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeLoadedKeys(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeLoadedKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeMotion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeMotion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTreeNodeFilterProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeNodeFilterProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckableReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckable(value: Boolean | TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkable")(js.undefined)
        ret
    }
  }
  
}

