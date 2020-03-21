package typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
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
    output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
    session: IClientSession
  ): js.Promise[IExecuteReplyMsg] = js.native
  def apply(
    code: String,
    output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
    session: IClientSession,
    metadata: JSONObject
  ): js.Promise[IExecuteReplyMsg] = js.native
}

