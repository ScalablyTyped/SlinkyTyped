package typingsSlinky.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.std.BodyInit
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Error
    extends Instantiable0[Response]
       with Instantiable1[/* body */ BodyInit, Response]
       with Instantiable2[(/* body */ BodyInit) | (/* body */ Null), /* init */ ResponseInit, Response] {
    def error(): Response = js.native
    def redirect(url: String): Response = js.native
    def redirect(url: String, status: Double): Response = js.native
  }
  
  @js.native
  trait Instantiable
    extends Instantiable1[/* input */ RequestInfo, Request]
       with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, Request]
  
  @js.native
  trait InstantiableHeaders
    extends Instantiable0[Headers]
       with Instantiable1[/* init */ HeadersInit, Headers]
  
}

