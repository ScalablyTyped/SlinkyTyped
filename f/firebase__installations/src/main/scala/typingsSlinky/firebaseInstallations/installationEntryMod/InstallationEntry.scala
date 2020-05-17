package typingsSlinky.firebaseInstallations.installationEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry
  - typingsSlinky.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
  - typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
*/
trait InstallationEntry extends js.Object

object InstallationEntry {
  @scala.inline
  implicit def apply(value: InProgressInstallationEntry): InstallationEntry = value.asInstanceOf[InstallationEntry]
  @scala.inline
  implicit def apply(value: RegisteredInstallationEntry): InstallationEntry = value.asInstanceOf[InstallationEntry]
  @scala.inline
  implicit def apply(value: UnregisteredInstallationEntry): InstallationEntry = value.asInstanceOf[InstallationEntry]
}

