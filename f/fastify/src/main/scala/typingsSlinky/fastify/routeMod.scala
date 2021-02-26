package typingsSlinky.fastify

import typingsSlinky.fastify.fastifyStrings.`no-slash`
import typingsSlinky.fastify.fastifyStrings.both
import typingsSlinky.fastify.fastifyStrings.slash
import typingsSlinky.fastify.hooksMod.DoneFuncWithErrOrRes
import typingsSlinky.fastify.hooksMod.HookHandlerDoneFunction
import typingsSlinky.fastify.hooksMod.RequestPayload
import typingsSlinky.fastify.hooksMod.onErrorHookHandler
import typingsSlinky.fastify.hooksMod.onRequestHookHandler
import typingsSlinky.fastify.hooksMod.onResponseHookHandler
import typingsSlinky.fastify.hooksMod.onSendHookHandler
import typingsSlinky.fastify.hooksMod.onTimeoutHookHandler
import typingsSlinky.fastify.hooksMod.preHandlerHookHandler
import typingsSlinky.fastify.hooksMod.preParsingHookHandler
import typingsSlinky.fastify.hooksMod.preSerializationHookHandler
import typingsSlinky.fastify.hooksMod.preValidationHookHandler
import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.loggerMod.FastifyLoggerInstance
import typingsSlinky.fastify.loggerMod.LogLevel
import typingsSlinky.fastify.replyMod.FastifyReply
import typingsSlinky.fastify.replyMod.ReplyGenericInterface
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.requestMod.RequestGenericInterface
import typingsSlinky.fastify.schemaMod.FastifyRouteSchemaDef
import typingsSlinky.fastify.schemaMod.FastifySchema
import typingsSlinky.fastify.schemaMod.FastifySchemaCompiler
import typingsSlinky.fastify.schemaMod.FastifySchemaValidationError
import typingsSlinky.fastify.schemaMod.FastifyValidationResult
import typingsSlinky.fastify.utilsMod.ContextConfigDefault
import typingsSlinky.fastify.utilsMod.HTTPMethods
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.fastify.utilsMod.RawServerDefault
import typingsSlinky.fastifyError.mod.FastifyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeMod {
  
  @js.native
  trait RouteGenericInterface
    extends RequestGenericInterface
       with ReplyGenericInterface
  object RouteGenericInterface {
    
    @scala.inline
    def apply(): RouteGenericInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteGenericInterface]
    }
  }
  
  type RouteHandler[RouteGeneric /* <: RouteGenericInterface */, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, ContextConfig] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance], 
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
    ])
  ]
  
  type RouteHandlerMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.ThisFunction2[
    /* this */ FastifyInstance[RawServer, RawRequest, RawReply, FastifyLoggerInstance], 
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    Unit | (js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
    ])
  ]
  
  @js.native
  trait RouteOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] {
    
    def handler(
      request: FastifyRequest[RouteGeneric, RawServer, RawRequest],
      reply: FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
    ): Unit | (js.Promise[
        (/* import warning: importer.ImportType#apply Failed type conversion: RouteGeneric['Reply'] */ js.Any) | Unit
      ]) = js.native
    @JSName("handler")
    var handler_Original: RouteHandlerMethod[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = js.native
    
    var method: HTTPMethods | js.Array[HTTPMethods] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait RouteShorthandMethod[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */] extends StObject {
    
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
  
  @js.native
  trait RouteShorthandOptions[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] extends StObject {
    
    var attachValidation: js.UndefOr[Boolean] = js.native
    
    var bodyLimit: js.UndefOr[Double] = js.native
    
    var config: js.UndefOr[ContextConfig] = js.native
    
    var errorHandler: js.UndefOr[
        js.ThisFunction3[
          /* this */ FastifyInstance[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            FastifyLoggerInstance
          ], 
          /* error */ FastifyError, 
          /* request */ FastifyRequest[
            RouteGenericInterface, 
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault]
          ], 
          /* reply */ FastifyReply[
            RawServerDefault, 
            RawRequestDefaultExpression[RawServerDefault], 
            RawReplyDefaultExpression[RawServerDefault], 
            RouteGenericInterface, 
            ContextConfigDefault
          ], 
          Unit
        ]
      ] = js.native
    
    var logLevel: js.UndefOr[LogLevel] = js.native
    
    var onError: js.UndefOr[
        (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]) | (js.Array[
          onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
        ])
      ] = js.native
    
    // hooks
    var onRequest: js.UndefOr[
        (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var onResponse: js.UndefOr[
        (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var onSend: js.UndefOr[
        (onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var onTimeout: js.UndefOr[
        (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var preHandler: js.UndefOr[
        (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var preParsing: js.UndefOr[
        (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var preSerialization: js.UndefOr[
        (preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var preValidation: js.UndefOr[
        (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
          preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
        ])
      ] = js.native
    
    var prefixTrailingSlash: js.UndefOr[slash | `no-slash` | both] = js.native
    
    var schema: js.UndefOr[FastifySchema] = js.native
    
    // TODO: Change to actual type.
    var schemaErrorFormatter: js.UndefOr[
        js.Function2[/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String, js.Error]
      ] = js.native
    
    var serializerCompiler: js.UndefOr[FastifySchemaCompiler] = js.native
    
    var validatorCompiler: js.UndefOr[FastifySchemaCompiler] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object RouteShorthandOptions {
    
    @scala.inline
    def apply[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig](): RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]]
    }
    
    @scala.inline
    implicit class RouteShorthandOptionsMutableBuilder[Self <: RouteShorthandOptions[_, _, _, _, _], RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] (val x: Self with (RouteShorthandOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])) extends AnyVal {
      
      @scala.inline
      def setAttachValidation(value: Boolean): Self = StObject.set(x, "attachValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachValidationUndefined: Self = StObject.set(x, "attachValidation", js.undefined)
      
      @scala.inline
      def setBodyLimit(value: Double): Self = StObject.set(x, "bodyLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyLimitUndefined: Self = StObject.set(x, "bodyLimit", js.undefined)
      
      @scala.inline
      def setConfig(value: ContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setErrorHandler(
        value: js.ThisFunction3[
              /* this */ FastifyInstance[
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault], 
                RawReplyDefaultExpression[RawServerDefault], 
                FastifyLoggerInstance
              ], 
              /* error */ FastifyError, 
              /* request */ FastifyRequest[
                RouteGenericInterface, 
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault]
              ], 
              /* reply */ FastifyReply[
                RawServerDefault, 
                RawRequestDefaultExpression[RawServerDefault], 
                RawReplyDefaultExpression[RawServerDefault], 
                RouteGenericInterface, 
                ContextConfigDefault
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "errorHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setOnError(
        value: (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]) | (js.Array[
              onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError]
            ])
      ): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnErrorFunction4(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], FastifyError, /* done */ js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "onError", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnErrorVarargs(
        value: (onErrorHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig, FastifyError])*
      ): Self = StObject.set(x, "onError", js.Array(value :_*))
      
      @scala.inline
      def setOnRequest(
        value: (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "onRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnRequestFunction3(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
      ): Self = StObject.set(x, "onRequest", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRequestUndefined: Self = StObject.set(x, "onRequest", js.undefined)
      
      @scala.inline
      def setOnRequestVarargs(value: (onRequestHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "onRequest", js.Array(value :_*))
      
      @scala.inline
      def setOnResponse(
        value: (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "onResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnResponseFunction3(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
      ): Self = StObject.set(x, "onResponse", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnResponseUndefined: Self = StObject.set(x, "onResponse", js.undefined)
      
      @scala.inline
      def setOnResponseVarargs(value: (onResponseHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "onResponse", js.Array(value :_*))
      
      @scala.inline
      def setOnSend(
        value: (onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              onSendHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "onSend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSendFunction4(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], _, /* done */ DoneFuncWithErrOrRes) => Unit
      ): Self = StObject.set(x, "onSend", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnSendUndefined: Self = StObject.set(x, "onSend", js.undefined)
      
      @scala.inline
      def setOnSendVarargs(value: (onSendHookHandler[js.Any, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "onSend", js.Array(value :_*))
      
      @scala.inline
      def setOnTimeout(
        value: (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "onTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnTimeoutFunction3(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
      ): Self = StObject.set(x, "onTimeout", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnTimeoutUndefined: Self = StObject.set(x, "onTimeout", js.undefined)
      
      @scala.inline
      def setOnTimeoutVarargs(value: (onTimeoutHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "onTimeout", js.Array(value :_*))
      
      @scala.inline
      def setPreHandler(
        value: (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "preHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreHandlerFunction3(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
      ): Self = StObject.set(x, "preHandler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPreHandlerUndefined: Self = StObject.set(x, "preHandler", js.undefined)
      
      @scala.inline
      def setPreHandlerVarargs(value: (preHandlerHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "preHandler", js.Array(value :_*))
      
      @scala.inline
      def setPreParsing(
        value: (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "preParsing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreParsingFunction4(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* payload */ RequestPayload, /* done */ js.Function2[
              /* err */ js.UndefOr[FastifyError | Null], 
              /* res */ js.UndefOr[RequestPayload], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "preParsing", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPreParsingUndefined: Self = StObject.set(x, "preParsing", js.undefined)
      
      @scala.inline
      def setPreParsingVarargs(value: (preParsingHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "preParsing", js.Array(value :_*))
      
      @scala.inline
      def setPreSerialization(
        value: (preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              preSerializationHookHandler[_, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "preSerialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreSerializationFunction4(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], _, /* done */ DoneFuncWithErrOrRes) => Unit
      ): Self = StObject.set(x, "preSerialization", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPreSerializationUndefined: Self = StObject.set(x, "preSerialization", js.undefined)
      
      @scala.inline
      def setPreSerializationVarargs(
        value: (preSerializationHookHandler[js.Any, RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*
      ): Self = StObject.set(x, "preSerialization", js.Array(value :_*))
      
      @scala.inline
      def setPreValidation(
        value: (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) | (js.Array[
              preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]
            ])
      ): Self = StObject.set(x, "preValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreValidationFunction3(
        value: (/* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], /* done */ HookHandlerDoneFunction) => Unit
      ): Self = StObject.set(x, "preValidation", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPreValidationUndefined: Self = StObject.set(x, "preValidation", js.undefined)
      
      @scala.inline
      def setPreValidationVarargs(value: (preValidationHookHandler[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig])*): Self = StObject.set(x, "preValidation", js.Array(value :_*))
      
      @scala.inline
      def setPrefixTrailingSlash(value: slash | `no-slash` | both): Self = StObject.set(x, "prefixTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixTrailingSlashUndefined: Self = StObject.set(x, "prefixTrailingSlash", js.undefined)
      
      @scala.inline
      def setSchema(value: FastifySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaErrorFormatter(value: (/* errors */ js.Array[FastifySchemaValidationError], /* dataVar */ String) => js.Error): Self = StObject.set(x, "schemaErrorFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSchemaErrorFormatterUndefined: Self = StObject.set(x, "schemaErrorFormatter", js.undefined)
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSerializerCompiler(value: /* routeSchema */ FastifyRouteSchemaDef => FastifyValidationResult): Self = StObject.set(x, "serializerCompiler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializerCompilerUndefined: Self = StObject.set(x, "serializerCompiler", js.undefined)
      
      @scala.inline
      def setValidatorCompiler(value: /* routeSchema */ FastifyRouteSchemaDef => FastifyValidationResult): Self = StObject.set(x, "validatorCompiler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorCompilerUndefined: Self = StObject.set(x, "validatorCompiler", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
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
}
