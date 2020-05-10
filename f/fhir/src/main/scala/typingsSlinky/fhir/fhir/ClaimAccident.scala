package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about an accident
  */
@js.native
trait ClaimAccident extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: typingsSlinky.fhir.fhir.date = js.native
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.native
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.native
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object ClaimAccident {
  @scala.inline
  def apply(date: date): ClaimAccident = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimAccident]
  }
  @scala.inline
  implicit class ClaimAccidentOps[Self <: ClaimAccident] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_date(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationReference(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationReference")(js.undefined)
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

