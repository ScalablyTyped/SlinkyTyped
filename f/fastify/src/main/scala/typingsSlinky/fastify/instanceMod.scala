package typingsSlinky.fastify

import typingsSlinky.fastify.anon.Backlog
import typingsSlinky.fastify.anon.BodyLimit
import typingsSlinky.fastify.anon.Default
import typingsSlinky.fastify.anon.DefaultFastifyPluginAsync
import typingsSlinky.fastify.anon.ParseAs
import typingsSlinky.fastify.contentTypeParserMod.AddContentTypeParser
import typingsSlinky.fastify.contentTypeParserMod.FastifyBodyParser
import typingsSlinky.fastify.contentTypeParserMod.FastifyContentTypeParser
import typingsSlinky.fastify.contentTypeParserMod.hasContentTypeParser
import typingsSlinky.fastify.fastifyStrings.onClose
import typingsSlinky.fastify.fastifyStrings.onError
import typingsSlinky.fastify.fastifyStrings.onReady
import typingsSlinky.fastify.fastifyStrings.onRegister
import typingsSlinky.fastify.fastifyStrings.onRequest
import typingsSlinky.fastify.fastifyStrings.onResponse
import typingsSlinky.fastify.fastifyStrings.onRoute
import typingsSlinky.fastify.fastifyStrings.onSend
import typingsSlinky.fastify.fastifyStrings.onTimeout
import typingsSlinky.fastify.fastifyStrings.preHandler
import typingsSlinky.fastify.fastifyStrings.preParsing
import typingsSlinky.fastify.fastifyStrings.preSerialization
import typingsSlinky.fastify.fastifyStrings.preValidation
import typingsSlinky.fastify.hooksMod.onCloseHookHandler
import typingsSlinky.fastify.hooksMod.onErrorAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onErrorHookHandler
import typingsSlinky.fastify.hooksMod.onReadyAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onReadyHookHandler
import typingsSlinky.fastify.hooksMod.onRegisterHookHandler
import typingsSlinky.fastify.hooksMod.onRequestAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onRequestHookHandler
import typingsSlinky.fastify.hooksMod.onResponseAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onResponseHookHandler
import typingsSlinky.fastify.hooksMod.onRouteHookHandler
import typingsSlinky.fastify.hooksMod.onSendAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onSendHookHandler
import typingsSlinky.fastify.hooksMod.onTimeoutAsyncHookHandler
import typingsSlinky.fastify.hooksMod.onTimeoutHookHandler
import typingsSlinky.fastify.hooksMod.preHandlerAsyncHookHandler
import typingsSlinky.fastify.hooksMod.preHandlerHookHandler
import typingsSlinky.fastify.hooksMod.preParsingAsyncHookHandler
import typingsSlinky.fastify.hooksMod.preParsingHookHandler
import typingsSlinky.fastify.hooksMod.preSerializationAsyncHookHandler
import typingsSlinky.fastify.hooksMod.preSerializationHookHandler
import typingsSlinky.fastify.hooksMod.preValidationAsyncHookHandler
import typingsSlinky.fastify.hooksMod.preValidationHookHandler
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.pluginMod.FastifyPluginAsync
import typingsSlinky.fastify.pluginMod.FastifyPluginCallback
import typingsSlinky.fastify.pluginMod.FastifyPluginOptions
import typingsSlinky.fastify.registerMod.FastifyRegister
import typingsSlinky.fastify.registerMod.FastifyRegisterOptions
import typingsSlinky.fastify.replyMod.FastifyReply
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.routeMod.RouteGenericInterface
import typingsSlinky.fastify.routeMod.RouteHandlerMethod
import typingsSlinky.fastify.routeMod.RouteOptions
import typingsSlinky.fastify.routeMod.RouteShorthandMethod
import typingsSlinky.fastify.routeMod.RouteShorthandOptions
import typingsSlinky.fastify.routeMod.RouteShorthandOptionsWithHandler
import typingsSlinky.fastify.schemaMod.FastifySchemaCompiler
import typingsSlinky.fastify.schemaMod.FastifySchemaValidationError
import typingsSlinky.fastify.utilsMod.ContextConfigDefault
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.fastify.utilsMod.RawServerDefault
import typingsSlinky.fastifyError.mod.FastifyError
import typingsSlinky.lightMyRequest.mod.CallbackFunc
import typingsSlinky.lightMyRequest.mod.Chain
import typingsSlinky.lightMyRequest.mod.InjectOptions
import typingsSlinky.lightMyRequest.mod.Response
import typingsSlinky.node.Buffer
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceMod {
  
  @js.native
  trait FastifyInstance[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger] extends StObject {
    
    /**
      * Add a content type parser
      */
    def addContentTypeParser(
      contentType: String,
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    def addContentTypeParser(
      contentType: String,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.Array[String],
      opts: BodyLimit,
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def addContentTypeParser(
      contentType: js.Array[String],
      parser: FastifyContentTypeParser[RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    def addContentTypeParser[parseAs /* <: String | Buffer */](
      contentType: String,
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    def addContentTypeParser[parseAs /* <: String | Buffer */](
      contentType: js.Array[String],
      opts: ParseAs[parseAs],
      parser: FastifyBodyParser[parseAs, RawServer, RawRequest, RouteGenericInterface]
    ): Unit = js.native
    /**
      * Add a content type parser
      */
    @JSName("addContentTypeParser")
    var addContentTypeParser_Original: AddContentTypeParser[RawServer, RawRequest] = js.native
    
    /**
      * Triggered when fastify.close() is invoked to stop the server. It is useful when plugins need a "shutdown" event, for example to close an open connection to a database.
      */
    @JSName("addHook")
    def addHook_onClose(name: onClose, hook: onCloseHookHandler[RawServer, RawRequest, RawReply, Logger]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onError[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onError,
      hook: onErrorAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * This hook is useful if you need to do some custom error logging or add some specific header in case of error.
      * It is not intended for changing the error, and calling reply.send will throw an exception.
      * This hook will be executed only after the customErrorHandler has been executed, and only if the customErrorHandler sends an error back to the user (Note that the default customErrorHandler always sends the error back to the user).
      * Notice: unlike the other hooks, pass an error to the done function is not supported.
      */
    @JSName("addHook")
    def addHook_onError[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onError,
      hook: onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onReady(name: onReady, hook: onReadyAsyncHookHandler): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * Triggered when fastify.listen() or fastify.ready() is invoked to start the server. It is useful when plugins need a "ready" event, for example to load data before the server start listening for requests.
      */
    @JSName("addHook")
    def addHook_onReady(name: onReady, hook: onReadyHookHandler): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * Triggered when a new plugin is registered and a new encapsulation context is created. The hook will be executed before the registered code.
      * This hook can be useful if you are developing a plugin that needs to know when a plugin context is formed, and you want to operate in that specific context.
      * Note: This hook will not be called if a plugin is wrapped inside fastify-plugin.
      */
    @JSName("addHook")
    def addHook_onRegister(name: onRegister, hook: onRegisterHookHandler[RawServer, RawRequest, RawReply, Logger]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onRequest[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onRequest,
      hook: onRequestAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    // addHook: overloads
    // Lifecycle addHooks
    /**
      * `onRequest` is the first hook to be executed in the request lifecycle. There was no previous hook, the next hook will be `preParsing`.
      *  Notice: in the `onRequest` hook, request.body will always be null, because the body parsing happens before the `preHandler` hook.
      */
    @JSName("addHook")
    def addHook_onRequest[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onRequest,
      hook: onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onResponse[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onResponse,
      hook: onResponseAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `onResponse` is the seventh and last hook in the request hook lifecycle. The previous hook was `onSend`, there is no next hook.
      * The onResponse hook is executed when a response has been sent, so you will not be able to send more data to the client. It can however be useful for sending data to external services, for example to gather statistics.
      */
    @JSName("addHook")
    def addHook_onResponse[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onResponse,
      hook: onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    // Application addHooks
    /**
      * Triggered when a new route is registered. Listeners are passed a routeOptions object as the sole parameter. The interface is synchronous, and, as such, the listener does not get passed a callback
      */
    @JSName("addHook")
    def addHook_onRoute[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onRoute,
      hook: onRouteHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onSend[OnSendPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onSend,
      hook: onSendAsyncHookHandler[OnSendPayload, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * You can change the payload with the `onSend` hook. It is the sixth hook to be executed in the request lifecycle. The previous hook was `preSerialization`, the next hook will be `onResponse`.
      * Note: If you change the payload, you may only change it to a string, a Buffer, a stream, or null.
      */
    @JSName("addHook")
    def addHook_onSend[OnSendPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onSend,
      hook: onSendHookHandler[OnSendPayload, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_onTimeout[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onTimeout,
      hook: onTimeoutAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `onTimeout` is useful if you need to monitor the request timed out in your service. (if the `connectionTimeout` property is set on the fastify instance)
      * The onTimeout hook is executed when a request is timed out and the http socket has been hanged up. Therefore you will not be able to send data to the client.
      */
    @JSName("addHook")
    def addHook_onTimeout[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: onTimeout,
      hook: onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_preHandler[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preHandler,
      hook: preHandlerAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `preHandler` is the fourth hook to be executed in the request lifecycle. The previous hook was `preValidation`, the next hook will be `preSerialization`.
      */
    @JSName("addHook")
    def addHook_preHandler[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preHandler,
      hook: preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_preParsing[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preParsing,
      hook: preParsingAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `preParsing` is the second hook to be executed in the request lifecycle. The previous hook was `onRequest`, the next hook will be `preValidation`.
      * Notice: in the `preParsing` hook, request.body will always be null, because the body parsing happens before the `preHandler` hook.
      */
    @JSName("addHook")
    def addHook_preParsing[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preParsing,
      hook: preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_preSerialization[PreSerializationPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preSerialization,
      hook: preSerializationAsyncHookHandler[PreSerializationPayload, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `preSerialization` is the fifth hook to be executed in the request lifecycle. The previous hook was `preHandler`, the next hook will be `onSend`.
      *  Note: the hook is NOT called if the payload is a string, a Buffer, a stream or null.
      */
    @JSName("addHook")
    def addHook_preSerialization[PreSerializationPayload, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preSerialization,
      hook: preSerializationHookHandler[PreSerializationPayload, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    @JSName("addHook")
    def addHook_preValidation[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preValidation,
      hook: preValidationAsyncHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    /**
      * `preValidation` is the third hook to be executed in the request lifecycle. The previous hook was `preParsing`, the next hook will be `preHandler`.
      */
    @JSName("addHook")
    def addHook_preValidation[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      name: preValidation,
      hook: preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def addSchema(schema: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def after(): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def after(afterListener: js.Function1[/* err */ js.Error, Unit]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def all[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("all")
    var all_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def close(): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def close(closeListener: js.Function0[Unit]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    // should be able to define something useful with the decorator getter/setter pattern using Generics to enfore the users function returns what they expect it to
    def decorate(property: String, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorate(property: String, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorate(property: js.Symbol, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorate(property: js.Symbol, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def decorateReply(property: String, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateReply(property: String, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateReply(property: js.Symbol, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateReply(property: js.Symbol, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def decorateRequest(property: String, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateRequest(property: String, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateRequest(property: js.Symbol, value: js.Any): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    def decorateRequest(property: js.Symbol, value: js.Any, dependencies: js.Array[String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def delete[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("delete")
    var delete_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def get[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    
    def getSchema(schemaId: String): js.Any = js.native
    
    def getSchemas(): Record[String, _] = js.native
    
    @JSName("get")
    var get_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def hasContentTypeParser(contentType: String): Boolean = js.native
    @JSName("hasContentTypeParser")
    var hasContentTypeParser_Original: hasContentTypeParser = js.native
    
    def hasDecorator(decorator: String): Boolean = js.native
    def hasDecorator(decorator: js.Symbol): Boolean = js.native
    
    def hasReplyDecorator(decorator: String): Boolean = js.native
    def hasReplyDecorator(decorator: js.Symbol): Boolean = js.native
    
    def hasRequestDecorator(decorator: String): Boolean = js.native
    def hasRequestDecorator(decorator: js.Symbol): Boolean = js.native
    
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def head[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("head")
    var head_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def inject(): Chain = js.native
    def inject(opts: String): js.Promise[Response] = js.native
    def inject(opts: String, cb: CallbackFunc): Unit = js.native
    def inject(opts: InjectOptions): js.Promise[Response] = js.native
    def inject(opts: InjectOptions, cb: CallbackFunc): Unit = js.native
    
    def listen(opts: Backlog): js.Promise[String] = js.native
    def listen(opts: Backlog, callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]): Unit = js.native
    def listen(port: String): js.Promise[String] = js.native
    def listen(port: String, address: js.UndefOr[scala.Nothing], backlog: Double): js.Promise[String] = js.native
    def listen(port: String, address: String): js.Promise[String] = js.native
    def listen(port: String, address: String, backlog: Double): js.Promise[String] = js.native
    def listen(
      port: String,
      address: String,
      backlog: Double,
      callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]
    ): Unit = js.native
    def listen(
      port: String,
      address: String,
      callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]
    ): Unit = js.native
    def listen(port: String, callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]): Unit = js.native
    def listen(port: Double): js.Promise[String] = js.native
    def listen(port: Double, address: js.UndefOr[scala.Nothing], backlog: Double): js.Promise[String] = js.native
    def listen(port: Double, address: String): js.Promise[String] = js.native
    def listen(port: Double, address: String, backlog: Double): js.Promise[String] = js.native
    def listen(
      port: Double,
      address: String,
      backlog: Double,
      callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]
    ): Unit = js.native
    def listen(
      port: Double,
      address: String,
      callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]
    ): Unit = js.native
    def listen(port: Double, callback: js.Function2[/* err */ js.Error, /* address */ String, Unit]): Unit = js.native
    
    var log: Logger = js.native
    
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def options[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("options")
    var options_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def patch[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("patch")
    var patch_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def post[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("post")
    var post_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    var prefix: String = js.native
    
    /**
      * Prints the representation of the internal radix tree used by the router
      */
    def printRoutes(): String = js.native
    
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptionsWithHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    def put[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](
      path: String,
      opts: RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig],
      handler: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance] = js.native
    @JSName("put")
    var put_Original: RouteShorthandMethod[RawServer, RawRequest, RawReply] = js.native
    
    def ready(): (FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def ready(readyListener: js.Function1[/* err */ js.Error, Unit]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    def register[Options /* <: FastifyPluginOptions */](plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def register[Options /* <: FastifyPluginOptions */](
      plugin: js.Promise[Default[Options] | DefaultFastifyPluginAsync[Options]],
      opts: FastifyRegisterOptions[Options]
    ): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def register[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def register[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginAsync[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def register[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    def register[Options /* <: FastifyPluginOptions */](plugin: FastifyPluginCallback[Options, RawServerDefault], opts: FastifyRegisterOptions[Options]): (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]] = js.native
    @JSName("register")
    var register_Original: FastifyRegister[
        (FastifyInstance[RawServer, RawRequest, RawReply, Logger]) with js.Thenable[js.UndefOr[scala.Nothing]]
      ] = js.native
    
    def route[RouteGeneric /* <: RouteGenericInterface */, ContextConfig](opts: RouteOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    var server: RawServer = js.native
    
    /**
      * Set a function that will be called whenever an error happens
      */
    def setErrorHandler[TError /* <: js.Error */, RouteGeneric /* <: RouteGenericInterface */](
      handler: js.ThisFunction3[
          /* this */ FastifyInstance[RawServer, RawRequest, RawReply, Logger], 
          /* error */ TError, 
          /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
          /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfigDefault], 
          Unit
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    /**
      * Set the 404 handler
      */
    def setNotFoundHandler[RouteGeneric /* <: RouteGenericInterface */](
      handler: js.Function2[
          /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
          /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfigDefault], 
          Unit
        ]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    /**
      * Set the reply serializer for all routes.
      */
    def setReplySerializer(replySerializer: js.Function2[/* payload */ js.Any, /* statusCode */ Double, String]): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    /*
      * Set the schema error formatter for all routes.
      */
    def setSchemaErrorFormatter(
      errorFormatter: js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, js.Error]
    ): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    /**
      * Set the schema serializer for all routes.
      */
    def setSerializerCompiler(schemaCompiler: FastifySchemaCompiler): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    /**
      * Set the schema validator for all routes.
      */
    def setValidatorCompiler(schemaCompiler: FastifySchemaCompiler): FastifyInstance[RawServer, RawRequest, RawReply, Logger] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
}
