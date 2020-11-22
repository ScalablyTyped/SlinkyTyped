package typingsSlinky.jupyterlabCells.widgetMod.CodeCell

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/cells/lib/widget", "CodeCell.execute")
@js.native
object execute extends js.Object {
  
  /**
    * Execute a cell given a client session.
    */
  def apply(cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def apply(
    cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}
