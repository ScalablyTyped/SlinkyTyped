package typingsSlinky.findMyWay

import typingsSlinky.findMyWay.mod.HTTPVersion
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeriveVersion[V /* <: HTTPVersion */] extends js.Object {
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage): String = js.native
  def deriveVersion[Context](req: Http2ServerRequest | IncomingMessage, ctx: Context): String = js.native
  def storage(): AnonDel[V] = js.native
}

