package typingsSlinky.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishVersionRequest extends StObject {
  
  /**
    * Only publish a version if the hash value matches the value that's specified. Use this option to avoid publishing a version if the function code has changed since you last updated it. You can get the hash for the version that you uploaded from the output of UpdateFunctionCode.
    */
  var CodeSha256: js.UndefOr[String] = js.native
  
  /**
    * A description for the version to override the description in the function configuration.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Description] = js.native
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsSlinky.awsSdk.lambdaMod.FunctionName = js.native
  
  /**
    * Only update the function if the revision ID matches the ID that's specified. Use this option to avoid publishing a version if the function configuration has changed since you last updated it.
    */
  var RevisionId: js.UndefOr[String] = js.native
}
object PublishVersionRequest {
  
  @scala.inline
  def apply(FunctionName: FunctionName): PublishVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishVersionRequest]
  }
  
  @scala.inline
  implicit class PublishVersionRequestMutableBuilder[Self <: PublishVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
  }
}
