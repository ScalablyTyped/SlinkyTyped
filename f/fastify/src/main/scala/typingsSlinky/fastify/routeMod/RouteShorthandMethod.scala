package typingsSlinky.fastify.routeMod

import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteShorthandMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends js.Object {
  
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
  def apply[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
    path: String,
    opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
    handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
  ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
}
