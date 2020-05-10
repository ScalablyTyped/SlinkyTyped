package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Processing and processing step details
  */
@js.native
trait SpecimenProcessing extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timeDateTime'.
    */
  var _timeDateTime: js.UndefOr[Element] = js.native
  /**
    * Material used in the processing step
    */
  var additive: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Textual description of procedure
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Indicates the treatment step  applied to the specimen
    */
  var procedure: js.UndefOr[CodeableConcept] = js.native
  /**
    * Date and time of specimen processing
    */
  var timeDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Date and time of specimen processing
    */
  var timePeriod: js.UndefOr[Period] = js.native
}

object SpecimenProcessing {
  @scala.inline
  def apply(): SpecimenProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenProcessing]
  }
  @scala.inline
  implicit class SpecimenProcessingOps[Self <: SpecimenProcessing] (val x: Self) extends AnyVal {
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
    def with_timeDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_timeDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_timeDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditive(value: js.Array[Reference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additive")(js.undefined)
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
    def withProcedure(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcedure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("procedure")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePeriod")(js.undefined)
        ret
    }
  }
  
}

