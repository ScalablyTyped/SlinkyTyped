package typingsSlinky.next.distNextDashServerServerRenderMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/render", "renderToHTML")
@js.native
object renderToHTML extends js.Object {
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    pathname: String,
    query: ParsedUrlQuery,
    renderOpts: RenderOpts
  ): js.Promise[String | Null] = js.native
}

