package typingsSlinky.atFirebaseInstallations

import typingsSlinky.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.CompletedAuthToken
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/generate-auth-token", JSImport.Namespace)
@js.native
object distSrcApiGenerateDashAuthDashTokenMod extends js.Object {
  def generateAuthToken(appConfig: AppConfig, installationEntry: RegisteredInstallationEntry): js.Promise[CompletedAuthToken] = js.native
}

