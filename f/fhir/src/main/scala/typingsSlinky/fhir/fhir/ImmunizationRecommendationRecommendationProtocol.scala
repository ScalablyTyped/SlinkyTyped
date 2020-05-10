package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Protocol used by recommendation
  */
@js.native
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
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
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.native
  /**
    * Protocol details
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.native
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[String] = js.native
}

object ImmunizationRecommendationRecommendationProtocol {
  @scala.inline
  def apply(): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
  @scala.inline
  implicit class ImmunizationRecommendationRecommendationProtocolOps[Self <: ImmunizationRecommendationRecommendationProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

