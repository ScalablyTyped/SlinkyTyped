package typingsSlinky.nextServer

import typingsSlinky.nextServer.anon.GenerateEtags
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sendHtmlMod {
  
  @JSImport("next-server/dist/server/send-html", "sendHTML")
  @js.native
  def sendHTML(
    req: IncomingMessage,
    res: ServerResponse,
    html: String,
    hasGenerateEtagsPoweredByHeader: GenerateEtags
  ): Unit = js.native
}
