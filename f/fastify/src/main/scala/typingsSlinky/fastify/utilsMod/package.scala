package typingsSlinky.fastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilsMod {
  
  type ContextConfigDefault = js.Any
  
  type RawReplyDefaultExpression[RawServer /* <: typingsSlinky.fastify.utilsMod.RawServerBase */] = typingsSlinky.node.http2Mod.Http2ServerResponse | typingsSlinky.node.httpMod.ServerResponse
  
  type RawRequestDefaultExpression[RawServer /* <: typingsSlinky.fastify.utilsMod.RawServerBase */] = typingsSlinky.node.http2Mod.Http2ServerRequest | typingsSlinky.node.httpMod.IncomingMessage
  
  type RawServerBase = typingsSlinky.node.httpMod.Server | typingsSlinky.node.httpsMod.Server | typingsSlinky.node.http2Mod.Http2Server | typingsSlinky.node.http2Mod.Http2SecureServer
  
  type RawServerDefault = typingsSlinky.node.httpMod.Server
  
  type ReplyDefault = js.Any
  
  type RequestBodyDefault = js.Any
  
  type RequestHeadersDefault = js.Any
  
  type RequestParamsDefault = js.Any
  
  type RequestQuerystringDefault = js.Any
}
