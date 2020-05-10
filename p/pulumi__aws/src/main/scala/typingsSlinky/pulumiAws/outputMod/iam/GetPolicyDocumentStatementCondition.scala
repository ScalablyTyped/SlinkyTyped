package typingsSlinky.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentStatementCondition extends js.Object {
  /**
    * The name of the
    * [IAM condition operator](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition_operators.html)
    * to evaluate.
    */
  var test: String = js.native
  /**
    * The values to evaluate the condition against. If multiple
    * values are provided, the condition matches if at least one of them applies.
    * (That is, the tests are combined with the "OR" boolean operation.)
    */
  var values: js.Array[String] = js.native
  /**
    * The name of a
    * [Context Variable](http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html#AvailableKeys)
    * to apply the condition to. Context variables may either be standard AWS
    * variables starting with `aws:`, or service-specific variables prefixed with
    * the service name.
    */
  var variable: String = js.native
}

object GetPolicyDocumentStatementCondition {
  @scala.inline
  def apply(test: String, values: js.Array[String], variable: String): GetPolicyDocumentStatementCondition = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentStatementCondition]
  }
  @scala.inline
  implicit class GetPolicyDocumentStatementConditionOps[Self <: GetPolicyDocumentStatementCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

