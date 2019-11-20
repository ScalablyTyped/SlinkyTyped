package typingsSlinky.antd.esTreeDirectoryTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.esTreeTreeMod.AntTreeNodeExpandedEvent
import typingsSlinky.antd.esTreeTreeMod.AntTreeNodeProps
import typingsSlinky.antd.esTreeTreeMod.AntTreeNodeSelectedEvent
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typingsSlinky.antd.esTreeTreeMod.default = js.native
  def expandFolderNode(event: SyntheticMouseEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): Unit = js.native
  def onClick(event: SyntheticMouseEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): Unit = js.native
  def onDebounceExpand(event: SyntheticMouseEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): Unit = js.native
  def onDoubleClick(event: SyntheticMouseEvent[HTMLElement], node: ReactComponentClass[AntTreeNodeProps]): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AntTreeNodeExpandedEvent): Unit | js.Thenable[Unit] = js.native
  def onSelect(keys: js.Array[String], event: AntTreeNodeSelectedEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  def setTreeRef(node: typingsSlinky.antd.esTreeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

