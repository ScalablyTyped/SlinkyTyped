package typingsSlinky.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGuardiansResponse extends js.Object {
  var guardians: js.UndefOr[js.Array[Guardian]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListGuardiansResponse {
  @scala.inline
  def apply(): ListGuardiansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGuardiansResponse]
  }
  @scala.inline
  implicit class ListGuardiansResponseOps[Self <: ListGuardiansResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuardians(value: js.Array[Guardian]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardians")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuardians: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guardians")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

