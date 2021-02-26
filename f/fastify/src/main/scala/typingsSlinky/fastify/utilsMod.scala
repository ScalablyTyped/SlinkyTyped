package typingsSlinky.fastify

import typingsSlinky.node.http2Mod.Http2SecureServer
import typingsSlinky.node.http2Mod.Http2Server
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.http2Mod.Http2ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.Server
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type ContextConfigDefault = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fastify.fastifyStrings.DELETE
    - typingsSlinky.fastify.fastifyStrings.GET
    - typingsSlinky.fastify.fastifyStrings.HEAD
    - typingsSlinky.fastify.fastifyStrings.PATCH
    - typingsSlinky.fastify.fastifyStrings.POST
    - typingsSlinky.fastify.fastifyStrings.PUT
    - typingsSlinky.fastify.fastifyStrings.OPTIONS
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    @scala.inline
    def DELETE: typingsSlinky.fastify.fastifyStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.fastify.fastifyStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.fastify.fastifyStrings.GET = "GET".asInstanceOf[typingsSlinky.fastify.fastifyStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.fastify.fastifyStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.fastify.fastifyStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typingsSlinky.fastify.fastifyStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.fastify.fastifyStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.fastify.fastifyStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.fastify.fastifyStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.fastify.fastifyStrings.POST = "POST".asInstanceOf[typingsSlinky.fastify.fastifyStrings.POST]
    
    @scala.inline
    def PUT: typingsSlinky.fastify.fastifyStrings.PUT = "PUT".asInstanceOf[typingsSlinky.fastify.fastifyStrings.PUT]
  }
  
  type RawReplyDefaultExpression[RawServer /* <: RawServerBase */] = Http2ServerResponse | ServerResponse
  
  type RawRequestDefaultExpression[RawServer /* <: RawServerBase */] = Http2ServerRequest | IncomingMessage
  
  type RawServerBase = Server | typingsSlinky.node.httpsMod.Server | Http2Server | Http2SecureServer
  
  type RawServerDefault = Server
  
  type ReplyDefault = js.Any
  
  type RequestBodyDefault = js.Any
  
  type RequestHeadersDefault = js.Any
  
  type RequestParamsDefault = js.Any
  
  type RequestQuerystringDefault = js.Any
}
