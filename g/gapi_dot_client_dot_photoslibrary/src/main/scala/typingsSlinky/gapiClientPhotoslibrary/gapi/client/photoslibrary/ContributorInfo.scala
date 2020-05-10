package typingsSlinky.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributorInfo extends js.Object {
  /** Display name of the contributor. */
  var displayName: js.UndefOr[String] = js.native
  /** URL to the profile picture of the contributor. */
  var profilePictureBaseUrl: js.UndefOr[String] = js.native
}

object ContributorInfo {
  @scala.inline
  def apply(): ContributorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInfo]
  }
  @scala.inline
  implicit class ContributorInfoOps[Self <: ContributorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withProfilePictureBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePictureBaseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilePictureBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilePictureBaseUrl")(js.undefined)
        ret
    }
  }
  
}

