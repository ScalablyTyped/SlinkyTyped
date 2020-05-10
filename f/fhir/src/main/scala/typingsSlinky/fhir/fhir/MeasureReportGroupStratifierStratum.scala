package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratum results, one for each unique value in the stratifier
  */
@js.native
trait MeasureReportGroupStratifierStratum extends BackboneElement {
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * What score this stratum achieved
    */
  var measureScore: js.UndefOr[decimal] = js.native
  /**
    * Population results in this stratum
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.native
  /**
    * The stratum value, e.g. male
    */
  var value: String = js.native
}

object MeasureReportGroupStratifierStratum {
  @scala.inline
  def apply(value: String): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
  @scala.inline
  implicit class MeasureReportGroupStratifierStratumOps[Self <: MeasureReportGroupStratifierStratum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_measureScore(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_measureScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_measureScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_measureScore")(js.undefined)
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasureScore(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureScore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasureScore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureScore")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulation(value: js.Array[MeasureReportGroupStratifierStratumPopulation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(js.undefined)
        ret
    }
  }
  
}

