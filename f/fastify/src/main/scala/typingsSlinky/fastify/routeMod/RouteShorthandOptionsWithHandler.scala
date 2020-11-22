package typingsSlinky.fastify.routeMod

import typingsSlinky.fastify.replyMod.FastifyReply
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteShorthandOptionsWithHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] {
  
  def handler(
    request: FastifyRequest[RouteGeneric, RawServer, RawRequest],
    reply: FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): Unit | (js.Promise[
    (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
  ]) = js.native
  @JSName("handler")
  var handler_Original: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
}
