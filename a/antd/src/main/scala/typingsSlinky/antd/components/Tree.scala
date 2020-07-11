package typingsSlinky.antd.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.Checked
import typingsSlinky.antd.treeTreeMod.AntTreeNodeProps
import typingsSlinky.antd.treeTreeMod.AntdTreeNodeAttribute
import typingsSlinky.antd.treeTreeMod.TreeProps
import typingsSlinky.rcTree.mod.CheckData
import typingsSlinky.rcTree.mod.ExpandData
import typingsSlinky.rcTree.mod.InternalTreeNodeProps
import typingsSlinky.rcTree.mod.OnDragEndData
import typingsSlinky.rcTree.mod.OnDragEnterData
import typingsSlinky.rcTree.mod.OnDragLeaveData
import typingsSlinky.rcTree.mod.OnDragOverData
import typingsSlinky.rcTree.mod.OnDragStartData
import typingsSlinky.rcTree.mod.OnDropData
import typingsSlinky.rcTree.mod.OnMouseEnterData
import typingsSlinky.rcTree.mod.OnMouseLeaveData
import typingsSlinky.rcTree.mod.OnRightClickData
import typingsSlinky.rcTree.mod.SelectData
import typingsSlinky.rcTree.mod.default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  @JSImport("antd/lib/tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, Ref[js.Any] with js.Object] {
    @scala.inline
    def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def blockNode(value: Boolean): this.type = set("blockNode", value.asInstanceOf[js.Any])
    @scala.inline
    def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedKeysVarargs(value: js.Any*): this.type = set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def checkedKeys(
      value: (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]) | Checked
    ): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCheckedKeysVarargs(value: js.Any*): this.type = set("defaultCheckedKeys", js.Array(value :_*))
    @scala.inline
    def defaultCheckedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandedKeysVarargs(value: js.Any*): this.type = set("defaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def defaultExpandedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedKeysVarargs(value: js.Any*): this.type = set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def defaultSelectedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def expandedKeysVarargs(value: js.Any*): this.type = set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def expandedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def filterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): this.type = set("filterAntTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def filterTreeNode(value: ReactComponentClass[InternalTreeNodeProps] => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def icon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def loadData(value: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_]): this.type = set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def loadedKeysVarargs(value: js.Any*): this.type = set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def loadedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onCheck(value: (/* checkedKeys */ js.Array[String], /* e */ CheckData) => Unit): this.type = set("onCheck", js.Any.fromFunction2(value))
    @scala.inline
    def onDragEnd(value: /* props */ OnDragEndData => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: /* props */ OnDragEnterData => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: /* props */ OnDragLeaveData => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: /* props */ OnDragOverData => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: /* props */ OnDragStartData => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: /* props */ OnDropData => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onExpand(value: (/* expandedKeys */ js.Array[String], /* e */ ExpandData) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseEnter(value: /* props */ OnMouseEnterData => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* props */ OnMouseLeaveData => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onRightClick(value: /* props */ OnRightClickData => Unit): this.type = set("onRightClick", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: (/* selectedKeys */ js.Array[String], /* e */ SelectData) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeysVarargs(value: js.Any*): this.type = set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def selectedKeys(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
        ]
    ): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showLine(value: Boolean): this.type = set("showLine", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def switcherIcon(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeProps with RefAttributes[default]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

