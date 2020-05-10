package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientBooks.AnonAltFields
import typingsSlinky.gapiClientBooks.AnonFeatures
import typingsSlinky.gapiClientBooks.AnonLicenseTypes
import typingsSlinky.gapiClientBooks.AnonLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AnonAltFields): Request_[Usersettings] = js.native
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: AnonLocale): Request_[DownloadAccesses] = js.native
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: AnonLicenseTypes): Request_[RequestAccess] = js.native
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: AnonFeatures): Request_[Volumes] = js.native
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AnonAltFields): Request_[Usersettings] = js.native
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AnonAltFields => Request_[Usersettings],
    releaseDownloadAccess: AnonLocale => Request_[DownloadAccesses],
    requestAccess: AnonLicenseTypes => Request_[RequestAccess],
    syncVolumeLicenses: AnonFeatures => Request_[Volumes],
    updateUserSettings: AnonAltFields => Request_[Usersettings]
  ): MyconfigResource = {
    val __obj = js.Dynamic.literal(getUserSettings = js.Any.fromFunction1(getUserSettings), releaseDownloadAccess = js.Any.fromFunction1(releaseDownloadAccess), requestAccess = js.Any.fromFunction1(requestAccess), syncVolumeLicenses = js.Any.fromFunction1(syncVolumeLicenses), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
    __obj.asInstanceOf[MyconfigResource]
  }
  @scala.inline
  implicit class MyconfigResourceOps[Self <: MyconfigResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetUserSettings(value: AnonAltFields => Request_[Usersettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseDownloadAccess(value: AnonLocale => Request_[DownloadAccesses]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDownloadAccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestAccess(value: AnonLicenseTypes => Request_[RequestAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSyncVolumeLicenses(value: AnonFeatures => Request_[Volumes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncVolumeLicenses")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateUserSettings(value: AnonAltFields => Request_[Usersettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUserSettings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

