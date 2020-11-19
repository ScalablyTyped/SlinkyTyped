package typingsSlinky.electron.Electron

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protocol extends js.Object {
  
  // Docs: http://electronjs.org/docs/api/protocol
  /**
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a `Buffer` as a response.
    */
  def interceptBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* buffer */ js.UndefOr[Buffer], Unit], 
      Unit
    ]
  ): Unit = js.native
  def interceptBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* buffer */ js.UndefOr[Buffer], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a file as a response.
    */
  def interceptFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* filePath */ String, Unit], 
      Unit
    ]
  ): Unit = js.native
  def interceptFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* filePath */ String, Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a new HTTP request as a response.
    */
  def interceptHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* redirectRequest */ RedirectRequest, Unit], 
      Unit
    ]
  ): Unit = js.native
  def interceptHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* redirectRequest */ RedirectRequest, Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Same as `protocol.registerStreamProtocol`, except that it replaces an existing
    * protocol handler.
    */
  def interceptStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* stream */ js.UndefOr[ReadableStream | StreamProtocolResponse], Unit], 
      Unit
    ]
  ): Unit = js.native
  def interceptStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* stream */ js.UndefOr[ReadableStream | StreamProtocolResponse], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Intercepts `scheme` protocol and uses `handler` as the protocol's new handler
    * which sends a `String` as a response.
    */
  def interceptStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* data */ js.UndefOr[String | StringProtocolResponse], Unit], 
      Unit
    ]
  ): Unit = js.native
  def interceptStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* data */ js.UndefOr[String | StringProtocolResponse], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * fulfilled with a boolean that indicates whether there is already a handler for
    * `scheme`.
    */
  def isProtocolHandled(scheme: String): js.Promise[Boolean] = js.native
  
  /**
    * Registers a protocol of `scheme` that will send a `Buffer` as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with either a `Buffer` object or an object that has the `data`,
    * `mimeType`, and `charset` properties.
  Example:
    */
  def registerBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* buffer */ js.UndefOr[Buffer | MimeTypedBuffer], Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerBufferProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* buffer */ js.UndefOr[Buffer | MimeTypedBuffer], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Registers a protocol of `scheme` that will send the file as a response. The
    * `handler` will be called with `handler(request, callback)` when a `request` is
    * going to be created with `scheme`. `completion` will be called with
    * `completion(null)` when `scheme` is successfully registered or
    * `completion(error)` when failed.
    *
    * To handle the `request`, the `callback` should be called with either the file's
    * path or an object that has a `path` property, e.g. `callback(filePath)` or
    * `callback({ path: filePath })`. The object may also have a `headers` property
    * which gives a map of headers to values for the response headers, e.g.
    * `callback({ path: filePath, headers: {"Content-Security-Policy": "default-src
    * 'none'"]})`.
    *
    * When `callback` is called with nothing, a number, or an object that has an
    * `error` property, the `request` will fail with the `error` number you specified.
    * For the available error numbers you can use, please see the net error list.
    *
    * By default the `scheme` is treated like `http:`, which is parsed differently
    * than protocols that follow the "generic URI syntax" like `file:`.
    */
  def registerFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* filePath */ js.UndefOr[String | FilePathWithHeaders], Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerFileProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* filePath */ js.UndefOr[String | FilePathWithHeaders], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Registers a protocol of `scheme` that will send an HTTP request as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with a `redirectRequest` object that has the `url`, `method`,
    * `referrer`, `uploadData` and `session` properties.
    *
    * By default the HTTP request will reuse the current session. If you want the
    * request to have a different session you should set `session` to `null`.
    * 
  For POST requests the `uploadData` object must be provided.
    */
  def registerHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* redirectRequest */ RedirectRequest, Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerHttpProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* redirectRequest */ RedirectRequest, Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * **Note:** This method can only be used before the `ready` event of the `app`
    * module gets emitted and can be called only once.
    *
    * Registers the `scheme` as standard, secure, bypasses content security policy for
    * resources, allows registering ServiceWorker and supports fetch API.
    *
    * Specify a privilege with the value of `true` to enable the capability. An
    * example of registering a privileged scheme, with bypassing Content Security
    * Policy:
    *
    * A standard scheme adheres to what RFC 3986 calls generic URI syntax. For example
    * `http` and `https` are standard schemes, while `file` is not.
    *
    * Registering a scheme as standard, will allow relative and absolute resources to
    * be resolved correctly when served. Otherwise the scheme will behave like the
    * `file` protocol, but without the ability to resolve relative URLs.
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
    * `protocol.registerSchemesAsPrivileged` can be used to replicate the
    * functionality of the previous `protocol.registerStandardSchemes`,
    * `webFrame.registerURLSchemeAs*` and `protocol.registerServiceWorkerSchemes`
    * functions that existed prior to Electron 5.0.0, for example:
    * 
  **before (<= v4.x)**
  **after (>= v5.x)**
    */
  def registerSchemesAsPrivileged(customSchemes: js.Array[CustomScheme]): Unit = js.native
  
  /**
    * Registers a protocol of `scheme` that will send a `Readable` as a response.
    *
    * The usage is similar to the other `register{Any}Protocol`, except that the
    * `callback` should be called with either a `Readable` object or an object that
    * has the `data`, `statusCode`, and `headers` properties.
    *
    * Example:
    *
    * It is possible to pass any object that implements the readable stream API (emits
    * `data`/`end`/`error` events). For example, here's how a file could be returned:
    */
  def registerStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* stream */ js.UndefOr[ReadableStream | StreamProtocolResponse], Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerStreamProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* stream */ js.UndefOr[ReadableStream | StreamProtocolResponse], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Registers a protocol of `scheme` that will send a `String` as a response.
    *
    * The usage is the same with `registerFileProtocol`, except that the `callback`
    * should be called with either a `String` or an object that has the `data`,
    * `mimeType`, and `charset` properties.
    */
  def registerStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* data */ js.UndefOr[String | StringProtocolResponse], Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerStringProtocol(
    scheme: String,
    handler: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* data */ js.UndefOr[String | StringProtocolResponse], Unit], 
      Unit
    ],
    completion: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
  
  /**
    * Remove the interceptor installed for `scheme` and restore its original handler.
    */
  def uninterceptProtocol(scheme: String): Unit = js.native
  def uninterceptProtocol(scheme: String, completion: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  
  /**
    * Unregisters the custom protocol of `scheme`.
    */
  def unregisterProtocol(scheme: String): Unit = js.native
  def unregisterProtocol(scheme: String, completion: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
}
