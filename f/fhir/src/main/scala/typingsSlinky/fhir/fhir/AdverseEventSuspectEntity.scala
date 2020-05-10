package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suspected agent causing the adverse event
  */
@js.native
trait AdverseEventSuspectEntity extends BackboneElement {
  /**
    * Contains extended information for property 'causality'.
    */
  var _causality: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'causalityProductRelatedness'.
    */
  var _causalityProductRelatedness: js.UndefOr[Element] = js.native
  /**
    * causality1 | causality2
    */
  var causality: js.UndefOr[code] = js.native
  /**
    * assess1 | assess2
    */
  var causalityAssessment: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.suspectEntity.causalityAuthor
    */
  var causalityAuthor: js.UndefOr[Reference] = js.native
  /**
    * method1 | method2
    */
  var causalityMethod: js.UndefOr[CodeableConcept] = js.native
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness
    */
  var causalityProductRelatedness: js.UndefOr[String] = js.native
  /**
    * result1 | result2
    */
  var causalityResult: js.UndefOr[CodeableConcept] = js.native
  /**
    * Refers to the specific entity that caused the adverse event
    */
  var instance: Reference = js.native
}

object AdverseEventSuspectEntity {
  @scala.inline
  def apply(instance: Reference): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
  @scala.inline
  implicit class AdverseEventSuspectEntityOps[Self <: AdverseEventSuspectEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_causality(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_causality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_causality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_causality")(js.undefined)
        ret
    }
    @scala.inline
    def with_causalityProductRelatedness(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_causalityProductRelatedness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_causalityProductRelatedness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_causalityProductRelatedness")(js.undefined)
        ret
    }
    @scala.inline
    def withCausality(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causality")(js.undefined)
        ret
    }
    @scala.inline
    def withCausalityAssessment(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityAssessment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausalityAssessment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityAssessment")(js.undefined)
        ret
    }
    @scala.inline
    def withCausalityAuthor(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausalityAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withCausalityMethod(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausalityMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withCausalityProductRelatedness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityProductRelatedness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausalityProductRelatedness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityProductRelatedness")(js.undefined)
        ret
    }
    @scala.inline
    def withCausalityResult(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCausalityResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("causalityResult")(js.undefined)
        ret
    }
  }
  
}

