package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolResultsExecution extends js.Object {
  /**
    * A tool results execution ID.
    * @OutputOnly
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * A tool results history ID.
    * @OutputOnly
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * The cloud project that owns the tool results execution.
    * @OutputOnly
    */
  var projectId: js.UndefOr[String] = js.native
}

object ToolResultsExecution {
  @scala.inline
  def apply(): ToolResultsExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolResultsExecution]
  }
  @scala.inline
  implicit class ToolResultsExecutionOps[Self <: ToolResultsExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(js.undefined)
        ret
    }
    @scala.inline
    def withHistoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("historyId")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

