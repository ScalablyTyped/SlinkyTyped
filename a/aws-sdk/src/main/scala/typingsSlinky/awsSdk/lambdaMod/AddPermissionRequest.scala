package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionRequest extends js.Object {
  /**
    * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
    */
  var Action: typingsSlinky.awsSdk.lambdaMod.Action = js.native
  /**
    * For Alexa Smart Home functions, a token that must be supplied by the invoker.
    */
  var EventSourceToken: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.EventSourceToken] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsSlinky.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The AWS service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
    */
  var Principal: typingsSlinky.awsSdk.lambdaMod.Principal = js.native
  /**
    * Specify a version or alias to add permissions to a published version of the function.
    */
  var Qualifier: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Qualifier] = js.native
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * For AWS services, the ID of the account that owns the resource. Use this instead of SourceArn to grant permission to resources that are owned by another account (for example, all of an account's Amazon S3 buckets). Or use it together with SourceArn to ensure that the resource is owned by the specified account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
    */
  var SourceAccount: js.UndefOr[SourceOwner] = js.native
  /**
    * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic.
    */
  var SourceArn: js.UndefOr[Arn] = js.native
  /**
    * A statement identifier that differentiates the statement from others in the same policy.
    */
  var StatementId: typingsSlinky.awsSdk.lambdaMod.StatementId = js.native
}

object AddPermissionRequest {
  @scala.inline
  def apply(Action: Action, FunctionName: FunctionName, Principal: Principal, StatementId: StatementId): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionRequest]
  }
  @scala.inline
  implicit class AddPermissionRequestOps[Self <: AddPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionName(value: FunctionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrincipal(value: Principal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Principal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatementId(value: StatementId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventSourceToken(value: EventSourceToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceToken")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: Qualifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Qualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RevisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAccount(value: SourceOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAccount")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceArn")(js.undefined)
        ret
    }
  }
  
}

