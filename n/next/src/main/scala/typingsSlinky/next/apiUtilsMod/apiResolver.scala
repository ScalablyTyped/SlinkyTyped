package typingsSlinky.next.apiUtilsMod

import typingsSlinky.next.anon.Err
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/api-utils", "apiResolver")
@js.native
object apiResolver extends js.Object {
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    params: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps
  ): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse,
    params: js.Any,
    resolverModule: js.Any,
    apiContext: ApiPreviewProps,
    onError: js.Function1[/* hasErr */ Err, js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
}

