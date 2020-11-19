package typingsSlinky.jupyterlabServices.settingMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.settingMod.SettingManager.IOptions
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/setting", "SettingManager")
@js.native
/**
  * Create a new setting manager.
  */
class SettingManager_ () extends DataConnector[IPlugin, String, String, String] {
  def this(options: IOptions) = this()
  
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}
