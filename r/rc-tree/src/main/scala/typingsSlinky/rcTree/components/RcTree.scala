package typingsSlinky.rcTree.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTree.anon.Checked
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
import typingsSlinky.rcTree.mod.TreeProps
import typingsSlinky.rcTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcTree {
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def checkableReactElement(value: ReactElement): this.type = set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def checkable(value: Boolean | ReactElement): this.type = set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedKeysVarargs(value: String*): this.type = set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def checkedKeys(value: js.Array[String] | Checked): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCheckedKeysVarargs(value: String*): this.type = set("defaultCheckedKeys", js.Array(value :_*))
    @scala.inline
    def defaultCheckedKeys(value: js.Array[String]): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandedKeysVarargs(value: String*): this.type = set("defaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def defaultExpandedKeys(value: js.Array[String]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedKeysVarargs(value: String*): this.type = set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def defaultSelectedKeys(value: js.Array[String]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def expandedKeysVarargs(value: String*): this.type = set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def expandedKeys(value: js.Array[String]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def filterTreeNode(value: ReactComponentClass[InternalTreeNodeProps] => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction1(value: /* props */ InternalTreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def icon(value: ReactElement | (js.Function1[/* props */ InternalTreeNodeProps, ReactElement])): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def loadData(value: ReactComponentClass[InternalTreeNodeProps] => js.Promise[_]): this.type = set("loadData", js.Any.fromFunction1(value))
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
    def selectedKeysVarargs(value: String*): this.type = set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def selectedKeys(value: js.Array[String]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showLine(value: Boolean): this.type = set("showLine", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcTree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

