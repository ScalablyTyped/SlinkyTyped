package typingsSlinky.googleapis

import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaDateRange
import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaDimensionValue
import typingsSlinky.googleapis.v32Mod.dfareportingV32.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDimension extends js.Object {
  var breakdown: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimension: js.UndefOr[String] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var overlapMetricNames: js.UndefOr[js.Array[String]] = js.native
  var pivoted: js.UndefOr[Boolean] = js.native
}

object AnonDimension {
  @scala.inline
  def apply(): AnonDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDimension]
  }
  @scala.inline
  implicit class AnonDimensionOps[Self <: AnonDimension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakdown(value: js.Array[SchemaSortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreakdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakdown")(js.undefined)
        ret
    }
    @scala.inline
    def withDateRange(value: SchemaDateRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateRange")(js.undefined)
        ret
    }
    @scala.inline
    def withDimension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensionFilters(value: js.Array[SchemaDimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withMetricNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetricNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricNames")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlapMetricNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetricNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlapMetricNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlapMetricNames")(js.undefined)
        ret
    }
    @scala.inline
    def withPivoted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivoted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivoted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivoted")(js.undefined)
        ret
    }
  }
  
}

