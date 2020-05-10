package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvocationResponse extends js.Object {
  /**
    * The version of the function that executed. When you invoke a function with an alias, this indicates which version the alias resolved to.
    */
  var ExecutedVersion: js.UndefOr[Version] = js.native
  /**
    * If present, indicates that an error occurred during function execution. Details about the error are included in the response payload.
    */
  var FunctionError: js.UndefOr[String] = js.native
  /**
    * The last 4 KB of the execution log, which is base64 encoded.
    */
  var LogResult: js.UndefOr[String] = js.native
  /**
    * The response from the function, or an error object.
    */
  var Payload: js.UndefOr[_Blob] = js.native
  /**
    * The HTTP status code is in the 200 range for a successful request. For the RequestResponse invocation type, this status code is 200. For the Event invocation type, this status code is 202. For the DryRun invocation type, the status code is 204.
    */
  var StatusCode: js.UndefOr[Integer] = js.native
}

object InvocationResponse {
  @scala.inline
  def apply(): InvocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvocationResponse]
  }
  @scala.inline
  implicit class InvocationResponseOps[Self <: InvocationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutedVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutedVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFunctionError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunctionError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FunctionError")(js.undefined)
        ret
    }
    @scala.inline
    def withLogResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogResult")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: _Blob): Self = {
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
    def withStatusCode(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
  }
  
}

