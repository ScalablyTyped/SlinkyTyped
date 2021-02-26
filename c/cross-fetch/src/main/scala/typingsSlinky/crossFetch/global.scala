package typingsSlinky.crossFetch

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Headers` */
  @JSGlobal("_Headers")
  @js.native
  class Headers ()
    extends typingsSlinky.std.global.Headers {
    def this(init: HeadersInit) = this()
  }
  /* was `typeof Headers` */
  object Headers
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Request` */
  @JSGlobal("_Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.std.global.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  /* was `typeof Request` */
  object Request
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  /* was `typeof Response` */
  @JSGlobal("_Response")
  @js.native
  class Response ()
    extends typingsSlinky.std.global.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  /* was `typeof Response` */
  object Response {
    
    @JSGlobal("_Response.error")
    @js.native
    def error(): org.scalajs.dom.experimental.Response = js.native
    
    @JSGlobal("_Response.redirect")
    @js.native
    def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
    @JSGlobal("_Response.redirect")
    @js.native
    def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
  }
  
  /* was `typeof fetch` */
  @JSGlobal("_fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  /* was `typeof fetch` */
  @JSGlobal("_fetch")
  @js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
}
