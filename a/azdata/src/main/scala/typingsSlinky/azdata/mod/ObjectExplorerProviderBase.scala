package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerProviderBase extends DataProvider {
  def expandNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean] = js.native
  def findNodes(findNodesInfo: FindNodesInfo): Thenable[ObjectExplorerFindNodesResponse] = js.native
  def refreshNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean] = js.native
  def registerOnExpandCompleted(handler: js.Function1[/* response */ ObjectExplorerExpandInfo, _]): Unit = js.native
}

object ObjectExplorerProviderBase {
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit
  ): ObjectExplorerProviderBase = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted))
    __obj.asInstanceOf[ObjectExplorerProviderBase]
  }
  @scala.inline
  implicit class ObjectExplorerProviderBaseOps[Self <: ObjectExplorerProviderBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpandNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindNodes(value: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRefreshNode(value: ExpandNodeInfo => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnExpandCompleted(value: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnExpandCompleted")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

