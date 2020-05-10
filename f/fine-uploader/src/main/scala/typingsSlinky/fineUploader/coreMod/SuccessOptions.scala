package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessOptions extends js.Object {
  /**
    * Endpoint to send a POST after all chunks have been successfully uploaded for each file.
    *
    * Required if the `concurrent.enabled` option is set.
    * 
    * If a function value is provided, the file's ID will be passed when invoking the function
    *
    * @default `null`
    */
  var endpoint: js.UndefOr[String | js.Function] = js.native
  /**
    * Headers to send to with chunking success request. The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var headers: js.UndefOr[js.Function] = js.native
  /**
    * Send all parameters in the request body JSON-encoded. Otherwise params will be sent application/x-www-form-urlencoded
    * 
    * @default `false`
    */
  var jsonPayload: js.UndefOr[Boolean] = js.native
  /**
    * HTTP method used when sending the success request
    * 
    * @default `POST`
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Parameters to send in the message body of the success request.  The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return null }`
    */
  var params: js.UndefOr[js.Function] = js.native
  /**
    * Fine Uploader will reset the file such that a retry will start at chunk 0 if the success response status matches any of the provided status codes
    * 
    * @default `[]`
    */
  var resetOnStatus: js.UndefOr[js.Array[_]] = js.native
}

object SuccessOptions {
  @scala.inline
  def apply(): SuccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessOptions]
  }
  @scala.inline
  implicit class SuccessOptionsOps[Self <: SuccessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnStatus(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnStatus")(js.undefined)
        ret
    }
  }
  
}

