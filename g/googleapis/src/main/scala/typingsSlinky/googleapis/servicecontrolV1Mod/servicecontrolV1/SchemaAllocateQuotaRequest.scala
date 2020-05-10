package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the AllocateQuota method.
  */
@js.native
trait SchemaAllocateQuotaRequest extends js.Object {
  /**
    * Operation that describes the quota allocation.
    */
  var allocateOperation: js.UndefOr[SchemaQuotaOperation] = js.native
  /**
    * Specifies which version of service configuration should be used to
    * process the request. If unspecified or no matching version can be found,
    * the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaAllocateQuotaRequest {
  @scala.inline
  def apply(): SchemaAllocateQuotaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocateQuotaRequest]
  }
  @scala.inline
  implicit class SchemaAllocateQuotaRequestOps[Self <: SchemaAllocateQuotaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocateOperation(value: SchemaQuotaOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateOperation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocateOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocateOperation")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceConfigId")(js.undefined)
        ret
    }
  }
  
}

