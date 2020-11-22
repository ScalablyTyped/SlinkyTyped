package typingsSlinky.fastify.mod

import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.node.http2Mod.Http2SecureServer
import typingsSlinky.node.http2Mod.Http2Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify", "fastify")
@js.native
object fastify extends js.Object {
  
  def apply[Server /* <: typingsSlinky.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: Http2Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2Options[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  /**
    * Fastify factor function for the standard fastify http, https, or http2 server instance.
    *
    * The default function utilizes http
    *
    * @param opts Fastify server options
    * @returns Fastify server instance
    */
  def apply[Server /* <: Http2SecureServer */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttp2SecureOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: typingsSlinky.node.httpsMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyHttpsOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
  def apply[Server /* <: typingsSlinky.node.httpMod.Server */, Request /* <: RawRequestDefaultExpression[Server] */, Reply /* <: RawReplyDefaultExpression[Server] */, Logger /* <: FastifyLoggerInstance */](opts: FastifyServerOptions[Server, Logger]): (FastifyInstance[Server, Request, Reply, Logger]) with (js.Thenable[FastifyInstance[Server, Request, Reply, Logger]]) = js.native
}
