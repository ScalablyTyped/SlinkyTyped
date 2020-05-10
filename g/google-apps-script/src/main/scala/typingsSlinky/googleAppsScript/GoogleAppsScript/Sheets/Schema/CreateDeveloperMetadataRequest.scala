package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeveloperMetadataRequest extends js.Object {
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.native
}

object CreateDeveloperMetadataRequest {
  @scala.inline
  def apply(): CreateDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeveloperMetadataRequest]
  }
  @scala.inline
  implicit class CreateDeveloperMetadataRequestOps[Self <: CreateDeveloperMetadataRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMetadata(value: DeveloperMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
  }
  
}

