package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the errors to be returned in
  * google.api.servicecontrol.v1.CheckResponse.check_errors.
  */
@js.native
trait SchemaCheckError extends js.Object {
  /**
    * The error code.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Free-form text providing details on the error cause of the error.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * Contains public information about the check error. If available,
    * `status.code` will be non zero and client can propagate it out as public
    * error.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
  /**
    * Subject to whom this error applies. See the specific code enum for more
    * details on this field. For example:     - “project:&lt;project-id or
    * project-number&gt;”     - “folder:&lt;folder-id&gt;”     -
    * “organization:&lt;organization-id&gt;”
    */
  var subject: js.UndefOr[String] = js.native
}

object SchemaCheckError {
  @scala.inline
  def apply(): SchemaCheckError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckError]
  }
  @scala.inline
  implicit class SchemaCheckErrorOps[Self <: SchemaCheckError] (val x: Self) extends AnyVal {
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
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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

