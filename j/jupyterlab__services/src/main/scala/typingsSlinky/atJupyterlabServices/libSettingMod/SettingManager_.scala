package typingsSlinky.atJupyterlabServices.libSettingMod

import typingsSlinky.atJupyterlabCoreutils.libDataconnectorMod.DataConnector
import typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IPlugin
import typingsSlinky.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typingsSlinky.atJupyterlabServices.libSettingMod.SettingManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/setting", "SettingManager")
@js.native
/**
  * Create a new setting manager.
  */
class SettingManager_ () extends DataConnector[IPlugin, String, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

