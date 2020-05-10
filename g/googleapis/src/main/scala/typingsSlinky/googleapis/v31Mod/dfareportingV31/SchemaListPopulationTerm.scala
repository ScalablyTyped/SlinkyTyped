package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remarketing List Population Rule Term.
  */
@js.native
trait SchemaListPopulationTerm extends js.Object {
  /**
    * Will be true if the term should check if the user is in the list and
    * false if the term should check if the user is not in the list. This field
    * is only relevant when type is set to LIST_MEMBERSHIP_TERM. False by
    * default.
    */
  var contains: js.UndefOr[Boolean] = js.native
  /**
    * Whether to negate the comparison result of this term during rule
    * evaluation. This field is only relevant when type is left unset or set to
    * CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var negation: js.UndefOr[Boolean] = js.native
  /**
    * Comparison operator of this term. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * ID of the list in question. This field is only relevant when type is set
    * to LIST_MEMBERSHIP_TERM.
    */
  var remarketingListId: js.UndefOr[String] = js.native
  /**
    * List population term type determines the applicable fields in this
    * object. If left unset or set to CUSTOM_VARIABLE_TERM, then variableName,
    * variableFriendlyName, operator, value, and negation are applicable. If
    * set to LIST_MEMBERSHIP_TERM then remarketingListId and contains are
    * applicable. If set to REFERRER_TERM then operator, value, and negation
    * are applicable.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Literal to compare the variable to. This field is only relevant when type
    * is left unset or set to CUSTOM_VARIABLE_TERM or REFERRER_TERM.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * Friendly name of this term&#39;s variable. This is a read-only,
    * auto-generated field. This field is only relevant when type is left unset
    * or set to CUSTOM_VARIABLE_TERM.
    */
  var variableFriendlyName: js.UndefOr[String] = js.native
  /**
    * Name of the variable (U1, U2, etc.) being compared in this term. This
    * field is only relevant when type is set to null, CUSTOM_VARIABLE_TERM or
    * REFERRER_TERM.
    */
  var variableName: js.UndefOr[String] = js.native
}

object SchemaListPopulationTerm {
  @scala.inline
  def apply(): SchemaListPopulationTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPopulationTerm]
  }
  @scala.inline
  implicit class SchemaListPopulationTermOps[Self <: SchemaListPopulationTerm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.undefined)
        ret
    }
    @scala.inline
    def withNegation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negation")(js.undefined)
        ret
    }
    @scala.inline
    def withOperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operator")(js.undefined)
        ret
    }
    @scala.inline
    def withRemarketingListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemarketingListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remarketingListId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableFriendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableFriendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withVariableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variableName")(js.undefined)
        ret
    }
  }
  
}

