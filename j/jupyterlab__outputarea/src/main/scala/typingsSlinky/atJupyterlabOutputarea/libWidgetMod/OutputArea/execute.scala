package typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea

import typingsSlinky.atJupyterlabApputils.libClientsessionMod.IClientSession
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
@js.native
object execute extends js.Object {
  /**
    * Execute code on an output area.
    */
  def apply(
    code: String,
    output: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession
  ): js.Promise[IExecuteReplyMsg] = js.native
  def apply(
    code: String,
    output: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg] = js.native
}

