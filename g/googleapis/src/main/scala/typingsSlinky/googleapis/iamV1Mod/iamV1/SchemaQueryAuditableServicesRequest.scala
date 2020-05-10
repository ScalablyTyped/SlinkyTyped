package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to get the list of auditable services for a resource.
  */
@js.native
trait SchemaQueryAuditableServicesRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of auditable
    * services.  The name follows the Google Cloud Platform resource format.
    * For example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
}

object SchemaQueryAuditableServicesRequest {
  @scala.inline
  def apply(): SchemaQueryAuditableServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryAuditableServicesRequest]
  }
  @scala.inline
  implicit class SchemaQueryAuditableServicesRequestOps[Self <: SchemaQueryAuditableServicesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFullResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResourceName")(js.undefined)
        ret
    }
  }
  
}

