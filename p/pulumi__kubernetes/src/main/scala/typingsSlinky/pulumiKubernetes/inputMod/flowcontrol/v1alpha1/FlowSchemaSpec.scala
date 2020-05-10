package typingsSlinky.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchemaSpec describes how the FlowSchema's specification looks like.
  */
@js.native
trait FlowSchemaSpec extends js.Object {
  /**
    * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match
    * this schema. `nil` specifies that the distinguisher is disabled and thus will always be the
    * empty string.
    */
  var distinguisherMethod: js.UndefOr[Input[FlowDistinguisherMethod]] = js.native
  /**
    * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request.
    * The chosen FlowSchema is among those with the numerically lowest (which we take to be
    * logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative.
    * Note that if the precedence is not specified or zero, it will be set to 1000 as default.
    */
  var matchingPrecedence: js.UndefOr[Input[Double]] = js.native
  /**
    * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster.
    * If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid
    * in its status. Required.
    */
  var priorityLevelConfiguration: Input[PriorityLevelConfigurationReference] = js.native
  /**
    * `rules` describes which requests will match this flow schema. This FlowSchema matches a
    * request if and only if at least one member of rules matches the request. if it is an empty
    * slice, there will be no requests matching the FlowSchema.
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRulesWithSubjects]]]] = js.native
}

object FlowSchemaSpec {
  @scala.inline
  def apply(priorityLevelConfiguration: Input[PriorityLevelConfigurationReference]): FlowSchemaSpec = {
    val __obj = js.Dynamic.literal(priorityLevelConfiguration = priorityLevelConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSchemaSpec]
  }
  @scala.inline
  implicit class FlowSchemaSpecOps[Self <: FlowSchemaSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPriorityLevelConfiguration(value: Input[PriorityLevelConfigurationReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priorityLevelConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistinguisherMethod(value: Input[FlowDistinguisherMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinguisherMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistinguisherMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distinguisherMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchingPrecedence(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingPrecedence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchingPrecedence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchingPrecedence")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: Input[js.Array[Input[PolicyRulesWithSubjects]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

