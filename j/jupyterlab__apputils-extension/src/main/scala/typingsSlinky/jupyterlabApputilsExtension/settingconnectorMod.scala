package typingsSlinky.jupyterlabApputilsExtension

import typingsSlinky.jupyterlabApputilsExtension.anon.Ids
import typingsSlinky.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.active
import typingsSlinky.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.all
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typingsSlinky.jupyterlabStatedb.interfacesMod.IDataConnector
import typingsSlinky.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingconnectorMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/settingconnector", "SettingConnector")
  @js.native
  class SettingConnector protected () extends DataConnector[IPlugin, String, String, String] {
    def this(connector: IDataConnector[IPlugin, String, String, String]) = this()
    
    var _connector: js.Any = js.native
    
    var _throttlers: js.Any = js.native
    
    @JSName("list")
    def list_active(query: active): js.Promise[Ids] = js.native
    @JSName("list")
    def list_all(query: all): js.Promise[Ids] = js.native
  }
}
