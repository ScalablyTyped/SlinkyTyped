package typingsSlinky.firebaseInstallations.getInstallationEntryMod

import typingsSlinky.firebaseInstallations.installationEntryMod.InstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationEntryWithRegistrationPromise extends js.Object {
  var installationEntry: InstallationEntry = js.native
  /** Exist iff the installationEntry is not registered. */
  var registrationPromise: js.UndefOr[js.Promise[RegisteredInstallationEntry]] = js.native
}

object InstallationEntryWithRegistrationPromise {
  @scala.inline
  def apply(installationEntry: InstallationEntry): InstallationEntryWithRegistrationPromise = {
    val __obj = js.Dynamic.literal(installationEntry = installationEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntryWithRegistrationPromise]
  }
  @scala.inline
  implicit class InstallationEntryWithRegistrationPromiseOps[Self <: InstallationEntryWithRegistrationPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallationEntry(value: InstallationEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegistrationPromise(value: js.Promise[RegisteredInstallationEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationPromise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationPromise")(js.undefined)
        ret
    }
  }
  
}

