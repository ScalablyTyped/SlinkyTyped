package typingsSlinky.jupyterlabCells.mod

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def execute(cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = js.native
  def execute(
    cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg | Unit] = js.native
}
