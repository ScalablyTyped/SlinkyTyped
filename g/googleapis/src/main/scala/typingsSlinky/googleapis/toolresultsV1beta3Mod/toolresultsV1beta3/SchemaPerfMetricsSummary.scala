package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A summary of perf metrics collected and performance environment info
  */
@js.native
trait SchemaPerfMetricsSummary extends js.Object {
  var appStartTime: js.UndefOr[SchemaAppStartTime] = js.native
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Graphics statistics for the entire run. Statistics are reset at the
    * beginning of the run and collected at the end of the run.
    */
  var graphicsStats: js.UndefOr[SchemaGraphicsStats] = js.native
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Describes the environment in which the performance metrics were collected
    */
  var perfEnvironment: js.UndefOr[SchemaPerfEnvironment] = js.native
  /**
    * Set of resource collected
    */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}

object SchemaPerfMetricsSummary {
  @scala.inline
  def apply(): SchemaPerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfMetricsSummary]
  }
  @scala.inline
  implicit class SchemaPerfMetricsSummaryOps[Self <: SchemaPerfMetricsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppStartTime(value: SchemaAppStartTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executionId")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphicsStats(value: SchemaGraphicsStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphicsStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphicsStats")(js.undefined)
        ret
    }
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
    def withPerfEnvironment(value: SchemaPerfEnvironment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withPerfMetrics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetrics")(js.undefined)
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
    @scala.inline
    def withStepId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepId")(js.undefined)
        ret
    }
  }
  
}

