package typingsSlinky.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrderedCacheBehaviorLambdaFunctionAssociation extends js.Object {
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: String = js.native
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Boolean] = js.native
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: String = js.native
}

object DistributionOrderedCacheBehaviorLambdaFunctionAssociation {
  @scala.inline
  def apply(eventType: String, lambdaArn: String): DistributionOrderedCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]
  }
  @scala.inline
  implicit class DistributionOrderedCacheBehaviorLambdaFunctionAssociationOps[Self <: DistributionOrderedCacheBehaviorLambdaFunctionAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambdaArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lambdaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBody")(js.undefined)
        ret
    }
  }
  
}

