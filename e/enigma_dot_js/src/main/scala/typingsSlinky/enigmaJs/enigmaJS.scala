package typingsSlinky.enigmaJs

import typingsSlinky.enigmaJs.anon.Api
import typingsSlinky.enigmaJs.enigmaJsStrings.changed
import typingsSlinky.enigmaJs.enigmaJsStrings.closed
import typingsSlinky.enigmaJs.enigmaJsStrings.opened
import typingsSlinky.enigmaJs.enigmaJsStrings.resumed
import typingsSlinky.enigmaJs.enigmaJsStrings.suspended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enigmaJS {
  
  /**
    * This section describes the configuration object that is sent into enigma.create(config).
    */
  @js.native
  trait IConfig extends StObject {
    
    /**
      * ES6-compatible Promise library.
      */
    var Promise: js.UndefOr[js.Any] = js.native
    
    /**
      * A function to use when instantiating the WebSocket, mandatory for Node.js.
      */
    var createSocket: js.UndefOr[js.Any] = js.native
    
    /**
      * Mixins to extend/augment the QIX Engine API.
      * See Mixins section for more information how each entry in this array should look like.
      * Mixins are applied in the array order.
      */
    var mixins: js.UndefOr[js.Array[IMixin]] = js.native
    
    /**
      * An object containing additional JSON-RPC request parameters.
      * protocol.delta :  Set to false to disable the use of the bandwidth-reducing delta protocol.
      */
    var protocol: js.UndefOr[js.Any] = js.native
    
    /**
      * Interceptors for augmenting requests before they are sent to QIX Engine.
      * See Interceptors section for more information how each entry in this array should look like.
      * Interceptors are applied in the array order.
      */
    var requestInterceptors: js.UndefOr[js.Array[IRequestInterceptors]] = js.native
    
    /**
      * Interceptors for augmenting responses before they are sent to QIX Engine.
      * See Interceptors section for more information how each entry in this array should look like.
      * Interceptors are applied in the array order.
      */
    var responseInterceptors: js.UndefOr[js.Array[IResponseInterceptors]] = js.native
    
    /**
      * Object containing the specification for the API to generate. Corresponds to a specific version of the QIX Engine API.
      */
    var schema: js.Object = js.native
    
    /**
      * Set to true if the session should be suspended instead of closed when the websocket is closed.
      */
    var suspendOnClose: js.UndefOr[Boolean] = js.native
    
    /**
      * String containing a proper websocket URL to QIX Engine.
      */
    var url: String = js.native
  }
  object IConfig {
    
    @scala.inline
    def apply(schema: js.Object, url: String): IConfig = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateSocket(value: js.Any): Self = StObject.set(x, "createSocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSocketUndefined: Self = StObject.set(x, "createSocket", js.undefined)
      
      @scala.inline
      def setMixins(value: js.Array[IMixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setMixinsVarargs(value: IMixin*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      @scala.inline
      def setProtocol(value: js.Any): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequestInterceptors(value: js.Array[IRequestInterceptors]): Self = StObject.set(x, "requestInterceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestInterceptorsUndefined: Self = StObject.set(x, "requestInterceptors", js.undefined)
      
      @scala.inline
      def setRequestInterceptorsVarargs(value: IRequestInterceptors*): Self = StObject.set(x, "requestInterceptors", js.Array(value :_*))
      
      @scala.inline
      def setResponseInterceptors(value: js.Array[IResponseInterceptors]): Self = StObject.set(x, "responseInterceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseInterceptorsUndefined: Self = StObject.set(x, "responseInterceptors", js.undefined)
      
      @scala.inline
      def setResponseInterceptorsVarargs(value: IResponseInterceptors*): Self = StObject.set(x, "responseInterceptors", js.Array(value :_*))
      
      @scala.inline
      def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendOnClose(value: Boolean): Self = StObject.set(x, "suspendOnClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuspendOnCloseUndefined: Self = StObject.set(x, "suspendOnClose", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGeneratedAPI extends StObject {
    
    /**
      * manual emit an events
      * @param event - event that occures
      */
    @JSName("emit")
    def emit_changed(event: changed): Unit = js.native
    @JSName("emit")
    def emit_closed(event: closed): Unit = js.native
    
    /**
      * Despite the name, this property corresponds to the qInfo.qType property on your generic object's properties object.
      */
    var genericType: String = js.native
    
    /**
      * This property contains the handle QIX Engine assigned to the API.
      * Used internally in enigma.js for caches and JSON-RPC
      */
    var handle: Double = js.native
    
    /**
      * This property contains the unique identifier for this API.
      */
    var id: String = js.native
    
    /**
      * register a function for events
      * @param event - function called if this event occures
      * @param func - function that is called
      */
    @JSName("on")
    def on_changed(event: changed, func: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_closed(event: closed, func: js.Function0[Unit]): Unit = js.native
    
    /**
      * This property contains a reference to the session that this API belongs to.
      */
    var session: ISession = js.native
    
    /**
      * This property contains the schema class name for this API.
      */
    var `type`: String = js.native
  }
  
  @js.native
  trait IMixin extends StObject {
    
    /**
      * mixin.extend is an object containing methods to extend the generated API with. These method names cannot already exist or enigma.js will throw an error.
      */
    var extend: js.UndefOr[js.Any] = js.native
    
    def init(args: Api): Unit = js.native
    
    /**
      * mixin.override is an object containing methods that overrides existing API methods.
      * These method names needs to exist already* or engima.js will throw an error.
      * Be careful when overriding, you may break expected behaviors in other mixins or your application.
      * base is a reference to the previous mixin method, can be used to invoke the mixin chain before this mixin method.
      */
    var `override`: js.UndefOr[js.Any] = js.native
    
    /**
      * QIX Engine types like for example GenericObject, Doc, GenericBookmark, are supported but also custom GenericObject
      * types such as barchart, story and myCustomType.
      * An API will get both their generic type as well as custom type mixins applied.
      */
    var types: js.Array[MixinType] = js.native
  }
  object IMixin {
    
    @scala.inline
    def apply(init: Api => Unit, types: js.Array[MixinType]): IMixin = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMixin]
    }
    
    @scala.inline
    implicit class IMixinMutableBuilder[Self <: IMixin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtend(value: js.Any): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      @scala.inline
      def setInit(value: Api => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOverride(value: js.Any): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[MixinType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: MixinType*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IProtocol extends StObject {
    
    // Set to false to disable the use of the bandwidth-reducing delta protocol.
    var delta: js.UndefOr[Boolean] = js.native
  }
  object IProtocol {
    
    @scala.inline
    def apply(): IProtocol = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProtocol]
    }
    
    @scala.inline
    implicit class IProtocolMutableBuilder[Self <: IProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Boolean): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    }
  }
  
  @js.native
  trait IRequestInterceptors extends StObject {
    
    /**
      * This method is invoked when a request is about to be sent to QIX Engine.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @returns request the new request
      */
    var onFulfilled: js.UndefOr[
        js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, _]
      ] = js.native
  }
  object IRequestInterceptors {
    
    @scala.inline
    def apply(): IRequestInterceptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRequestInterceptors]
    }
    
    @scala.inline
    implicit class IRequestInterceptorsMutableBuilder[Self <: IRequestInterceptors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFulfilled(value: (/* session */ ISession, /* request */ js.Any, /* result */ js.Any) => _): Self = StObject.set(x, "onFulfilled", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnFulfilledUndefined: Self = StObject.set(x, "onFulfilled", js.undefined)
    }
  }
  
  @js.native
  trait IResponseInterceptors extends StObject {
    
    /**
      * This method is invoked when a promise has been successfully resolved, use this to modify the result or reject the promise chain before it is sent to mixins.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @param error is whatever the previous interceptor resolved with.
      */
    var onFulfilled: js.UndefOr[
        js.Function3[/* session */ ISession, /* request */ js.Any, /* result */ js.Any, js.Promise[_]]
      ] = js.native
    
    /**
      * This method is invoked when a previous interceptor has rejected the promise, use this to handle for example errors before they are sent into mixins.
      * @param session refers to the session executing the interceptor.
      * @param request is the JSON-RPC request resulting in this error. You may use .retry() to retry sending it to QIX Engine.
      * @param error is whatever the previous interceptor rejected with.
      */
    var onRejected: js.UndefOr[
        js.Function3[/* session */ ISession, /* request */ js.Any, /* error */ js.Any, js.Promise[_]]
      ] = js.native
  }
  object IResponseInterceptors {
    
    @scala.inline
    def apply(): IResponseInterceptors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IResponseInterceptors]
    }
    
    @scala.inline
    implicit class IResponseInterceptorsMutableBuilder[Self <: IResponseInterceptors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFulfilled(value: (/* session */ ISession, /* request */ js.Any, /* result */ js.Any) => js.Promise[_]): Self = StObject.set(x, "onFulfilled", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnFulfilledUndefined: Self = StObject.set(x, "onFulfilled", js.undefined)
      
      @scala.inline
      def setOnRejected(value: (/* session */ ISession, /* request */ js.Any, /* error */ js.Any) => js.Promise[_]): Self = StObject.set(x, "onRejected", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnRejectedUndefined: Self = StObject.set(x, "onRejected", js.undefined)
    }
  }
  
  @js.native
  trait ISession extends StObject {
    
    /**
      * Closes the websocket and cleans up internal caches, also triggers the closed event on all generated APIs.
      * Eventually resolved when the websocket has been closed.
      *
      * Note: you need to manually invoke this when you want to close a session and config.suspendOnClose is true.
      * @return Promise.
      */
    def close(): js.Promise[_] = js.native
    
    def on(event: String, func: js.Any): Unit = js.native
    @JSName("on")
    def on_closed(event: closed, func: js.Any): Unit = js.native
    /**
      * Handle opened state. This event is triggered whenever the websocket is connected and ready for communication.
      *
      * Handle closed state. This event is triggered when the underlying websocket is closed and config.suspendOnClose is false.
      *
      * Handle suspended state. This event is triggered in two cases (listed below). It is useful in scenarios where you for example
      * want to block interaction in your application until you are resumed again.
      * If config.suspendOnClose is true and there was a network disconnect (socked closed)
      * If you ran session.suspend()
      * The evt.initiator value is a string indicating what triggered the suspended state. Possible values: network, manual.
      *
      * Handle resumed state. This event is triggered when the session was properly resumed.
      * It is useful in scenarios where you for example can close blocking modal dialogs and allow the user to interact with your application again.
      *
      * notification:*
      * @param event - Event that triggers the function
      * @param func - Called function
      */
    @JSName("on")
    def on_opened(event: opened, func: js.Any): Unit = js.native
    @JSName("on")
    def on_resumed(event: resumed, func: js.Any): Unit = js.native
    @JSName("on")
    def on_suspended(event: suspended, func: js.Any): Unit = js.native
    
    /**
      * Establishes the websocket against the configured URL. Eventually resolved with the QIX global interface when the connection has been established.
      * @return Promise.
      */
    def open[T /* <: IGeneratedAPI */](): js.Promise[T] = js.native
    
    /**
      * Resume a previously suspended enigma.js session by re-creating the websocket and, if possible, re-open the document
      * as well as refreshing the internal caches. If successful, changed events will be triggered on all generated APIs,
      * and on the ones it was unable to restore, the closed event will be triggered.
      * @param onlyIfAttached onlyIfAttached can be used to only allow resuming if the QIX Engine session was reattached properly.
      * @return Promise.
      * Note: Eventually resolved when the websocket (and potentially the previously opened document, and generated APIs) has been restored,
      * rejected when it fails any of those steps, or when onlyIfAttached is true and a new QIX Engine session was created.
      */
    def resume(): js.Promise[_] = js.native
    def resume(onlyIfAttached: Boolean): js.Promise[_] = js.native
    
    /**
      * Suspends the enigma.js session by closing the websocket and rejecting all method calls until it has been resumed again.
      * @return Promise.
      */
    def suspend(): js.Promise[_] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.enigmaJs.enigmaJsStrings.Doc
    - typingsSlinky.enigmaJs.enigmaJsStrings.GenericObject
    - typingsSlinky.enigmaJs.enigmaJsStrings.GenericBookmark
    - java.lang.String
  */
  type MixinType = _MixinType | String
  
  trait _MixinType extends StObject
}
