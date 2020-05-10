package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measure results for each group
  */
@js.native
trait MeasureReportGroup extends BackboneElement {
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.native
  /**
    * What group of the measure
    */
  var identifier: Identifier = js.native
  /**
    * What score this group achieved
    */
  var measureScore: js.UndefOr[decimal] = js.native
  /**
    * The populations in the group
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.native
  /**
    * Stratification results
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.native
}

object MeasureReportGroup {
  @scala.inline
  def apply(identifier: Identifier): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroup]
  }
  @scala.inline
  implicit class MeasureReportGroupOps[Self <: MeasureReportGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
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
    def withPopulation(value: js.Array[MeasureReportGroupPopulation]): Self = {
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
    @scala.inline
    def withStratifier(value: js.Array[MeasureReportGroupStratifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stratifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStratifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stratifier")(js.undefined)
        ret
    }
  }
  
}

