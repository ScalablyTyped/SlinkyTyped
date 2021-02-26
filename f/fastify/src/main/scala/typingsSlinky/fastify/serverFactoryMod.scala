package typingsSlinky.fastify

import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.http2Mod.Http2ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverFactoryMod {
  
  type FastifyServerFactory[RawServer /* <: RawServerBase */] = js.Function2[
    /* handler */ FastifyServerFactoryHandler[
      RawServer, 
      RawRequestDefaultExpression[RawServer], 
      RawReplyDefaultExpression[RawServer]
    ], 
    /* opts */ Record[String, js.Any], 
    RawServer
  ]
  
  type FastifyServerFactoryHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] = js.Function2[
    (/* request */ Http2ServerRequest with RawRequest) | (/* request */ IncomingMessage with RawRequest), 
    (/* response */ Http2ServerResponse with RawReply) | (/* response */ ServerResponse with RawReply), 
    Unit
  ]
}
