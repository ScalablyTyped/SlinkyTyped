package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What protocol was followed
  */
@js.native
trait ImmunizationVaccinationProtocol extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'seriesDoses'.
    */
  var _seriesDoses: js.UndefOr[Element] = js.native
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.native
  /**
    * Details of vaccine protocol
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Dose number within series
    */
  var doseSequence: js.UndefOr[positiveInt] = js.native
  /**
    * Indicates if dose counts towards immunity
    */
  var doseStatus: CodeableConcept = js.native
  /**
    * Why dose does (not) count
    */
  var doseStatusReason: js.UndefOr[CodeableConcept] = js.native
  /**
    * Name of vaccine series
    */
  var series: js.UndefOr[String] = js.native
  /**
    * Recommended number of doses for immunity
    */
  var seriesDoses: js.UndefOr[positiveInt] = js.native
  /**
    * Disease immunized against
    */
  var targetDisease: js.Array[CodeableConcept] = js.native
}

object ImmunizationVaccinationProtocol {
  @scala.inline
  def apply(doseStatus: CodeableConcept, targetDisease: js.Array[CodeableConcept]): ImmunizationVaccinationProtocol = {
    val __obj = js.Dynamic.literal(doseStatus = doseStatus.asInstanceOf[js.Any], targetDisease = targetDisease.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationVaccinationProtocol]
  }
  @scala.inline
  implicit class ImmunizationVaccinationProtocolOps[Self <: ImmunizationVaccinationProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoseStatus(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetDisease(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDisease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_doseSequence(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doseSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_doseSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_doseSequence")(js.undefined)
        ret
    }
    @scala.inline
    def with_series(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_series: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_series")(js.undefined)
        ret
    }
    @scala.inline
    def with_seriesDoses(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_seriesDoses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_seriesDoses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_seriesDoses")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthority(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authority")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseSequence(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withDoseStatusReason(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseStatusReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoseStatusReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doseStatusReason")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesDoses(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDoses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesDoses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesDoses")(js.undefined)
        ret
    }
  }
  
}

