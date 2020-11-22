package typingsSlinky.reactNativeCommunityCliServerApi.anon

import typingsSlinky.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachToServer extends js.Object {
  
  def attachToServer(server: Server): DebuggerProxy = js.native
  def attachToServer(server: typingsSlinky.node.httpsMod.Server): DebuggerProxy = js.native
  
  var middleware: js.Any = js.native
}
