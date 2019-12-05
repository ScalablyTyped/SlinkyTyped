package typingsSlinky.atFirebaseInstallations

import typingsSlinky.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/delete-installation", JSImport.Namespace)
@js.native
object distSrcApiDeleteDashInstallationMod extends js.Object {
  def deleteInstallation(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[Unit] = js.native
}

