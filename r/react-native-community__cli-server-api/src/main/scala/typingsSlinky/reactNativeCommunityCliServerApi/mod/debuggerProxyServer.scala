package typingsSlinky.reactNativeCommunityCliServerApi.mod

import typingsSlinky.reactNativeCommunityCliServerApi.anon.IsDebuggerConnected
import typingsSlinky.reactNativeCommunityCliServerApi.debuggerProxyServerMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build", "debuggerProxyServer")
@js.native
object debuggerProxyServer extends js.Object {
  
  var attachToServer: js.Function2[/* server */ Server, /* path */ String, IsDebuggerConnected] = js.native
}
