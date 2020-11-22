package typingsSlinky.rcTree.treeNodeMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.anon.DragNodeHighlight
import typingsSlinky.rcTree.rcTreeStrings.close
import typingsSlinky.rcTree.rcTreeStrings.open
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
@js.native
class InternalTreeNode ()
  extends Component[InternalTreeNodeProps, TreeNodeState, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MInternalTreeNode(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MInternalTreeNode(): Unit = js.native
  
  def getNodeState(): open | close = js.native
  
  def hasChildren(): Boolean = js.native
  
  def isCheckable(): js.Object = js.native
  
  def isDisabled(): Boolean = js.native
  
  def isLeaf(): Boolean = js.native
  
  def isSelectable(): Boolean = js.native
  
  def onCheck(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onContextMenu(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onDragEnd(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragEnter(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragLeave(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragOver(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDragStart(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  def onDrop(e: DragEvent[HTMLDivElement]): Unit = js.native
  
  var onExpand: MouseEventHandler[HTMLDivElement] = js.native
  
  def onMouseEnter(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onMouseLeave(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onSelect(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onSelectorClick(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def onSelectorDoubleClick(e: SyntheticMouseEvent[HTMLSpanElement]): Unit = js.native
  
  def renderCheckbox(): ReactElement = js.native
  
  def renderIcon(): ReactElement = js.native
  
  def renderSelector(): ReactElement = js.native
  
  def renderSwitcher(): ReactElement = js.native
  
  var selectHandle: HTMLSpanElement = js.native
  
  def setSelectHandle(node: js.Any): Unit = js.native
  
  @JSName("state")
  var state_InternalTreeNode: DragNodeHighlight = js.native
  
  def syncLoadData(props: js.Any): Unit = js.native
}
