package typingsSlinky.fastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routeMod {
  
  type RouteHandler[RouteGeneric /* <: typingsSlinky.fastify.routeMod.RouteGenericInterface */, RawServer /* <: typingsSlinky.fastify.utilsMod.RawServerBase */, RawRequest /* <: typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression[RawServer] */, RawReply /* <: typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression[RawServer] */, ContextConfig] = js.ThisFunction2[
    /* this */ typingsSlinky.fastify.instanceMod.FastifyInstance[RawServer, RawRequest, RawReply, typingsSlinky.fastify.loggerMod.FastifyLoggerInstance], 
    /* request */ typingsSlinky.fastify.requestMod.FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ typingsSlinky.fastify.replyMod.FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    scala.Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | scala.Unit
    ])
  ]
  
  type RouteHandlerMethod[RawServer /* <: typingsSlinky.fastify.utilsMod.RawServerBase */, RawRequest /* <: typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression[RawServer] */, RawReply /* <: typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: typingsSlinky.fastify.routeMod.RouteGenericInterface */, ContextConfig] = js.ThisFunction2[
    /* this */ typingsSlinky.fastify.instanceMod.FastifyInstance[RawServer, RawRequest, RawReply, typingsSlinky.fastify.loggerMod.FastifyLoggerInstance], 
    /* request */ typingsSlinky.fastify.requestMod.FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ typingsSlinky.fastify.replyMod.FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    scala.Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | scala.Unit
    ])
  ]
}
