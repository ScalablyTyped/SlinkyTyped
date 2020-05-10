package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents error information for QuotaOperation.
  */
@js.native
trait SchemaQuotaError extends js.Object {
  /**
    * Error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Free-form text that provides details on the cause of the error.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Subject to whom this error applies. See the specific enum for more
    * details on this field. For example, &quot;clientip:&lt;ip address of
    * client&gt;&quot; or &quot;project:&lt;Google developer project
    * id&gt;&quot;.
    */
  var subject: js.UndefOr[String] = js.native
}

object SchemaQuotaError {
  @scala.inline
  def apply(): SchemaQuotaError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuotaError]
  }
  @scala.inline
  implicit class SchemaQuotaErrorOps[Self <: SchemaQuotaError] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
  }
  
}

