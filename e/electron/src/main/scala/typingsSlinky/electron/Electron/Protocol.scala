package typingsSlinky.electron.Electron

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocol extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/protocol
  /**
    * Whether the protocol was successfully intercepted
    *
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a `Buffer` as a response.
    */
  def interceptBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully intercepted
    *
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a file as a response.
    */
  def interceptFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully intercepted
    *
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a new HTTP request as a response.
    */
  def interceptHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully intercepted
    *
    * Same as `protocol.registerStreamProtocol`, except that it replaces an existing
    * protocol handler.
    */
  def interceptStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully intercepted
    *
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a `String` as a response.
    */
  def interceptStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether `scheme` is already intercepted.
    */
  def isProtocolIntercepted(scheme: String): Boolean = js.native
  
  /**
    * Whether `scheme` is already registered.
    */
  def isProtocolRegistered(scheme: String): Boolean = js.native
  
  /**
    * Whether the protocol was successfully registered
    *
    * Registers a protocol of `scheme` that will send a `Buffer` as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with either a `Buffer` object or an object that has the `data`
    * property.
  Example:
    */
  def registerBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully registered
    *
    * Registers a protocol of `scheme` that will send a file as the response. The
    * `handler` will be called with `request` and `callback` where `request` is an
    * incoming request for the `scheme`.
    *
    * To handle the `request`, the `callback` should be called with either the file's
    * path or an object that has a `path` property, e.g. `callback(filePath)` or
    * `callback({ path: filePath })`. The `filePath` must be an absolute path.
    *
    * By default the `scheme` is treated like `http:`, which is parsed differently
    * from protocols that follow the "generic URI syntax" like `file:`.
    */
  def registerFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully registered
    *
    * Registers a protocol of `scheme` that will send an HTTP request as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with an object that has the `url` property.
    */
  def registerHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * **Note:** This method can only be used before the `ready` event of the `app`
    * module gets emitted and can be called only once.
    *
    * Registers the `scheme` as standard, secure, bypasses content security policy for
    * resources, allows registering ServiceWorker, supports fetch API, and streaming
    * video/audio. Specify a privilege with the value of `true` to enable the
    * capability.
    *
    * An example of registering a privileged scheme, that bypasses Content Security
    * Policy:
    *
    * A standard scheme adheres to what RFC 3986 calls generic URI syntax. For example
    * `http` and `https` are standard schemes, while `file` is not.
    *
    * Registering a scheme as standard allows relative and absolute resources to be
    * resolved correctly when served. Otherwise the scheme will behave like the `file`
    * protocol, but without the ability to resolve relative URLs.
    *
    * For example when you load following page with custom protocol without
    * registering it as standard scheme, the image will not be loaded because
    * non-standard schemes can not recognize relative URLs:
    *
    * Registering a scheme as standard will allow access to files through the
    * FileSystem API. Otherwise the renderer will throw a security error for the
    * scheme.
    *
    * By default web storage apis (localStorage, sessionStorage, webSQL, indexedDB,
    * cookies) are disabled for non standard schemes. So in general if you want to
    * register a custom protocol to replace the `http` protocol, you have to register
    * it as a standard scheme.
    *
    * Protocols that use streams (http and stream protocols) should set `stream:
    * true`. The `<video>` and `<audio>` HTML elements expect protocols to buffer
    * their responses by default. The `stream` flag configures those elements to
    * correctly expect streaming responses.
    */
  def registerSchemesAsPrivileged(customSchemes: js.Array[CustomScheme]): Unit = js.native
  
  /**
    * Whether the protocol was successfully registered
    *
    * Registers a protocol of `scheme` that will send a stream as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with either a `ReadableStream` object or an object that has the
    * `data` property.
    *
    * Example:
    *
    * It is possible to pass any object that implements the readable stream API (emits
    * `data`/`end`/`error` events). For example, here's how a file could be returned:
    */
  def registerStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully registered
    *
    * Registers a protocol of `scheme` that will send a `String` as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with either a `String` or an object that has the `data`
    * property.
    */
  def registerStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]
  ): Boolean = js.native
  
  /**
    * Whether the protocol was successfully unintercepted
    * 
  Remove the interceptor installed for `scheme` and restore its original handler.
    */
  def uninterceptProtocol(scheme: String): Boolean = js.native
  
  /**
    * Whether the protocol was successfully unregistered
    * 
  Unregisters the custom protocol of `scheme`.
    */
  def unregisterProtocol(scheme: String): Boolean = js.native
}
object Protocol {
  
