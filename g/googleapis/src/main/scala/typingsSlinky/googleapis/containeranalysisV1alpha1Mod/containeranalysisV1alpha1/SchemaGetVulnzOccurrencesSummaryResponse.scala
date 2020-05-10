package typingsSlinky.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of how many vulnz occurrences there are per severity type. counts
  * by groups, or if we should have different summary messages like this.
  */
@js.native
trait SchemaGetVulnzOccurrencesSummaryResponse extends js.Object {
  /**
    * A map of how many occurrences were found for each severity.
    */
  var counts: js.UndefOr[js.Array[SchemaSeverityCount]] = js.native
}

object SchemaGetVulnzOccurrencesSummaryResponse {
  @scala.inline
  def apply(): SchemaGetVulnzOccurrencesSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetVulnzOccurrencesSummaryResponse]
  }
  @scala.inline
  implicit class SchemaGetVulnzOccurrencesSummaryResponseOps[Self <: SchemaGetVulnzOccurrencesSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounts(value: js.Array[SchemaSeverityCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
  }
  
}

