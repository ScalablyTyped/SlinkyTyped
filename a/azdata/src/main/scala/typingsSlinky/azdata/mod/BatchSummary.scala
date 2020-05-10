package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchSummary extends js.Object {
  var executionElapsed: String = js.native
  var executionEnd: String = js.native
  var executionStart: String = js.native
  var hasError: Boolean = js.native
  var id: Double = js.native
  var resultSetSummaries: js.Array[ResultSetSummary] = js.native
  var selection: ISelectionData = js.native
}

object BatchSummary {
  @scala.inline
  def apply(
    executionElapsed: String,
    executionEnd: String,
    executionStart: String,
    hasError: Boolean,
    id: Double,
    resultSetSummaries: js.Array[ResultSetSummary],
    selection: ISelectionData
  ): BatchSummary = {
    val __obj = js.Dynamic.literal(executionElapsed = executionElapsed.asInstanceOf[js.Any], executionEnd = executionEnd.asInstanceOf[js.Any], executionStart = executionStart.asInstanceOf[js.Any], hasError = hasError.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resultSetSummaries = resultSetSummaries.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSummary]
  }
  @scala.inline
  implicit class BatchSummaryOps[Self <: BatchSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutionElapsed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionElapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultSetSummaries(value: js.Array[ResultSetSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: ISelectionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

