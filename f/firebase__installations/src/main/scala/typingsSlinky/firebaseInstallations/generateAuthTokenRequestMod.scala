package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.firebaseDependenciesMod.FirebaseDependencies
import typingsSlinky.firebaseInstallations.installationEntryMod.CompletedAuthToken
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/generate-auth-token-request", JSImport.Namespace)
@js.native
object generateAuthTokenRequestMod extends js.Object {
  def generateAuthTokenRequest(
    hasAppConfigPlatformLoggerProvider: FirebaseDependencies,
    installationEntry: RegisteredInstallationEntry
  ): js.Promise[CompletedAuthToken] = js.native
}

