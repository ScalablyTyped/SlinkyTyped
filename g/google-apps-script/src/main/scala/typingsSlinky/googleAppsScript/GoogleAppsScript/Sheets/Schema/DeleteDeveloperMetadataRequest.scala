package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDeveloperMetadataRequest extends js.Object {
  var dataFilter: js.UndefOr[DataFilter] = js.native
}

object DeleteDeveloperMetadataRequest {
  @scala.inline
  def apply(): DeleteDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class DeleteDeveloperMetadataRequestOps[Self <: DeleteDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilter(value: DataFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(js.undefined)
        ret
    }
  }
  
}

