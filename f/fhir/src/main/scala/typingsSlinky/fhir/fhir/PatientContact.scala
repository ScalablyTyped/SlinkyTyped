package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
@js.native
trait PatientContact extends BackboneElement {
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.native
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object PatientContact {
  @scala.inline
  def apply(): PatientContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientContact]
  }
  @scala.inline
  implicit class PatientContactOps[Self <: PatientContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_gender(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_gender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gender")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress(value: Address): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: HumanName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationship(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
    @scala.inline
    def withTelecom(value: js.Array[ContactPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTelecom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telecom")(js.undefined)
        ret
    }
  }
  
}

