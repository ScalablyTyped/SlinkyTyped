package typingsSlinky.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerPredicateCondition extends js.Object {
  /**
    * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawlerName` must also be specified. Conflicts with `state`.
    */
  var crawlState: js.UndefOr[String] = js.native
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.native
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
  /**
    * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `jobName` must also be specified. Conflicts with `crawlerState`.
    */
  var state: js.UndefOr[String] = js.native
}

object TriggerPredicateCondition {
  @scala.inline
  def apply(): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
  @scala.inline
  implicit class TriggerPredicateConditionOps[Self <: TriggerPredicateCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawlState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawlState")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawlerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawlerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crawlerName")(js.undefined)
        ret
    }
    @scala.inline
    def withJobName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobName")(js.undefined)
        ret
    }
    @scala.inline
    def withLogicalOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalOperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogicalOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logicalOperator")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

