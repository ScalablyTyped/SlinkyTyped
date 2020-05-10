package typingsSlinky.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDashboardsOutput extends js.Object {
  /**
    * The list of matching dashboards.
    */
  var DashboardEntries: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.DashboardEntries] = js.native
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudwatchMod.NextToken] = js.native
}

object ListDashboardsOutput {
  @scala.inline
  def apply(): ListDashboardsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDashboardsOutput]
  }
  @scala.inline
  implicit class ListDashboardsOutputOps[Self <: ListDashboardsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashboardEntries(value: DashboardEntries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashboardEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DashboardEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

