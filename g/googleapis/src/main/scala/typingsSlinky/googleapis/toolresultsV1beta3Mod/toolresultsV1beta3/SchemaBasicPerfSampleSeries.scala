package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the metadata for basic sample series represented by a line
  * chart
  */
@js.native
trait SchemaBasicPerfSampleSeries extends js.Object {
  var perfMetricType: js.UndefOr[String] = js.native
  var perfUnit: js.UndefOr[String] = js.native
  var sampleSeriesLabel: js.UndefOr[String] = js.native
}

object SchemaBasicPerfSampleSeries {
  @scala.inline
  def apply(): SchemaBasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicPerfSampleSeries]
  }
  @scala.inline
  implicit class SchemaBasicPerfSampleSeriesOps[Self <: SchemaBasicPerfSampleSeries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerfMetricType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetricType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfMetricType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfMetricType")(js.undefined)
        ret
    }
    @scala.inline
    def withPerfUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerfUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perfUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withSampleSeriesLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSeriesLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleSeriesLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleSeriesLabel")(js.undefined)
        ret
    }
  }
  
}

