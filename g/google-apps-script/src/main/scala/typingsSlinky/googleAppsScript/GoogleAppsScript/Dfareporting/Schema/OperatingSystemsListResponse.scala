package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperatingSystemsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
}

object OperatingSystemsListResponse {
  @scala.inline
  def apply(): OperatingSystemsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemsListResponse]
  }
  @scala.inline
  implicit class OperatingSystemsListResponseOps[Self <: OperatingSystemsListResponse] (val x: Self) extends AnyVal {
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
    def withOperatingSystems(value: js.Array[OperatingSystem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperatingSystems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operatingSystems")(js.undefined)
        ret
    }
  }
  
}

