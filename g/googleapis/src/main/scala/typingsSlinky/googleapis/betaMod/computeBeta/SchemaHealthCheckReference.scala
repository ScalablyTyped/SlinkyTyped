package typingsSlinky.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A full or valid partial URL to a health check. For example, the following
  * are valid URLs:   -
  * https://www.googleapis.com/compute/beta/projects/project-id/global/httpHealthChecks/health-check
  * - projects/project-id/global/httpHealthChecks/health-check  -
  * global/httpHealthChecks/health-check
  */
@js.native
trait SchemaHealthCheckReference extends js.Object {
  var healthCheck: js.UndefOr[String] = js.native
}

object SchemaHealthCheckReference {
  @scala.inline
  def apply(): SchemaHealthCheckReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckReference]
  }
  @scala.inline
  implicit class SchemaHealthCheckReferenceOps[Self <: SchemaHealthCheckReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHealthCheck(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheck")(js.undefined)
        ret
    }
  }
  
}

