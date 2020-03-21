package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/delete-installation-request", JSImport.Namespace)
@js.native
object deleteInstallationRequestMod extends js.Object {
  def deleteInstallationRequest(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = js.native
}

