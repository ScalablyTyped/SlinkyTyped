package typingsSlinky.ionic.cordovaConfigMod

import typingsSlinky.ionic.RequiredProjectIntegratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/config", "loadCordovaConfig")
@js.native
object loadCordovaConfig extends js.Object {
  def apply(integration: RequiredProjectIntegratio): js.Promise[CordovaConfig] = js.native
}

