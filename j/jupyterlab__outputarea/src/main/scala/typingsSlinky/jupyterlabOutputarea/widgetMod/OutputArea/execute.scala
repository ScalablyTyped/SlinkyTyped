package typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/outputarea/lib/widget", "OutputArea.execute")
@js.native
object execute extends js.Object {
  
  /**
    * Execute code on an output area.
    */
  def apply(
    code: String,
    output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
    sessionContext: ISessionContext
  ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
  def apply(
    code: String,
    output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
    sessionContext: ISessionContext,
    metadata: JSONObject
  ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
}
