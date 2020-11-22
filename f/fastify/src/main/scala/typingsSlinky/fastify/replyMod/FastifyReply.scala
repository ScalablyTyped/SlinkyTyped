package typingsSlinky.fastify.replyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fastify.contextMod.FastifyContext
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.routeMod.RouteGenericInterface
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyReply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends js.Object {
  
  def callNotFound(): Unit = js.native
  
  def code(statusCode: Double): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  var context: FastifyContext[ContextConfig] = js.native
  
  def getHeader(key: String): js.UndefOr[String] = js.native
  
  def getHeaders(): // Node's `getHeaders()` can return numbers and arrays, so they're included here as possible types.
  StringDictionary[js.UndefOr[Double | String | js.Array[String]]] = js.native
  
  def getResponseTime(): Double = js.native
  
  def hasHeader(key: String): Boolean = js.native
  
  def header(key: String, value: js.Any): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  def headers(values: StringDictionary[js.Any]): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  var log: FastifyLoggerInstance = js.native
  
  var raw: RawReply = js.native
  
  // Note: should consider refactoring the argument order for redirect. statusCode is optional so it should be after the required url param
  def redirect(statusCode: Double, url: String): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  def redirect(url: String): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  def removeHeader(key: String): Unit = js.native
  
  var request: FastifyRequest[RouteGeneric, RawServer, RawRequest] = js.native
  
  def send(): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  @JSName("send")
  def send_Reply(
    payload: /* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any
  ): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  var sent: Boolean = js.native
  
  def serialize(payload: js.Any): String = js.native
  
  def serializer(fn: js.Function1[/* payload */ js.Any, String]): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  def status(statusCode: Double): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
  
  var statusCode: Double = js.native
  
  def `then`(fullfilled: js.Function0[Unit], rejected: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def `type`(contentType: String): FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
}
