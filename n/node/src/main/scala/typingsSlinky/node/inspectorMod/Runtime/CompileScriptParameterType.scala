package typingsSlinky.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileScriptParameterType extends js.Object {
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  /**
    * Expression to compile.
    */
  var expression: String = js.native
  /**
    * Specifies whether the compiled script should be persisted.
    */
  var persistScript: Boolean = js.native
  /**
    * Source url to be set for the script.
    */
  var sourceURL: String = js.native
}

object CompileScriptParameterType {
  @scala.inline
  def apply(expression: String, persistScript: Boolean, sourceURL: String): CompileScriptParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], persistScript = persistScript.asInstanceOf[js.Any], sourceURL = sourceURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileScriptParameterType]
  }
  @scala.inline
  implicit class CompileScriptParameterTypeOps[Self <: CompileScriptParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistScript(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistScript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionContextId(value: ExecutionContextId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionContextId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionContextId")(js.undefined)
        ret
    }
  }
  
}

