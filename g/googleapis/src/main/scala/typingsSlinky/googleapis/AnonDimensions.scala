package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDimensions extends js.Object {
  var dimensions: js.UndefOr[String] = js.native
  var `end-date`: js.UndefOr[String] = js.native
  var filters: js.UndefOr[String] = js.native
  var ids: js.UndefOr[String] = js.native
  var `max-results`: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[js.Array[String]] = js.native
  var samplingLevel: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
  var sort: js.UndefOr[js.Array[String]] = js.native
  var `start-date`: js.UndefOr[String] = js.native
  var `start-index`: js.UndefOr[Double] = js.native
}

object AnonDimensions {
  @scala.inline
  def apply(): AnonDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDimensions]
  }
  @scala.inline
  implicit class AnonDimensionsOps[Self <: AnonDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: String): Self = {
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
    def `withEnd-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutEnd-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end-date")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def `withMax-results`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutMax-results`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-results")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplingLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def `withStart-date`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStart-date`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-date")(js.undefined)
        ret
    }
    @scala.inline
    def `withStart-index`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStart-index`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start-index")(js.undefined)
        ret
    }
  }
  
}

