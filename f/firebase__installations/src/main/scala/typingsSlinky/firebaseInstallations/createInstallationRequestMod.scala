package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/api/create-installation-request", JSImport.Namespace)
@js.native
object createInstallationRequestMod extends js.Object {
  
  def createInstallationRequest(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
}
