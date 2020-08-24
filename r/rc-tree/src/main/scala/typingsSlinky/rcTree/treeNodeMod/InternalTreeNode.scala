package typingsSlinky.rcTree.treeNodeMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcTree.anon.DragNodeHighlight
import typingsSlinky.rcTree.rcTreeStrings.close
import typingsSlinky.rcTree.rcTreeStrings.open
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
@js.native
class InternalTreeNode ()
  extends Component[InternalTreeNodeProps, TreeNodeState, js.Any] {
  var onExpand: MouseEventHandler[HTMLDivElement] = js.native
  var selectHandle: HTMLSpanElement = js.native
  @JSName("state")
  var state_InternalTreeNode: DragNodeHighlight = js.native
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
  def onCheck(e: js.Any): Unit = js.native
  def onContextMenu(e: js.Any): Unit = js.native
  def onDragEnd(e: js.Any): Unit = js.native
  def onDragEnter(e: js.Any): Unit = js.native
  def onDragLeave(e: js.Any): Unit = js.native
  def onDragOver(e: js.Any): Unit = js.native
  def onDragStart(e: js.Any): Unit = js.native
  def onDrop(e: js.Any): Unit = js.native
  def onMouseEnter(e: js.Any): Unit = js.native
  def onMouseLeave(e: js.Any): Unit = js.native
  def onSelect(e: js.Any): Unit = js.native
  def onSelectorClick(e: js.Any): Unit = js.native
  def onSelectorDoubleClick(e: js.Any): Unit = js.native
  def renderCheckbox(): ReactElement = js.native
  def renderIcon(): ReactElement = js.native
  def renderSelector(): ReactElement = js.native
  def renderSwitcher(): ReactElement = js.native
  def setSelectHandle(node: js.Any): Unit = js.native
  def syncLoadData(props: js.Any): Unit = js.native
}

