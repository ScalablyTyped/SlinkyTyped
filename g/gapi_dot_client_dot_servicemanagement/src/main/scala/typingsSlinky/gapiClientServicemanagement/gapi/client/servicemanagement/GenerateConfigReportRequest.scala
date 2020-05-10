package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateConfigReportRequest extends js.Object {
  /**
    * Service configuration for which we want to generate the report.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var newConfig: js.UndefOr[Record[String, _]] = js.native
  /**
    * Service configuration against which the comparison will be done.
    * For this version of API, the supported types are
    * google.api.servicemanagement.v1.ConfigRef,
    * google.api.servicemanagement.v1.ConfigSource,
    * and google.api.Service
    */
  var oldConfig: js.UndefOr[Record[String, _]] = js.native
}

object GenerateConfigReportRequest {
  @scala.inline
  def apply(): GenerateConfigReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportRequest]
  }
  @scala.inline
  implicit class GenerateConfigReportRequestOps[Self <: GenerateConfigReportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewConfig(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOldConfig(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldConfig")(js.undefined)
        ret
    }
  }
  
}

