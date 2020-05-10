package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a tool results history resource.
  */
@js.native
trait SchemaToolResultsHistory extends js.Object {
  /**
    * Required. A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Required. The cloud project that owns the tool results history.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaToolResultsHistory {
  @scala.inline
  def apply(): SchemaToolResultsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolResultsHistory]
  }
  @scala.inline
  implicit class SchemaToolResultsHistoryOps[Self <: SchemaToolResultsHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

