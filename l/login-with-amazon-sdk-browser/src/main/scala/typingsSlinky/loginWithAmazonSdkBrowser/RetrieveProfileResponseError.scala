package typingsSlinky.loginWithAmazonSdkBrowser

import typingsSlinky.loginWithAmazonSdkBrowser.loginWithAmazonSdkBrowserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response type if `retrieveProfile` call failed.
  */
@js.native
trait RetrieveProfileResponseError extends RetrieveProfileResponse {
  /**
    * The error message given with the response.
    */
  var error: String = js.native
  /**
    * Indicates whether profile was successfully retrieved.
    * For this type, it is always false.
    */
  var success: `false` = js.native
}

object RetrieveProfileResponseError {
  @scala.inline
  def apply(error: String, success: `false`): RetrieveProfileResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveProfileResponseError]
  }
  @scala.inline
  implicit class RetrieveProfileResponseErrorOps[Self <: RetrieveProfileResponseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

