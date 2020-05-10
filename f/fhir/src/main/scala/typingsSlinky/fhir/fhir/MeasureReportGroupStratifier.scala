package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratification results
  */
@js.native
trait MeasureReportGroupStratifier extends BackboneElement {
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Stratum results, one for each unique value in the stratifier
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.native
}

object MeasureReportGroupStratifier {
  @scala.inline
  def apply(): MeasureReportGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureReportGroupStratifier]
  }
  @scala.inline
  implicit class MeasureReportGroupStratifierOps[Self <: MeasureReportGroupStratifier] (val x: Self) extends AnyVal {
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
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withStratum(value: js.Array[MeasureReportGroupStratifierStratum]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stratum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStratum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stratum")(js.undefined)
        ret
    }
  }
  
}

