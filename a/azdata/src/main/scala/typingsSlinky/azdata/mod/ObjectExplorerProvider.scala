package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectExplorerProvider extends ObjectExplorerProviderBase {
  var registerOnSessionDisconnected: js.UndefOr[
    js.Function1[/* handler */ js.Function1[/* response */ ObjectExplorerSession, _], Unit]
  ] = js.native
  def closeSession(closeSessionInfo: ObjectExplorerCloseSessionInfo): Thenable[ObjectExplorerCloseSessionResponse] = js.native
  def createNewSession(connInfo: ConnectionInfo): Thenable[ObjectExplorerSessionResponse] = js.native
  def registerOnSessionCreated(handler: js.Function1[/* response */ ObjectExplorerSession, _]): Unit = js.native
}

object ObjectExplorerProvider {
  @scala.inline
  def apply(
    closeSession: ObjectExplorerCloseSessionInfo => Thenable[ObjectExplorerCloseSessionResponse],
    createNewSession: ConnectionInfo => Thenable[ObjectExplorerSessionResponse],
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit,
    registerOnSessionCreated: js.Function1[/* response */ ObjectExplorerSession, _] => Unit
  ): ObjectExplorerProvider = {
    val __obj = js.Dynamic.literal(closeSession = js.Any.fromFunction1(closeSession), createNewSession = js.Any.fromFunction1(createNewSession), expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted), registerOnSessionCreated = js.Any.fromFunction1(registerOnSessionCreated))
    __obj.asInstanceOf[ObjectExplorerProvider]
  }
  @scala.inline
  implicit class ObjectExplorerProviderOps[Self <: ObjectExplorerProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseSession(value: ObjectExplorerCloseSessionInfo => Thenable[ObjectExplorerCloseSessionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateNewSession(value: ConnectionInfo => Thenable[ObjectExplorerSessionResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNewSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnSessionCreated(value: js.Function1[/* response */ ObjectExplorerSession, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnSessionCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterOnSessionDisconnected(value: /* handler */ js.Function1[/* response */ ObjectExplorerSession, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnSessionDisconnected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRegisterOnSessionDisconnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnSessionDisconnected")(js.undefined)
        ret
    }
  }
  
}

