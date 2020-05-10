package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides guide for interpretation
  */
@js.native
trait ObservationReferenceRange extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.native
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.native
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.native
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ObservationReferenceRange {
  @scala.inline
  def apply(): ObservationReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObservationReferenceRange]
  }
  @scala.inline
  implicit class ObservationReferenceRangeOps[Self <: ObservationReferenceRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_text(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_text: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_text")(js.undefined)
        ret
    }
    @scala.inline
    def withAge(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("age")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliesTo(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliesTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliesTo")(js.undefined)
        ret
    }
    @scala.inline
    def withHigh(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

