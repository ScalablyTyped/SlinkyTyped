package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingStatistics extends js.Object {
  /**
    * Represents a map of severity to count statistic for a set of findings
    */
  var CountBySeverity: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.CountBySeverity] = js.native
}

object FindingStatistics {
  @scala.inline
  def apply(): FindingStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatistics]
  }
  @scala.inline
  implicit class FindingStatisticsOps[Self <: FindingStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountBySeverity(value: CountBySeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountBySeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountBySeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountBySeverity")(js.undefined)
        ret
    }
  }
  
}

