package typingsSlinky.nextServer

import typingsSlinky.nextServer.anon.GenerateEtags
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-server/dist/server/send-html", JSImport.Namespace)
@js.native
object sendHtmlMod extends js.Object {
  
  def sendHTML(
    req: IncomingMessage,
    res: ServerResponse,
    html: String,
    hasGenerateEtagsPoweredByHeader: GenerateEtags
  ): Unit = js.native
}
