package typingsSlinky.ionic.capacitorConfigMod

import typingsSlinky.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/integrations/capacitor/config", "CapacitorConfig")
@js.native
class CapacitorConfig () extends BaseConfig[CapacitorConfigFile] {
  
  def provideDefaults(config: CapacitorConfigFile): CapacitorConfigFile = js.native
  
  def resetServerUrl(): Unit = js.native
  
  def setServerUrl(url: String): Unit = js.native
}
