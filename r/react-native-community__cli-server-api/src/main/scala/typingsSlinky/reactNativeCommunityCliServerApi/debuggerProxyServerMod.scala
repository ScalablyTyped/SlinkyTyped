package typingsSlinky.reactNativeCommunityCliServerApi

import typingsSlinky.reactNativeCommunityCliServerApi.anon.IsDebuggerConnected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debuggerProxyServerMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-server-api/build/websocket/debuggerProxyServer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-server-api/build/websocket/debuggerProxyServer", "default.attachToServer")
    @js.native
    def attachToServer: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected] = js.native
    @scala.inline
    def attachToServer_=(x: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attachToServer")(x.asInstanceOf[js.Any])
  }
  
  type Server = typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server
}