  @scala.inline
  def apply(
    interceptBufferProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    interceptFileProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    interceptHttpProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    interceptStreamProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    interceptStringProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    isProtocolIntercepted: String => Boolean,
    isProtocolRegistered: String => Boolean,
    registerBufferProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    registerFileProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    registerHttpProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    registerSchemesAsPrivileged: js.Array[CustomScheme] => Unit,
    registerStreamProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    registerStringProtocol: (String, js.Function2[
      /* request */ ProtocolRequest, 
      /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
      Unit
    ]) => Boolean,
    uninterceptProtocol: String => Boolean,
    unregisterProtocol: String => Boolean
  ): Protocol = {
    val __obj = js.Dynamic.literal(interceptBufferProtocol = js.Any.fromFunction2(interceptBufferProtocol), interceptFileProtocol = js.Any.fromFunction2(interceptFileProtocol), interceptHttpProtocol = js.Any.fromFunction2(interceptHttpProtocol), interceptStreamProtocol = js.Any.fromFunction2(interceptStreamProtocol), interceptStringProtocol = js.Any.fromFunction2(interceptStringProtocol), isProtocolIntercepted = js.Any.fromFunction1(isProtocolIntercepted), isProtocolRegistered = js.Any.fromFunction1(isProtocolRegistered), registerBufferProtocol = js.Any.fromFunction2(registerBufferProtocol), registerFileProtocol = js.Any.fromFunction2(registerFileProtocol), registerHttpProtocol = js.Any.fromFunction2(registerHttpProtocol), registerSchemesAsPrivileged = js.Any.fromFunction1(registerSchemesAsPrivileged), registerStreamProtocol = js.Any.fromFunction2(registerStreamProtocol), registerStringProtocol = js.Any.fromFunction2(registerStringProtocol), uninterceptProtocol = js.Any.fromFunction1(uninterceptProtocol), unregisterProtocol = js.Any.fromFunction1(unregisterProtocol))
    __obj.asInstanceOf[Protocol]
  }
  
  @scala.inline
  implicit class ProtocolOps[Self <: Protocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInterceptBufferProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("interceptBufferProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterceptFileProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("interceptFileProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterceptHttpProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("interceptHttpProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterceptStreamProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("interceptStreamProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInterceptStringProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("interceptStringProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsProtocolIntercepted(value: String => Boolean): Self = this.set("isProtocolIntercepted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsProtocolRegistered(value: String => Boolean): Self = this.set("isProtocolRegistered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterBufferProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ Buffer | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("registerBufferProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterFileProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("registerFileProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterHttpProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("registerHttpProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterSchemesAsPrivileged(value: js.Array[CustomScheme] => Unit): Self = this.set("registerSchemesAsPrivileged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterStreamProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ ReadableStream | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("registerStreamProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterStringProtocol(
      value: (String, js.Function2[
          /* request */ ProtocolRequest, 
          /* callback */ js.Function1[/* response */ String | ProtocolResponse, Unit], 
          Unit
        ]) => Boolean
    ): Self = this.set("registerStringProtocol", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUninterceptProtocol(value: String => Boolean): Self = this.set("uninterceptProtocol", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterProtocol(value: String => Boolean): Self = this.set("unregisterProtocol", js.Any.fromFunction1(value))
  }
}
