package typingsSlinky.firebaseInstallations.commonMod

import org.scalajs.dom.experimental.Headers
import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/api/common", "getHeaders")
@js.native
object getHeaders extends js.Object {
  def apply(hasApiKey: AppConfig): Headers = js.native
}

