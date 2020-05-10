package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionResult extends js.Object {
  /**
    * The action provider's external ID for the action execution.
    */
  var externalExecutionId: js.UndefOr[ExternalExecutionId] = js.native
  /**
    * The action provider's summary for the action execution.
    */
  var externalExecutionSummary: js.UndefOr[ExternalExecutionSummary] = js.native
  /**
    * The deepest external link to the external resource (for example, a repository URL or deployment endpoint) that is used when running the action.
    */
  var externalExecutionUrl: js.UndefOr[Url] = js.native
}

object ActionExecutionResult {
  @scala.inline
  def apply(): ActionExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionExecutionResult]
  }
  @scala.inline
  implicit class ActionExecutionResultOps[Self <: ActionExecutionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalExecutionId(value: ExternalExecutionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalExecutionSummary(value: ExternalExecutionSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalExecutionSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalExecutionUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalExecutionUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalExecutionUrl")(js.undefined)
        ret
    }
  }
  
}

