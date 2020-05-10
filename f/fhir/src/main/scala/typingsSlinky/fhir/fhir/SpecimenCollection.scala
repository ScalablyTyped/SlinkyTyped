package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection details
  */
@js.native
trait SpecimenCollection extends BackboneElement {
  /**
    * Contains extended information for property 'collectedDateTime'.
    */
  var _collectedDateTime: js.UndefOr[Element] = js.native
  /**
    * Anatomical collection site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  /**
    * Collection time
    */
  var collectedDateTime: js.UndefOr[dateTime] = js.native
  /**
    * Collection time
    */
  var collectedPeriod: js.UndefOr[Period] = js.native
  /**
    * Who collected the specimen
    */
  var collector: js.UndefOr[Reference] = js.native
  /**
    * Technique used to perform collection
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  /**
    * The quantity of specimen collected
    */
  var quantity: js.UndefOr[Quantity] = js.native
}

object SpecimenCollection {
  @scala.inline
  def apply(): SpecimenCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenCollection]
  }
  @scala.inline
  implicit class SpecimenCollectionOps[Self <: SpecimenCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_collectedDateTime(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collectedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_collectedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_collectedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withBodySite(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodySite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySite")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectedDateTime(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectedPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectedPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectedPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectedPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withCollector(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collector")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Quantity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
  }
  
}

