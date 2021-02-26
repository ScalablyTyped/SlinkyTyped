package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createInstallationRequestMod {
  
  @JSImport("@firebase/installations/dist/src/api/create-installation-request", "createInstallationRequest")
  @js.native
  def createInstallationRequest(appConfig: AppConfig, hasFid: InProgressInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
}
