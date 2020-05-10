package typingsSlinky.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Selects and configures the service controller used by the service.  The
  * service controller handles features like abuse, quota, billing, logging,
  * monitoring, etc.
  */
@js.native
trait SchemaControl extends js.Object {
  /**
    * The service control environment to use. If empty, no control plane
    * feature (like quota and billing) will be enabled.
    */
  var environment: js.UndefOr[String] = js.native
}

object SchemaControl {
  @scala.inline
  def apply(): SchemaControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControl]
  }
  @scala.inline
  implicit class SchemaControlOps[Self <: SchemaControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(js.undefined)
        ret
    }
  }
  
}

