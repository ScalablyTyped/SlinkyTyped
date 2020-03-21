package typingsSlinky.antd.directoryTreeMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.AnonEvent
import typingsSlinky.antd.AnonExpanded
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryTree
  extends Component[DirectoryTreeProps, DirectoryTreeState, js.Any] {
  var cachedSelectedKeys: js.UndefOr[js.Array[String]] = js.native
  var lastSelectedKey: js.UndefOr[String] = js.native
  var tree: typingsSlinky.antd.treeTreeMod.default = js.native
  def expandFolderNode(event: SyntheticMouseEvent[HTMLElement], node: js.Any): Unit = js.native
  def onClick(
    event: SyntheticMouseEvent[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDebounceExpand(
    event: SyntheticMouseEvent[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onDoubleClick(
    event: SyntheticMouseEvent[HTMLElement],
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventDataNode */ js.Any
  ): Unit = js.native
  def onExpand(expandedKeys: js.Array[String], info: AnonExpanded): Unit = js.native
  def onSelect(keys: js.Array[String], event: AnonEvent): Unit = js.native
  def renderDirectoryTree(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def setTreeRef(node: typingsSlinky.antd.treeTreeMod.default): Unit = js.native
  def setUncontrolledState(state: DirectoryTreeState): Unit = js.native
}

