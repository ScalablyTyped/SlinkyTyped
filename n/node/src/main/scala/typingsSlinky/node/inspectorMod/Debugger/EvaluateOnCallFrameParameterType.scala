package typingsSlinky.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateOnCallFrameParameterType extends js.Object {
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
  /**
    * Expression to evaluate.
    */
  var expression: String = js.native
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether command line API should be available to the evaluated expression, defaults to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.native
}

object EvaluateOnCallFrameParameterType {
  @scala.inline
  def apply(callFrameId: CallFrameId, expression: String): EvaluateOnCallFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameParameterType]
  }
  @scala.inline
  implicit class EvaluateOnCallFrameParameterTypeOps[Self <: EvaluateOnCallFrameParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallFrameId(value: CallFrameId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callFrameId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneratePreview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratePreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatePreview")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeCommandLineAPI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCommandLineAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeCommandLineAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeCommandLineAPI")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnByValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnByValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnByValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnByValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withThrowOnSideEffect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnSideEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrowOnSideEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throwOnSideEffect")(js.undefined)
        ret
    }
  }
  
}

