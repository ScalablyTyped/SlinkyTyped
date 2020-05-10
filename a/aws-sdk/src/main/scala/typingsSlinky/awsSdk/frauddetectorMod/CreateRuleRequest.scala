package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleRequest extends js.Object {
  /**
    * The rule description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector ID for the rule's parent detector.
    */
  var detectorId: identifier = js.native
  /**
    * The rule expression.
    */
  var expression: ruleExpression = js.native
  /**
    * The language of the rule.
    */
  var language: Language = js.native
  /**
    * The outcome or outcomes returned when the rule expression matches.
    */
  var outcomes: NonEmptyListOfStrings = js.native
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
}

object CreateRuleRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    expression: ruleExpression,
    language: Language,
    outcomes: NonEmptyListOfStrings,
    ruleId: identifier
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  @scala.inline
  implicit class CreateRuleRequestOps[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectorId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: ruleExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Language): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutcomes(value: NonEmptyListOfStrings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: description): Self = {
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
  }
  
}

