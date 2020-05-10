package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource containing usage stats for a given script, based on the supplied
  * filter and mask present in the request.
  */
@js.native
trait SchemaMetrics extends js.Object {
  /**
    * Number of active users.
    */
  var activeUsers: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  /**
    * Number of failed executions.
    */
  var failedExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
  /**
    * Number of total executions.
    */
  var totalExecutions: js.UndefOr[js.Array[SchemaMetricsValue]] = js.native
}

object SchemaMetrics {
  @scala.inline
  def apply(): SchemaMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetrics]
  }
  @scala.inline
  implicit class SchemaMetricsOps[Self <: SchemaMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveUsers(value: js.Array[SchemaMetricsValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedExecutions(value: js.Array[SchemaMetricsValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedExecutions")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalExecutions(value: js.Array[SchemaMetricsValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalExecutions")(js.undefined)
        ret
    }
  }
  
}

