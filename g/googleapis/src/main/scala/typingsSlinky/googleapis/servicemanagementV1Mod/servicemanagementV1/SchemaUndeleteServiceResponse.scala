package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for UndeleteService method.
  */
@js.native
trait SchemaUndeleteServiceResponse extends js.Object {
  /**
    * Revived service resource.
    */
  var service: js.UndefOr[SchemaManagedService] = js.native
}

object SchemaUndeleteServiceResponse {
  @scala.inline
  def apply(): SchemaUndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteServiceResponse]
  }
  @scala.inline
  implicit class SchemaUndeleteServiceResponseOps[Self <: SchemaUndeleteServiceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: SchemaManagedService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

