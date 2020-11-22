package typingsSlinky.reactNative

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.Blob
import typingsSlinky.reactNative.anon.DictoptionName
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  def clearImmediate(handle: Double): Unit = js.native
  
  def clearInterval(handle: Double): Unit = js.native
  
  def clearTimeout(handle: Double): Unit = js.native
  
  def fetch(input: RequestInfo): js.Promise[typingsSlinky.reactNative.Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[typingsSlinky.reactNative.Response] = js.native
  
  def fetchBundle(bundleId: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  
  def requestAnimationFrame(callback: js.Function1[/* time */ Double, Unit]): Double = js.native
  
  def setImmediate(handler: js.Function1[/* repeated */ js.Any, Unit]): Double = js.native
  
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setInterval(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  def setTimeout(handler: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): Double = js.native
  
  @js.native
  /**
    * Initialize this controller.
    */
  class AbortController ()
    extends typingsSlinky.reactNative.AbortController
  
  @js.native
  /**
    * AbortSignal cannot be constructed directly.
    */
  class AbortSignal ()
    extends typingsSlinky.reactNative.AbortSignal
  
  @js.native
  class FormData ()
    extends typingsSlinky.reactNative.FormData
  
  @js.native
  class Headers ()
    extends typingsSlinky.reactNative.Headers {
    def this(init: HeadersInit) = this()
  }
  @js.native
  object Headers
    extends Instantiable0[typingsSlinky.reactNative.Headers]
       with Instantiable1[/* init */ HeadersInit, typingsSlinky.reactNative.Headers]
  
  @js.native
  class MessageQueue ()
    extends typingsSlinky.reactNative.MessageQueue
  /* static members */
  @js.native
  object MessageQueue extends js.Object {
    
    def spy(spyOrToggle: js.Function1[/* data */ SpyData, Unit]): Unit = js.native
    def spy(spyOrToggle: Boolean): Unit = js.native
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.reactNative.Request {
    def this(input: String) = this()
    def this(input: typingsSlinky.reactNative.Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: typingsSlinky.reactNative.Request, init: RequestInit) = this()
  }
  @js.native
  object Request
    extends Instantiable1[
          (/* input */ typingsSlinky.reactNative.Request) | (/* input */ String), 
          typingsSlinky.reactNative.Request
        ]
       with Instantiable2[
          (/* input */ typingsSlinky.reactNative.Request) | (/* input */ String), 
          /* init */ RequestInit, 
          typingsSlinky.reactNative.Request
        ]
  
  @js.native
  class Response ()
    extends typingsSlinky.reactNative.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  @js.native
  object Response
    extends Instantiable0[typingsSlinky.reactNative.Response]
       with Instantiable1[/* body */ BodyInit, typingsSlinky.reactNative.Response]
       with Instantiable2[
          js.UndefOr[/* body */ BodyInit], 
          /* init */ ResponseInit, 
          typingsSlinky.reactNative.Response
        ] {
    
    def error(): typingsSlinky.reactNative.Response = js.native
    
    def redirect(url: String): typingsSlinky.reactNative.Response = js.native
    def redirect(url: String, status: Double): typingsSlinky.reactNative.Response = js.native
  }
  
  /**
    * Based on definition from lib.dom but using class syntax.
    * The properties are mutable to support users that use a `URL` polyfill, but the implementation
    * built into React Native (as of 0.63) does not implement all the properties.
    */
  @js.native
  class URL protected ()
    extends typingsSlinky.reactNative.URL {
    def this(url: String) = this()
    def this(url: String, base: String) = this()
  }
  /* static members */
  @js.native
  object URL extends js.Object {
    
    def createObjectURL(blob: Blob): String = js.native
    
    def revokeObjectURL(url: String): Unit = js.native
  }
  
  /**
    * Based on definitions of lib.dom and lib.dom.iterable
    */
  @js.native
  class URLSearchParams ()
    extends typingsSlinky.reactNative.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Array[String]]) = this()
    def this(init: typingsSlinky.reactNative.URLSearchParams) = this()
    def this(init: Record[String, String]) = this()
  }
  
  @js.native
  class WebSocket protected ()
    extends typingsSlinky.reactNative.WebSocket {
    def this(uri: String) = this()
    def this(uri: String, protocols: String) = this()
    def this(uri: String, protocols: js.Array[String]) = this()
    def this(uri: String, protocols: js.UndefOr[scala.Nothing], options: DictoptionName) = this()
    def this(uri: String, protocols: String, options: DictoptionName) = this()
    def this(uri: String, protocols: js.Array[String], options: DictoptionName) = this()
    def this(uri: String, protocols: Null, options: DictoptionName) = this()
  }
  @js.native
  object WebSocket
    extends Instantiable1[/* uri */ String, typingsSlinky.reactNative.WebSocket]
       with Instantiable2[
          /* uri */ String, 
          (/* protocols */ js.Array[String]) | (/* protocols */ String), 
          typingsSlinky.reactNative.WebSocket
        ]
       with Instantiable3[
          /* uri */ String, 
          js.UndefOr[
            (/* protocols */ js.Array[String]) | (/* protocols */ Null) | (/* protocols */ String)
          ], 
          /* options */ DictoptionName, 
          typingsSlinky.reactNative.WebSocket
        ] {
    
    val CLOSED: Double = js.native
    
    val CLOSING: Double = js.native
    
    val CONNECTING: Double = js.native
    
    val OPEN: Double = js.native
  }
  
  @js.native
  class XMLHttpRequest ()
    extends typingsSlinky.reactNative.XMLHttpRequest
  @js.native
  object XMLHttpRequest
    extends Instantiable0[typingsSlinky.reactNative.XMLHttpRequest] {
    
    val DONE: Double = js.native
    
    val HEADERS_RECEIVED: Double = js.native
    
    val LOADING: Double = js.native
    
    val OPENED: Double = js.native
    
    val UNSENT: Double = js.native
  }
  
  @js.native
  class XMLHttpRequestUpload ()
    extends typingsSlinky.reactNative.XMLHttpRequestUpload
  @js.native
  object XMLHttpRequestUpload
    extends Instantiable0[typingsSlinky.reactNative.XMLHttpRequestUpload]
}
