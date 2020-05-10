package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What other data should be reported with the measure
  */
@js.native
trait MeasureSupplementalData extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.native
  /**
    * Expression describing additional data to be reported
    */
  var criteria: js.UndefOr[String] = js.native
  /**
    * Identifier, unique within the measure
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Path to the supplemental data element
    */
  var path: js.UndefOr[String] = js.native
  /**
    * supplemental-data | risk-adjustment-factor
    */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object MeasureSupplementalData {
  @scala.inline
  def apply(): MeasureSupplementalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureSupplementalData]
  }
  @scala.inline
  implicit class MeasureSupplementalDataOps[Self <: MeasureSupplementalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_criteria(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_criteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_criteria")(js.undefined)
        ret
    }
    @scala.inline
    def with_path(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_path")(js.undefined)
        ret
    }
    @scala.inline
    def withCriteria(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(js.undefined)
        ret
    }
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withUsage(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.undefined)
        ret
    }
  }
  
}

