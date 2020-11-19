package typingsSlinky.firebaseInstallations.commonMod

import org.scalajs.dom.experimental.Headers
import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/installations/dist/src/api/common", "getHeadersWithAuth")
@js.native
object getHeadersWithAuth extends js.Object {
  
  def apply(appConfig: AppConfig, hasRefreshToken: RegisteredInstallationEntry): Headers = js.native
}
