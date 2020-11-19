package typingsSlinky.apolloProtobufjs.mod

import typingsSlinky.apolloProtobufjs.mod.util.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs", "rpc")
@js.native
object rpc extends js.Object {
  
  /** An RPC service as returned by {@link Service#create}. */
  @js.native
  class Service protected () extends EventEmitter {
    /**
      * Constructs a new RPC service instance.
      * @param rpcImpl RPC implementation
      * @param [requestDelimited=false] Whether requests are length-delimited
      * @param [responseDelimited=false] Whether responses are length-delimited
      */
    def this(rpcImpl: RPCImpl) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
    def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
    
    /**
      * Ends this service and emits the `end` event.
      * @param [endedByRPC=false] Whether the service has been ended by the RPC implementation.
      * @returns `this`
      */
    def end(): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
    def end(endedByRPC: Boolean): typingsSlinky.apolloProtobufjs.mod.rpc.Service = js.native
    
    /** Whether requests are length-delimited. */
    var requestDelimited: Boolean = js.native
    
    /** Whether responses are length-delimited. */
    var responseDelimited: Boolean = js.native
    
    /**
      * Calls a service method through {@link rpc.Service#rpcImpl|rpcImpl}.
      * @param method Reflected or static method
      * @param requestCtor Request constructor
      * @param responseCtor Response constructor
      * @param request Request message or plain object
      * @param callback Service callback
      */
    def rpcCall[TReq /* <: Message[TReq] */, TRes /* <: Message[TRes] */](
      method: Method,
      requestCtor: Constructor[TReq],
      responseCtor: Constructor[TRes],
      request: TReq,
      callback: ServiceMethodCallback[TRes]
    ): Unit = js.native
    def rpcCall[TReq /* <: Message[TReq] */, TRes /* <: Message[TRes] */](
      method: Method,
      requestCtor: Constructor[TReq],
      responseCtor: Constructor[TRes],
      request: Properties[TReq],
      callback: ServiceMethodCallback[TRes]
    ): Unit = js.native
    def rpcCall[TReq /* <: Message[TReq] */, TRes /* <: Message[TRes] */](
      method: ServiceMethod[TReq, TRes],
      requestCtor: Constructor[TReq],
      responseCtor: Constructor[TRes],
      request: TReq,
      callback: ServiceMethodCallback[TRes]
    ): Unit = js.native
    def rpcCall[TReq /* <: Message[TReq] */, TRes /* <: Message[TRes] */](
      method: ServiceMethod[TReq, TRes],
      requestCtor: Constructor[TReq],
      responseCtor: Constructor[TRes],
      request: Properties[TReq],
      callback: ServiceMethodCallback[TRes]
    ): Unit = js.native
    
    /** RPC implementation. Becomes `null` once the service is ended. */
    var rpcImpl: RPCImpl | Null = js.native
  }
  
  /**
    * A service method part of a {@link rpc.Service} as created by {@link Service.create}.
    * @param request Request message or plain object
    * @param [callback] Node-style callback called with the error, if any, and the response message
    * @returns Promise if `callback` has been omitted, otherwise `undefined`
    */
  type ServiceMethod[TReq /* <: Message[TReq] */, TRes /* <: Message[TRes] */] = js.Function2[
    /* request */ TReq | Properties[TReq], 
    /* callback */ js.UndefOr[ServiceMethodCallback[TRes]], 
    js.Promise[Message[TRes]]
  ]
  
  /**
    * A service method callback as used by {@link rpc.ServiceMethod|ServiceMethod}.
    *
    * Differs from {@link RPCImplCallback} in that it is an actual callback of a service method which may not return `response = null`.
    * @param error Error, if any
    * @param [response] Response message
    */
  type ServiceMethodCallback[TRes /* <: Message[TRes] */] = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[TRes], Unit]
}
