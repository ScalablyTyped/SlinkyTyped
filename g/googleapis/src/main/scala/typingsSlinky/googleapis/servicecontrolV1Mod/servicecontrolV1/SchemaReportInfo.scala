package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional info about the report operation.
  */
@js.native
trait SchemaReportInfo extends js.Object {
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
}

object SchemaReportInfo {
  @scala.inline
  def apply(): SchemaReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportInfo]
  }
  @scala.inline
  implicit class SchemaReportInfoOps[Self <: SchemaReportInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationId")(js.undefined)
        ret
    }
    @scala.inline
    def withQuotaInfo(value: SchemaQuotaInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuotaInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quotaInfo")(js.undefined)
        ret
    }
  }
  
}

