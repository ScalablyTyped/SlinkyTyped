package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientBooks.anon.AltFields
import typingsSlinky.gapiClientBooks.anon.Features
import typingsSlinky.gapiClientBooks.anon.LicenseTypes
import typingsSlinky.gapiClientBooks.anon.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MyconfigResource extends js.Object {
  /** Gets the current settings for the user. */
  def getUserSettings(request: AltFields): Request[Usersettings] = js.native
  /** Release downloaded content access restriction. */
  def releaseDownloadAccess(request: Locale): Request[DownloadAccesses] = js.native
  /** Request concurrent and download access restrictions. */
  def requestAccess(request: LicenseTypes): Request[RequestAccess] = js.native
  /** Request downloaded content access for specified volumes on the My eBooks shelf. */
  def syncVolumeLicenses(request: Features): Request[Volumes] = js.native
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects
    * will retain the existing value.
    */
  def updateUserSettings(request: AltFields): Request[Usersettings] = js.native
}

object MyconfigResource {
  @scala.inline
  def apply(
    getUserSettings: AltFields => Request[Usersettings],
    releaseDownloadAccess: Locale => Request[DownloadAccesses],
    requestAccess: LicenseTypes => Request[RequestAccess],
    syncVolumeLicenses: Features => Request[Volumes],
    updateUserSettings: AltFields => Request[Usersettings]
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
    def withGetUserSettings(value: AltFields => Request[Usersettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserSettings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReleaseDownloadAccess(value: Locale => Request[DownloadAccesses]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDownloadAccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRequestAccess(value: LicenseTypes => Request[RequestAccess]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSyncVolumeLicenses(value: Features => Request[Volumes]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncVolumeLicenses")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateUserSettings(value: AltFields => Request[Usersettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUserSettings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

