package typingsSlinky.jupyterlabCells.widgetMod.CodeCell

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def apply(cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def apply(
    cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

