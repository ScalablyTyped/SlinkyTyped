package typingsSlinky.azdata.mod

import typingsSlinky.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptingProvider extends DataProvider {
  def registerOnScriptingComplete(handler: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _]): Unit = js.native
  def scriptAsOperation(
    connectionUri: String,
    operation: ScriptOperation,
    metadata: ObjectMetadata,
    paramDetails: ScriptingParamDetails
  ): Thenable[ScriptingResult] = js.native
}

object ScriptingProvider {
  @scala.inline
  def apply(
    providerId: String,
    registerOnScriptingComplete: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _] => Unit,
    scriptAsOperation: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
  ): ScriptingProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], registerOnScriptingComplete = js.Any.fromFunction1(registerOnScriptingComplete), scriptAsOperation = js.Any.fromFunction4(scriptAsOperation))
    __obj.asInstanceOf[ScriptingProvider]
  }
  @scala.inline
  implicit class ScriptingProviderOps[Self <: ScriptingProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegisterOnScriptingComplete(value: js.Function1[/* scriptingCompleteResult */ ScriptingCompleteResult, _] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerOnScriptingComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScriptAsOperation(
      value: (String, ScriptOperation, ObjectMetadata, ScriptingParamDetails) => Thenable[ScriptingResult]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptAsOperation")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

