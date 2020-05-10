package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveRuleSummary extends js.Object {
  /**
    * The time at which the archive rule was created.
    */
  var createdAt: js.Date = js.native
  /**
    * A filter used to define the archive rule.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the archive rule.
    */
  var ruleName: Name = js.native
  /**
    * The time at which the archive rule was last updated.
    */
  var updatedAt: js.Date = js.native
}

object ArchiveRuleSummary {
  @scala.inline
  def apply(createdAt: js.Date, filter: FilterCriteriaMap, ruleName: Name, updatedAt: js.Date): ArchiveRuleSummary = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveRuleSummary]
  }
  @scala.inline
  implicit class ArchiveRuleSummaryOps[Self <: ArchiveRuleSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: FilterCriteriaMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

