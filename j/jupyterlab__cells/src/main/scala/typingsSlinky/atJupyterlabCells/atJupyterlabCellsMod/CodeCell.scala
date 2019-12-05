package typingsSlinky.atJupyterlabCells.atJupyterlabCellsMod

import typingsSlinky.atJupyterlabApputils.libClientsessionMod.IClientSession
import typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell.IOptions
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/cells", "CodeCell")
@js.native
class CodeCell protected ()
  extends typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell {
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
  def execute(cell: typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell, session: IClientSession): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typingsSlinky.atJupyterlabCells.libWidgetMod.CodeCell,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}

