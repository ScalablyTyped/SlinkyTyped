package typingsSlinky.atFirebaseInstallations

import typingsSlinky.atFirebaseInstallations.distSrcInterfacesFirebaseDashDependenciesMod.FirebaseDependencies
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.CompletedAuthToken
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesInstallationDashEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/generate-auth-token-request", JSImport.Namespace)
@js.native
object distSrcApiGenerateDashAuthDashTokenDashRequestMod extends js.Object {
  def generateAuthTokenRequest(
    hasAppConfigPlatformLoggerProvider: FirebaseDependencies,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = js.native
}

