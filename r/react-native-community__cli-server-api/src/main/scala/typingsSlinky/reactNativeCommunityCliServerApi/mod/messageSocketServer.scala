package typingsSlinky.reactNativeCommunityCliServerApi.mod

import typingsSlinky.reactNativeCommunityCliServerApi.anon.Broadcast
import typingsSlinky.reactNativeCommunityCliServerApi.messageSocketServerMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cli-server-api/build", "messageSocketServer")
@js.native
object messageSocketServer extends js.Object {
  
  var attachToServer: js.Function2[/* server */ Server, /* path */ String, Broadcast] = js.native
  
  var parseMessage: js.Function2[/* data */ String, /* binary */ js.Any, _] = js.native
}
