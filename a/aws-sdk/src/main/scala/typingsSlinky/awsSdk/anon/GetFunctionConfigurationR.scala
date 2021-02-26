package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.lambdaMod.NamespacedFunctionName
import typingsSlinky.awsSdk.lambdaMod.Qualifier
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/lambda.GetFunctionConfigurationRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait GetFunctionConfigurationR extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: NamespacedFunctionName = js.native
  
  /**
    * Specify a version or alias to get details about a published version of the function.
    */
  var Qualifier: js.UndefOr[typingsSlinky.awsSdk.lambdaMod.Qualifier] = js.native
}
object GetFunctionConfigurationR {
  
  @scala.inline
  def apply(FunctionName: NamespacedFunctionName): GetFunctionConfigurationR = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionConfigurationR]
  }
  
  @scala.inline
  implicit class GetFunctionConfigurationRMutableBuilder[Self <: GetFunctionConfigurationR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: Qualifier): Self = StObject.set(x, "Qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierUndefined: Self = StObject.set(x, "Qualifier", js.undefined)
  }
}
