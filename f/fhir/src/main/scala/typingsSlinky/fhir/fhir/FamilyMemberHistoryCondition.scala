package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that the related person had
  */
@js.native
trait FamilyMemberHistoryCondition extends BackboneElement {
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.native
  /**
    * Condition suffered by relation
    */
  var code: CodeableConcept = js.native
  /**
    * Extra information about condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  /**
    * When condition first manifested
    */
  var onsetAge: js.UndefOr[Age] = js.native
  /**
    * When condition first manifested
    */
  var onsetPeriod: js.UndefOr[Period] = js.native
  /**
    * When condition first manifested
    */
  var onsetRange: js.UndefOr[Range] = js.native
  /**
    * When condition first manifested
    */
  var onsetString: js.UndefOr[String] = js.native
  /**
    * deceased | permanent disability | etc.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.native
}

object FamilyMemberHistoryCondition {
  @scala.inline
  def apply(code: CodeableConcept): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
  @scala.inline
  implicit class FamilyMemberHistoryConditionOps[Self <: FamilyMemberHistoryCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onsetString(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_onsetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onsetString")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: js.Array[Annotation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetAge(value: Age): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetAge")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetRange(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetRange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsetString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnsetString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsetString")(js.undefined)
        ret
    }
    @scala.inline
    def withOutcome(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcome")(js.undefined)
        ret
    }
  }
  
}

