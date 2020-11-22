package typingsSlinky.rcTree.treeMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcTree.anon.CheckedKeys
import typingsSlinky.rcTree.anon.PartialTreeState
import typingsSlinky.rcTree.contextTypesMod.NodeDragEventHandler
import typingsSlinky.rcTree.contextTypesMod.NodeMouseEventHandler
import typingsSlinky.rcTree.interfaceMod.EventDataNode
import typingsSlinky.rcTree.interfaceMod.FlattenNode
import typingsSlinky.rcTree.interfaceMod.Key
import typingsSlinky.rcTree.interfaceMod.NodeInstance
import typingsSlinky.rcTree.interfaceMod.ScrollTo
import typingsSlinky.rcTree.nodeListMod.NodeListRef
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tree
  extends Component[TreeProps, TreeState, js.Any] {
  
  def cleanDragState(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTree(): Unit = js.native
  
  var delayedDragEnterLogic: Record[Key, Double] = js.native
  
  var destroyed: Boolean = js.native
  
  var dragNode: NodeInstance = js.native
  
  def getActiveItem(): FlattenNode = js.native
  
  def getTreeNodeRequiredProps(): CheckedKeys = js.native
  
  var listRef: ReactRef[NodeListRef] = js.native
  
  def offsetActiveKey(offset: Double): Unit = js.native
  
  def onActiveChange(newActiveKey: Key): Unit = js.native
  
  var onBlur: FocusEventHandler[HTMLDivElement] = js.native
  
  var onFocus: FocusEventHandler[HTMLDivElement] = js.native
  
  var onKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
  
  def onListChangeEnd(): Unit = js.native
  
  def onListChangeStart(): Unit = js.native
  
  def onNodeCheck(e: SyntheticMouseEvent[HTMLSpanElement], treeNode: EventDataNode, checked: Boolean): Unit = js.native
  
  var onNodeClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeContextMenu: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeDoubleClick: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeDragEnd: NodeDragEventHandler[HTMLDivElement] = js.native
  
  /**
    * [Legacy] Select handler is less small than node,
    * so that this will trigger when drag enter node or select handler.
    * This is a little tricky if customize css without padding.
    * Better for use mouse move event to refresh drag state.
    * But let's just keep it to avoid event trigger logic change.
    */
  var onNodeDragEnter: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragLeave: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragOver: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDragStart: NodeDragEventHandler[HTMLDivElement] = js.native
  
  var onNodeDrop: NodeDragEventHandler[HTMLDivElement] = js.native
  
  def onNodeExpand(e: SyntheticMouseEvent[HTMLDivElement], treeNode: EventDataNode): Unit = js.native
  
  def onNodeLoad(treeNode: EventDataNode): js.Promise[_] = js.native
  
  var onNodeMouseEnter: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeMouseLeave: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var onNodeSelect: NodeMouseEventHandler[HTMLSpanElement] = js.native
  
  var scrollTo: ScrollTo = js.native
  
  /** Set uncontrolled `expandedKeys`. This will also auto update `flattenNodes`. */
  def setExpandedKeys(expandedKeys: js.Array[Key]): Unit = js.native
  
  /**
    * Only update the value which is not in props
    */
  def setUncontrolledState(state: PartialTreeState): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: js.UndefOr[scala.Nothing], forceState: PartialTreeState): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: Boolean): Unit = js.native
  def setUncontrolledState(state: PartialTreeState, atomic: Boolean, forceState: PartialTreeState): Unit = js.native
}
