package typingsSlinky.reactNativeCommunityCliServerApi.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.reactNativeCommunityCliServerApi.devToolsMiddlewareMod.LaunchDevToolsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build", "devToolsMiddleware")
@js.native
object devToolsMiddleware extends js.Object {
  
  def apply(options: LaunchDevToolsOptions, isDebuggerConnected: js.Function0[Boolean]): js.Function2[/* _req */ IncomingMessage, /* res */ ServerResponse, Unit] = js.native
}
