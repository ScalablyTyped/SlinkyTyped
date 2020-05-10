package typingsSlinky.googleapis

import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaDateRange
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaDimensionValue
import typingsSlinky.googleapis.v31Mod.dfareportingV31.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCustomRichMediaEvents extends js.Object {
  var customRichMediaEvents: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var floodlightConfigId: js.UndefOr[SchemaDimensionValue] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reportProperties: js.UndefOr[AnonIncludeAttributedIPConversions] = js.native
}

object AnonCustomRichMediaEvents {
  @scala.inline
  def apply(): AnonCustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCustomRichMediaEvents]
  }
  @scala.inline
  implicit class AnonCustomRichMediaEventsOps[Self <: AnonCustomRichMediaEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomRichMediaEvents(value: js.Array[SchemaDimensionValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRichMediaEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRichMediaEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRichMediaEvents")(js.undefined)
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
    def withDimensions(value: js.Array[SchemaSortedDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigId(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigId")(js.undefined)
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
    def withReportProperties(value: AnonIncludeAttributedIPConversions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportProperties")(js.undefined)
        ret
    }
  }
  
}

