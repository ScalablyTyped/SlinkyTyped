package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateConfigReportResponse extends js.Object {
  /**
    * list of ChangeReport, each corresponding to comparison between two
    * service configurations.
    */
  var changeReports: js.UndefOr[js.Array[ChangeReport]] = js.native
  /**
    * Errors / Linter warnings associated with the service definition this
    * report
    * belongs to.
    */
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.native
  /** ID of the service configuration this report belongs to. */
  var id: js.UndefOr[String] = js.native
  /** Name of the service this report belongs to. */
  var serviceName: js.UndefOr[String] = js.native
}

object GenerateConfigReportResponse {
  @scala.inline
  def apply(): GenerateConfigReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateConfigReportResponse]
  }
  @scala.inline
  implicit class GenerateConfigReportResponseOps[Self <: GenerateConfigReportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeReports(value: js.Array[ChangeReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeReports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeReports: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeReports")(js.undefined)
        ret
    }
    @scala.inline
    def withDiagnostics(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagnostics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagnostics")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
  }
  
}

