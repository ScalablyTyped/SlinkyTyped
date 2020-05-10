package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The state of the crawler to which this condition applies.
    */
  var CrawlState: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlState] = js.native
  /**
    * The name of the crawler to which this condition applies.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[typingsSlinky.awsSdk.glueMod.LogicalOperator] = js.native
  /**
    * The condition state. Currently, the values supported are SUCCEEDED, STOPPED, TIMEOUT, and FAILED.
    */
  var State: js.UndefOr[JobRunState] = js.native
}

object Condition {
  @scala.inline
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlState(value: CrawlState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlState")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawlerName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalOperator(value: LogicalOperator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: JobRunState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
  }
  
}

