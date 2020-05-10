package typingsSlinky.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUnavailableExceptionDetails extends js.Object {
  /**
    * <p>500 Internal Server Error</p>
    */
  var code: js.UndefOr[String] = js.native
  /**
    * <p>Returned if the service cannot complete the request.</p>
    */
  var message: js.UndefOr[String] = js.native
  /**
    * <p>Server</p>
    */
  var `type`: js.UndefOr[String] = js.native
}

object ServiceUnavailableExceptionDetails {
  @scala.inline
  def apply(): ServiceUnavailableExceptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUnavailableExceptionDetails]
  }
  @scala.inline
  implicit class ServiceUnavailableExceptionDetailsOps[Self <: ServiceUnavailableExceptionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

