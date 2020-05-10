package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallsListResponse extends js.Object {
  /** An installation of an app for a user on a specific device. The existence of an install implies that the user must have an entitlement to the app. */
  var install: js.UndefOr[js.Array[Install]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#installsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object InstallsListResponse {
  @scala.inline
  def apply(): InstallsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallsListResponse]
  }
  @scala.inline
  implicit class InstallsListResponseOps[Self <: InstallsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstall(value: js.Array[Install]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("install")(js.undefined)
        ret
    }
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
  }
  
}

