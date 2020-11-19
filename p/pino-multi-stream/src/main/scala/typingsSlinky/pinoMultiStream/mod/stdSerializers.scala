package typingsSlinky.pinoMultiStream.mod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.pinoStdSerializers.anon.Req
import typingsSlinky.pinoStdSerializers.anon.Res
import typingsSlinky.pinoStdSerializers.mod.CustomErrorSerializer
import typingsSlinky.pinoStdSerializers.mod.CustomRequestSerializer
import typingsSlinky.pinoStdSerializers.mod.CustomResponseSerializer
import typingsSlinky.pinoStdSerializers.mod.SerializedError
import typingsSlinky.pinoStdSerializers.mod.SerializedRequest
import typingsSlinky.pinoStdSerializers.mod.SerializedResponse
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pino-multi-stream", "stdSerializers")
@js.native
object stdSerializers extends js.Object {
  
  /**
    * Serializes an Error object.
    */
  def err(err: js.Error): SerializedError = js.native
  /**
    * Serializes an Error object.
    */
  @JSName("err")
  var err_Original: js.Function1[/* err */ js.Error, SerializedError] = js.native
  
  /**
    * Returns an object:
    * ```
    * {
    *   req: {}
    * }
    * ```
    * where req is the request as serialized by the standard request serializer.
    * @param req The request to serialize
    * @return An object
    */
  def mapHttpRequest(req: IncomingMessage): Req = js.native
  /**
    * Returns an object:
    * ```
    * {
    *   req: {}
    * }
    * ```
    * where req is the request as serialized by the standard request serializer.
    * @param req The request to serialize
    * @return An object
    */
  @JSName("mapHttpRequest")
  var mapHttpRequest_Original: js.Function1[/* req */ IncomingMessage, Req] = js.native
  
  /**
    * Returns an object:
    * ```
    * {
    *   res: {}
    * }
    * ```
    * where res is the response as serialized by the standard response serializer.
    * @param res The response to serialize.
    * @return An object.
    */
  def mapHttpResponse(res: ServerResponse): Res = js.native
  /**
    * Returns an object:
    * ```
    * {
    *   res: {}
    * }
    * ```
    * where res is the response as serialized by the standard response serializer.
    * @param res The response to serialize.
    * @return An object.
    */
  @JSName("mapHttpResponse")
  var mapHttpResponse_Original: js.Function1[/* res */ ServerResponse, Res] = js.native
  
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  def req(req: IncomingMessage): SerializedRequest = js.native
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  @JSName("req")
  var req_Original: js.Function1[/* req */ IncomingMessage, SerializedRequest] = js.native
  
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  def res(res: ServerResponse): SerializedResponse = js.native
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  @JSName("res")
  var res_Original: js.Function1[/* res */ ServerResponse, SerializedResponse] = js.native
  
  /**
    * A utility method for wrapping the default error serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom error serializer. Accepts a single parameter: the newly serialized
    * error object. Returns the new (or updated) error object.
    * @return A new error serializer.
    */
  def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ js.Error, Record[String, _]] = js.native
  /**
    * A utility method for wrapping the default error serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom error serializer. Accepts a single parameter: the newly serialized
    * error object. Returns the new (or updated) error object.
    * @return A new error serializer.
    */
  @JSName("wrapErrorSerializer")
  var wrapErrorSerializer_Original: js.Function1[
    /* customSerializer */ CustomErrorSerializer, 
    js.Function1[/* err */ js.Error, Record[String, _]]
  ] = js.native
  
  /**
    * A utility method for wrapping the default request serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom request serializer. Accepts a single parameter: the newly serialized
    * request object. Returns the new (or updated) request object.
    * @return A new error serializer.
    */
  def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
  /**
    * A utility method for wrapping the default request serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom request serializer. Accepts a single parameter: the newly serialized
    * request object. Returns the new (or updated) request object.
    * @return A new error serializer.
    */
  @JSName("wrapRequestSerializer")
  var wrapRequestSerializer_Original: js.Function1[
    /* customSerializer */ CustomRequestSerializer, 
    js.Function1[/* req */ IncomingMessage, Record[String, _]]
  ] = js.native
  
  /**
    * A utility method for wrapping the default response serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom response serializer. Accepts a single parameter: the newly serialized
    * response object. Returns the new (or updated) response object.
    * @return A new error serializer.
    */
  def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, _]] = js.native
  /**
    * A utility method for wrapping the default response serializer. Allows custom serializers to work with the
    * already serialized object.
    * @param customSerializer The custom response serializer. Accepts a single parameter: the newly serialized
    * response object. Returns the new (or updated) response object.
    * @return A new error serializer.
    */
  @JSName("wrapResponseSerializer")
  var wrapResponseSerializer_Original: js.Function1[
    /* customSerializer */ CustomResponseSerializer, 
    js.Function1[/* res */ ServerResponse, Record[String, _]]
  ] = js.native
}
