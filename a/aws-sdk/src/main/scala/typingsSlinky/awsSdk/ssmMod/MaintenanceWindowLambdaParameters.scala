package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowLambdaParameters extends js.Object {
  /**
    * Pass client-specific information to the Lambda function that you are invoking. You can then process the client information in your Lambda function as you choose through the context variable.
    */
  var ClientContext: js.UndefOr[MaintenanceWindowLambdaClientContext] = js.native
  /**
    * JSON to provide to your Lambda function as input.
    */
  var Payload: js.UndefOr[MaintenanceWindowLambdaPayload] = js.native
  /**
    * (Optional) Specify a Lambda function version or alias name. If you specify a function version, the action uses the qualified function ARN to invoke a specific Lambda function. If you specify an alias name, the action uses the alias ARN to invoke the Lambda function version to which the alias points.
    */
  var Qualifier: js.UndefOr[MaintenanceWindowLambdaQualifier] = js.native
}

object MaintenanceWindowLambdaParameters {
  @scala.inline
  def apply(): MaintenanceWindowLambdaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowLambdaParameters]
  }
  @scala.inline
  implicit class MaintenanceWindowLambdaParametersOps[Self <: MaintenanceWindowLambdaParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientContext(value: MaintenanceWindowLambdaClientContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientContext")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: MaintenanceWindowLambdaPayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(js.undefined)
        ret
    }
    @scala.inline
    def withQualifier(value: MaintenanceWindowLambdaQualifier): Self = {
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
  }
  
}

