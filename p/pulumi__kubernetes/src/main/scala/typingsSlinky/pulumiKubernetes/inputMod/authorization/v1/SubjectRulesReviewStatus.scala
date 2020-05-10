package typingsSlinky.pulumiKubernetes.inputMod.authorization.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete
  * depending on the set of authorizers the server is configured with and any errors experienced
  * during evaluation. Because authorization rules are additive, if a rule appears in a list it's
  * safe to assume the subject has that permission, even if that list is incomplete.
  */
@js.native
trait SubjectRulesReviewStatus extends js.Object {
  /**
    * EvaluationError can appear in combination with Rules. It indicates an error occurred during
    * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
    * ResourceRules and/or NonResourceRules may be incomplete.
    */
  var evaluationError: js.UndefOr[Input[String]] = js.native
  /**
    * Incomplete is true when the rules returned by this call are incomplete. This is most
    * commonly encountered when an authorizer, such as an external authorizer, doesn't support
    * rules evaluation.
    */
  var incomplete: Input[Boolean] = js.native
  /**
    * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
    * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var nonResourceRules: Input[js.Array[Input[NonResourceRule]]] = js.native
  /**
    * ResourceRules is the list of actions the subject is allowed to perform on resources. The
    * list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var resourceRules: Input[js.Array[Input[ResourceRule]]] = js.native
}

object SubjectRulesReviewStatus {
  @scala.inline
  def apply(
    incomplete: Input[Boolean],
    nonResourceRules: Input[js.Array[Input[NonResourceRule]]],
    resourceRules: Input[js.Array[Input[ResourceRule]]]
  ): SubjectRulesReviewStatus = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectRulesReviewStatus]
  }
  @scala.inline
  implicit class SubjectRulesReviewStatusOps[Self <: SubjectRulesReviewStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomplete(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonResourceRules(value: Input[js.Array[Input[NonResourceRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonResourceRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceRules(value: Input[js.Array[Input[ResourceRule]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationError(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluationError")(js.undefined)
        ret
    }
  }
  
}

