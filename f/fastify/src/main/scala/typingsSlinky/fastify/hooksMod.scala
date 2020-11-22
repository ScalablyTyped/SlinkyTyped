package typingsSlinky.fastify

import typingsSlinky.fastify.anon.Path
import typingsSlinky.fastify.instanceMod.FastifyInstance
import typingsSlinky.fastify.replyMod.FastifyReply
import typingsSlinky.fastify.requestMod.FastifyRequest
import typingsSlinky.fastify.routeMod.RouteGenericInterface
import typingsSlinky.fastify.routeMod.RouteOptions
import typingsSlinky.fastify.utilsMod.RawReplyDefaultExpression
import typingsSlinky.fastify.utilsMod.RawRequestDefaultExpression
import typingsSlinky.fastify.utilsMod.RawServerBase
import typingsSlinky.fastifyError.mod.FastifyError
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify/types/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  // This is used within the `preSerialization` and `onSend` hook handlers
  @js.native
  trait DoneFuncWithErrOrRes extends js.Object {
    
    def apply(): Unit = js.native
    def apply(err: Null, res: js.Any): Unit = js.native
    def apply[TError /* <: js.Error */](err: TError): Unit = js.native
  }
  
  @js.native
  trait RequestPayload extends Readable {
    
    var receivedEncodedLength: js.UndefOr[Double] = js.native
  }
  
  type HookHandlerDoneFunction = js.Function1[/* err */ js.UndefOr[FastifyError], Unit]
  
  type onCloseHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger] = js.Function2[
    /* instance */ FastifyInstance[RawServer, RawRequest, RawReply, Logger], 
    /* done */ HookHandlerDoneFunction, 
    js.Promise[js.Any] | Unit
  ]
  
  type onErrorAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, TError /* <: js.Error */] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* error */ TError, 
    js.Promise[js.Any]
  ]
  
  type onErrorHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig, TError /* <: js.Error */] = js.Function4[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* error */ TError, 
    /* done */ js.Function0[Unit], 
    Unit
  ]
  
  type onReadyAsyncHookHandler = js.Function0[js.Promise[js.Any]]
  
  type onReadyHookHandler = js.Function1[/* done */ HookHandlerDoneFunction, Unit]
  
  type onRegisterHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, Logger] = js.Function2[
    /* instance */ FastifyInstance[RawServer, RawRequest, RawReply, Logger], 
    /* done */ HookHandlerDoneFunction, 
    js.Promise[js.Any] | Unit
  ]
  
  type onRequestAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    js.Promise[js.Any]
  ]
  
  type onRequestHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onResponseAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    js.Promise[js.Any]
  ]
  
  type onResponseHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type onRouteHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function1[
    /* opts */ (RouteOptions[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig]) with Path, 
    js.Promise[js.Any] | Unit
  ]
  
  type onSendAsyncHookHandler[OnSendPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ OnSendPayload, 
    js.Promise[js.Any]
  ]
  
  type onSendHookHandler[OnSendPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function4[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ OnSendPayload, 
    /* done */ DoneFuncWithErrOrRes, 
    Unit
  ]
  
  type onTimeoutAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    js.Promise[js.Any]
  ]
  
  type onTimeoutHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type preHandlerAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    js.Promise[js.Any]
  ]
  
  type preHandlerHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
  
  type preParsingAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ RequestPayload, 
    js.Promise[RequestPayload | js.Any]
  ]
  
  type preParsingHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function4[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ RequestPayload, 
    /* done */ js.Function2[
      /* err */ js.UndefOr[FastifyError | Null], 
      /* res */ js.UndefOr[RequestPayload], 
      Unit
    ], 
    Unit
  ]
  
  type preSerializationAsyncHookHandler[PreSerializationPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ PreSerializationPayload, 
    js.Promise[js.Any]
  ]
  
  type preSerializationHookHandler[PreSerializationPayload, RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function4[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* payload */ PreSerializationPayload, 
    /* done */ DoneFuncWithErrOrRes, 
    Unit
  ]
  
  type preValidationAsyncHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function2[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    js.Promise[js.Any]
  ]
  
  type preValidationHookHandler[RawServer /* <: RawServerBase */, RawRequest /* <: RawRequestDefaultExpression[RawServer] */, RawReply /* <: RawReplyDefaultExpression[RawServer] */, RouteGeneric /* <: RouteGenericInterface */, ContextConfig] = js.Function3[
    /* request */ FastifyRequest[RouteGeneric, RawServer, RawRequest], 
    /* reply */ FastifyReply[RawServer, RawRequest, RawReply, RouteGeneric, ContextConfig], 
    /* done */ HookHandlerDoneFunction, 
    Unit
  ]
}
