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
}

