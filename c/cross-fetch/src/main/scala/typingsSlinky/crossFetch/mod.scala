package typingsSlinky.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Headers ()
    extends typingsSlinky.std.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typingsSlinky.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typingsSlinky.std.Response {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  object Headers
    extends Instantiable0[org.scalajs.dom.experimental.Headers]
       with Instantiable1[/* init */ HeadersInit, org.scalajs.dom.experimental.Headers]
  
  @js.native
  object Request
    extends Instantiable1[/* input */ RequestInfo, org.scalajs.dom.experimental.Request]
       with Instantiable2[
          /* input */ RequestInfo, 
          /* init */ RequestInit, 
          org.scalajs.dom.experimental.Request
        ]
  
  @js.native
  object Response
    extends Instantiable0[org.scalajs.dom.experimental.Response]
       with Instantiable1[/* body */ BodyInit, org.scalajs.dom.experimental.Response]
       with Instantiable2[
          (/* body */ BodyInit) | (/* body */ Null), 
          /* init */ ResponseInit, 
          org.scalajs.dom.experimental.Response
        ] {
    def error(): org.scalajs.dom.experimental.Response = js.native
    def redirect(url: String): org.scalajs.dom.experimental.Response = js.native
    def redirect(url: String, status: Double): org.scalajs.dom.experimental.Response = js.native
  }
  
  @js.native
  object default extends js.Object {
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
}

