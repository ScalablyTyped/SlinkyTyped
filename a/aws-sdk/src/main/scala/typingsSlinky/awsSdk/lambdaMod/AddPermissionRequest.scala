package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPermissionRequest extends StObject {
  
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
    * For Amazon S3, the ID of the account that owns the resource. Use this together with SourceArn to ensure that the resource is owned by the specified account. It is possible for an Amazon S3 bucket to be deleted by its owner and recreated by another account.
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
  implicit class AddPermissionRequestMutableBuilder[Self <: AddPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceToken(value: EventSourceToken): Self = StObject.set(x, "EventSourceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceTokenUndefined: Self = StObject.set(x, "EventSourceToken", js.undefined)
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipal(value: Principal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    @scala.inline
    def setSourceAccount(value: SourceOwner): Self = StObject.set(x, "SourceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAccountUndefined: Self = StObject.set(x, "SourceAccount", js.undefined)
    
    @scala.inline
    def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
  }
}
