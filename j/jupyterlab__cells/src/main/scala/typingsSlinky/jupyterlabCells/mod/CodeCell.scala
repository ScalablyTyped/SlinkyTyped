package typingsSlinky.jupyterlabCells.mod

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
class CodeCell protected ()
  extends typingsSlinky.jupyterlabCells.widgetMod.CodeCell {
  /**
    * Construct a code cell widget.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
object CodeCell extends js.Object {
  /**
    * Execute a cell given a client session.
    */
  def execute(cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

