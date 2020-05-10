package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the Report method.
  */
@js.native
trait SchemaReportRequest extends js.Object {
  /**
    * Operations to be reported.  Typically the service should report one
    * operation per request. Putting multiple operations into a single request
    * is allowed, but should be used only when multiple operations are natually
    * available at the time of the report.  If multiple operations are in a
    * single request, the total request size should be no larger than 1MB. See
    * ReportResponse.report_errors for partial failure behavior.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.native
  /**
    * Specifies which version of service config should be used to process the
    * request.  If unspecified or no matching version can be found, the latest
    * one will be used.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object SchemaReportRequest {
  @scala.inline
  def apply(): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRequest]
  }
  @scala.inline
  implicit class SchemaReportRequestOps[Self <: SchemaReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperations(value: js.Array[SchemaOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operations")(js.undefined)
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

