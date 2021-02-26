package typingsSlinky.rcTree.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcTree.anon.Checked
import typingsSlinky.rcTree.anon.Event
import typingsSlinky.rcTree.anon.EventNode
import typingsSlinky.rcTree.anon.Expanded
import typingsSlinky.rcTree.anon.Node
import typingsSlinky.rcTree.anon.NodeDragEventParamsHTMLDi
import typingsSlinky.rcTree.anon.NodeDragEventParamsHTMLDiDragNode
import typingsSlinky.rcTree.contextTypesMod.NodeDragEventParams
import typingsSlinky.rcTree.contextTypesMod.NodeMouseEventParams
import typingsSlinky.rcTree.interfaceMod.DataNode
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.IconType
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.treeMod.CheckInfo
import typingsSlinky.rcTree.treeNodeMod.TreeNodeProps
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TreeProps_407499862[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checkable(value: Boolean | ReactElement): this.type = set("checkable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checkableReactElement(value: ReactElement): this.type = set("checkable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checkedKeys(value: js.Array[Key] | Checked): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def checkedKeysVarargs(value: Key*): this.type = set("checkedKeys", js.Array(value :_*))
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultCheckedKeys(value: js.Array[Key]): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultCheckedKeysVarargs(value: Key*): this.type = set("defaultCheckedKeys", js.Array(value :_*))
  
  @scala.inline
  def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultExpandedKeys(value: js.Array[Key]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultExpandedKeysVarargs(value: Key*): this.type = set("defaultExpandedKeys", js.Array(value :_*))
  
  @scala.inline
  def defaultSelectedKeys(value: js.Array[Key]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultSelectedKeysVarargs(value: Key*): this.type = set("defaultSelectedKeys", js.Array(value :_*))
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandedKeys(value: js.Array[Key]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def expandedKeysVarargs(value: Key*): this.type = set("expandedKeys", js.Array(value :_*))
  
  @scala.inline
  def filterTreeNode(value: /* treeNode */ EventDataNode => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
  
  @scala.inline
  def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("icon", js.Any.fromFunction1(value))
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loadData(value: /* treeNode */ EventDataNode => js.Promise[Unit]): this.type = set("loadData", js.Any.fromFunction1(value))
  
  @scala.inline
  def loadedKeys(value: js.Array[Key]): this.type = set("loadedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def loadedKeysVarargs(value: Key*): this.type = set("loadedKeys", js.Array(value :_*))
  
  @scala.inline
  def motion(value: js.Any): this.type = set("motion", value.asInstanceOf[js.Any])
  
  @scala.inline
  def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onActiveChange(value: /* key */ Key => Unit): this.type = set("onActiveChange", js.Any.fromFunction1(value))
  
  @scala.inline
  def onBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
  
  @scala.inline
  def onCheck(value: (/* checked */ Checked | js.Array[Key], /* info */ CheckInfo) => Unit): this.type = set("onCheck", js.Any.fromFunction2(value))
  
  @scala.inline
  def onClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onContextMenu", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDoubleClick(value: (/* e */ SyntheticMouseEvent[HTMLSpanElement], /* node */ EventDataNode) => Unit): this.type = set("onDoubleClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onDragEnd(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragEnter(value: /* info */ NodeDragEventParamsHTMLDi => Unit): this.type = set("onDragEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragLeave(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): this.type = set("onDragLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragOver(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): this.type = set("onDragOver", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDragStart(value: /* info */ NodeDragEventParams[HTMLDivElement] => Unit): this.type = set("onDragStart", js.Any.fromFunction1(value))
  
  @scala.inline
  def onDrop(value: /* info */ NodeDragEventParamsHTMLDiDragNode => Unit): this.type = set("onDrop", js.Any.fromFunction1(value))
  
  @scala.inline
  def onExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded) => Unit): this.type = set("onExpand", js.Any.fromFunction2(value))
  
  @scala.inline
  def onFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
  
  @scala.inline
  def onKeyDown(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): this.type = set("onKeyDown", js.Any.fromFunction1(value))
  
  @scala.inline
  def onLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ Node) => Unit): this.type = set("onLoad", js.Any.fromFunction2(value))
  
  @scala.inline
  def onMouseEnter(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
  
  @scala.inline
  def onMouseLeave(value: /* info */ NodeMouseEventParams[HTMLSpanElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
  
  @scala.inline
  def onRightClick(value: /* info */ EventNode => Unit): this.type = set("onRightClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def onSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
  
  @scala.inline
  def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedKeys(value: js.Array[Key]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
  
  @scala.inline
  def selectedKeysVarargs(value: Key*): this.type = set("selectedKeys", js.Array(value :_*))
  
  @scala.inline
  def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showLine(value: Boolean): this.type = set("showLine", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def switcherIconFunction1(value: /* props */ TreeNodeProps => ReactElement): this.type = set("switcherIcon", js.Any.fromFunction1(value))
  
  @scala.inline
  def switcherIconReactElement(value: ReactElement): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  @scala.inline
  def titleRender(value: /* node */ DataNode => ReactElement): this.type = set("titleRender", js.Any.fromFunction1(value))
  
  @scala.inline
  def treeData(value: js.Array[DataNode]): this.type = set("treeData", value.asInstanceOf[js.Any])
  
  @scala.inline
  def treeDataVarargs(value: DataNode*): this.type = set("treeData", js.Array(value :_*))
  
  @scala.inline
  def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
}
