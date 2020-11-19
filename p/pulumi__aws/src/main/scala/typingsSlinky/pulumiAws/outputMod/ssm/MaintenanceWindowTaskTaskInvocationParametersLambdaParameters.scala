package typingsSlinky.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskTaskInvocationParametersLambdaParameters extends js.Object {
  
  /**
    * Pass client-specific information to the Lambda function that you are invoking.
    */
  var clientContext: js.UndefOr[String] = js.native
  
  /**
    * JSON to provide to your Lambda function as input.
    */
  var payload: js.UndefOr[String] = js.native
  
  /**
    * Specify a Lambda function version or alias name.
    */
  var qualifier: js.UndefOr[String] = js.native
}
object MaintenanceWindowTaskTaskInvocationParametersLambdaParameters {
  
  @scala.inline
  def apply(): MaintenanceWindowTaskTaskInvocationParametersLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskTaskInvocationParametersLambdaParameters]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskTaskInvocationParametersLambdaParametersOps[Self <: MaintenanceWindowTaskTaskInvocationParametersLambdaParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientContext(value: String): Self = this.set("clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContext: Self = this.set("clientContext", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
}
