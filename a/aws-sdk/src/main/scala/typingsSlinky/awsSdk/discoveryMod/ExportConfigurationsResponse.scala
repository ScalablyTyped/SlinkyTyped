package typingsSlinky.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportConfigurationsResponse extends js.Object {
  /**
    * A unique identifier that you can use to query the export status.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.native
}

object ExportConfigurationsResponse {
  @scala.inline
  def apply(): ExportConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportConfigurationsResponse]
  }
  @scala.inline
  implicit class ExportConfigurationsResponseOps[Self <: ExportConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExportId(value: ConfigurationsExportId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportId")(js.undefined)
        ret
    }
  }
  
}

