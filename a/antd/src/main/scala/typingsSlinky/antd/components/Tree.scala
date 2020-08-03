package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.anon.Checked
import typingsSlinky.antd.anon.ShowLeafIcon
import typingsSlinky.antd.directoryTreeMod.DirectoryTreeProps
import typingsSlinky.antd.treeTreeMod.AntTreeNodeProps
import typingsSlinky.antd.treeTreeMod.AntdTreeNodeAttribute
import typingsSlinky.antd.treeTreeMod.TreeProps
import typingsSlinky.rcTree.anon.DragNode
import typingsSlinky.rcTree.anon.Event
import typingsSlinky.rcTree.anon.EventNode
import typingsSlinky.rcTree.anon.Expanded
import typingsSlinky.rcTree.anon.ExpandedKeys
import typingsSlinky.rcTree.anon.Node
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.mod.default
import typingsSlinky.rcTree.treeMod.CheckInfo
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
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
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def blockNode(value: Boolean): this.type = set("blockNode", value.asInstanceOf[js.Any])
    @scala.inline
    def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
    @scala.inline
    def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    @scala.inline
    def checkedKeysVarargs(value: Key*): this.type = set("checkedKeys", js.Array(value :_*))
    @scala.inline
    def checkedKeys(value: js.Array[Key] | Checked): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultCheckedKeysVarargs(value: Key*): this.type = set("defaultCheckedKeys", js.Array(value :_*))
    @scala.inline
    def defaultCheckedKeys(value: js.Array[Key]): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultExpandedKeysVarargs(value: Key*): this.type = set("defaultExpandedKeys", js.Array(value :_*))
    @scala.inline
    def defaultExpandedKeys(value: js.Array[Key]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSelectedKeysVarargs(value: Key*): this.type = set("defaultSelectedKeys", js.Array(value :_*))
    @scala.inline
    def defaultSelectedKeys(value: js.Array[Key]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def expandedKeysVarargs(value: Key*): this.type = set("expandedKeys", js.Array(value :_*))
    @scala.inline
    def expandedKeys(value: js.Array[Key]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def filterAntTreeNode(value: ReactComponentClass[AntTreeNodeProps] => Boolean): this.type = set("filterAntTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def filterTreeNode(value: /* treeNode */ EventDataNode => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconFunction1(value: /* nodeProps */ AntdTreeNodeAttribute => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
    @scala.inline
    def icon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, ReactElement]) | ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def loadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): this.type = set("loadData", js.Any.fromFunction1(value))
    @scala.inline
    def loadedKeysVarargs(value: Key*): this.type = set("loadedKeys", js.Array(value :_*))
    @scala.inline
    def loadedKeys(value: js.Array[Key]): this.type = set("loadedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def motion(value: js.Any): this.type = set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def onActiveChange(value: /* key */ Key => Unit): this.type = set("onActiveChange", js.Any.fromFunction1(value))
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onCheck(
      value: (/* checked */ typingsSlinky.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo) => Unit
    ): this.type = set("onCheck", js.Any.fromFunction2(value))
    @scala.inline
    def onClick(
      value: (/* e */ SyntheticMouseEvent[org.scalajs.dom.raw.Element], /* treeNode */ EventDataNode) => Unit
    ): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onDoubleClick(
      value: (/* e */ SyntheticMouseEvent[org.scalajs.dom.raw.Element], /* treeNode */ EventDataNode) => Unit
    ): this.type = set("onDoubleClick", js.Any.fromFunction2(value))
    @scala.inline
    def onDragEnd(value: /* info */ EventNode => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragEnter(value: /* info */ ExpandedKeys => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onDragLeave(value: /* info */ EventNode => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onDragOver(value: /* info */ EventNode => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: /* info */ EventNode => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def onDrop(value: /* info */ DragNode => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def onExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): this.type = set("onLoad", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseEnter(value: /* info */ EventNode => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* info */ EventNode => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def onRightClick(value: /* info */ EventNode => Unit): this.type = set("onRightClick", js.Any.fromFunction1(value))
    @scala.inline
    def onSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def selectedKeysVarargs(value: Key*): this.type = set("selectedKeys", js.Array(value :_*))
    @scala.inline
    def selectedKeys(value: js.Array[Key]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def showLine(value: Boolean | ShowLeafIcon): this.type = set("showLine", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def switcherIcon(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def titleRender(value: /* node */ DataNode => ReactElement): this.type = set("titleRender", js.Any.fromFunction1(value))
    @scala.inline
    def treeDataVarargs(value: DataNode*): this.type = set("treeData", js.Array(value :_*))
    @scala.inline
    def treeData(value: js.Array[DataNode]): this.type = set("treeData", value.asInstanceOf[js.Any])
    @scala.inline
    def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeProps with RefAttributes[default]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tree.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object DirectoryTree {
    @JSImport("antd/lib/tree", "default.DirectoryTree")
    @js.native
    object component extends js.Object
    
    def withProps(p: DirectoryTreeProps): SharedBuilder_DirectoryTreeProps934662521 = new SharedBuilder_DirectoryTreeProps934662521(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: DirectoryTree.type): SharedBuilder_DirectoryTreeProps934662521 = new SharedBuilder_DirectoryTreeProps934662521(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object TreeNode {
    @JSImport("antd/lib/tree", "default.TreeNode")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      @scala.inline
      def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
      @scala.inline
      def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def data(value: DataNode): this.type = set("data", value.asInstanceOf[js.Any])
      @scala.inline
      def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def domRefRefObject(value: ReactRef[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
      @scala.inline
      def domRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): this.type = set("domRef", js.Any.fromFunction1(value))
      @scala.inline
      def domRef(value: Ref[HTMLDivElement]): this.type = set("domRef", value.asInstanceOf[js.Any])
      @scala.inline
      def domRefNull: this.type = set("domRef", null)
      @scala.inline
      def dragOver(value: Boolean): this.type = set("dragOver", value.asInstanceOf[js.Any])
      @scala.inline
      def dragOverGapBottom(value: Boolean): this.type = set("dragOverGapBottom", value.asInstanceOf[js.Any])
      @scala.inline
      def dragOverGapTop(value: Boolean): this.type = set("dragOverGapTop", value.asInstanceOf[js.Any])
      @scala.inline
      def eventKey(value: Key): this.type = set("eventKey", value.asInstanceOf[js.Any])
      @scala.inline
      def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
      @scala.inline
      def halfChecked(value: Boolean): this.type = set("halfChecked", value.asInstanceOf[js.Any])
      @scala.inline
      def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
      @scala.inline
      def iconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
      @scala.inline
      def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
      @scala.inline
      def isEndVarargs(value: Boolean*): this.type = set("isEnd", js.Array(value :_*))
      @scala.inline
      def isEnd(value: js.Array[Boolean]): this.type = set("isEnd", value.asInstanceOf[js.Any])
      @scala.inline
      def isLeaf(value: Boolean): this.type = set("isLeaf", value.asInstanceOf[js.Any])
      @scala.inline
      def isStartVarargs(value: Boolean*): this.type = set("isStart", js.Array(value :_*))
      @scala.inline
      def isStart(value: js.Array[Boolean]): this.type = set("isStart", value.asInstanceOf[js.Any])
      @scala.inline
      def loaded(value: Boolean): this.type = set("loaded", value.asInstanceOf[js.Any])
      @scala.inline
      def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
      @scala.inline
      def onMouseMove(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseMove", js.Any.fromFunction1(value))
      @scala.inline
      def pos(value: String): this.type = set("pos", value.asInstanceOf[js.Any])
      @scala.inline
      def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
      @scala.inline
      def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
      @scala.inline
      def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
      @scala.inline
      def switcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
      @scala.inline
      def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def titleFunction1(value: /* data */ DataNode => ReactElement): this.type = set("title", js.Any.fromFunction1(value))
      @scala.inline
      def title(value: ReactElement | (js.Function1[/* data */ DataNode, ReactElement])): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TreeNodeProps): typingsSlinky.antd.components.Tree.TreeNode.Builder = new typingsSlinky.antd.components.Tree.TreeNode.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TreeNode.type): typingsSlinky.antd.components.Tree.TreeNode.Builder = new typingsSlinky.antd.components.Tree.TreeNode.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

