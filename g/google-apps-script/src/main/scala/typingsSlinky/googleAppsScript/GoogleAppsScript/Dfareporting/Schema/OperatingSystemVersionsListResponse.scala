package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemVersionsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
}

object OperatingSystemVersionsListResponse {
  @scala.inline
  def apply(): OperatingSystemVersionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemVersionsListResponse]
  }
  @scala.inline
  implicit class OperatingSystemVersionsListResponseOps[Self <: OperatingSystemVersionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystemVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystemVersions")(js.undefined)
        ret
    }
  }
  
}

