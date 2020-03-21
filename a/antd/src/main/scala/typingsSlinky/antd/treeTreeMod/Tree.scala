package typingsSlinky.antd.treeTreeMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tree
  extends Component[TreeProps, js.Any, js.Any] {
  var tree: js.Any = js.native
  def renderTree(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def setTreeRef(node: js.Any): Unit = js.native
}

