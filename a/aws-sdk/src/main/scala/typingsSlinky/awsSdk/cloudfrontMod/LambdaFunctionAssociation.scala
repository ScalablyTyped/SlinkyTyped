package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaFunctionAssociation extends js.Object {
  /**
    * Specifies the event type that triggers a Lambda function invocation. You can specify the following values:    viewer-request: The function executes when CloudFront receives a request from a viewer and before it checks to see whether the requested object is in the edge cache.     origin-request: The function executes only when CloudFront forwards a request to your origin. When the requested object is in the edge cache, the function doesn't execute.    origin-response: The function executes after CloudFront receives a response from the origin and before it caches the object in the response. When the requested object is in the edge cache, the function doesn't execute.    viewer-response: The function executes before CloudFront returns the requested object to the viewer. The function executes regardless of whether the object was already in the edge cache. If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't execute.  
    */
  var EventType: typingsSlinky.awsSdk.cloudfrontMod.EventType = js.native
  /**
    * A flag that allows a Lambda function to have read access to the body content. For more information, see Accessing the Request Body by Choosing the Include Body Option in the Amazon CloudFront Developer Guide.
    */
  var IncludeBody: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the Lambda function. You must specify the ARN of a function version; you can't specify a Lambda alias or $LATEST.
    */
  var LambdaFunctionARN: typingsSlinky.awsSdk.cloudfrontMod.LambdaFunctionARN = js.native
}

object LambdaFunctionAssociation {
  @scala.inline
  def apply(EventType: EventType, LambdaFunctionARN: LambdaFunctionARN): LambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], LambdaFunctionARN = LambdaFunctionARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionAssociation]
  }
  @scala.inline
  implicit class LambdaFunctionAssociationOps[Self <: LambdaFunctionAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLambdaFunctionARN(value: LambdaFunctionARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LambdaFunctionARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeBody")(js.undefined)
        ret
    }
  }
  
}

