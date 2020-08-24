package typingsSlinky.crossFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.crossFetch.anon.Error
import typingsSlinky.crossFetch.anon.Instantiable
import typingsSlinky.crossFetch.anon.InstantiableHeaders
import typingsSlinky.std.BodyInit
import typingsSlinky.std.Headers
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.Request
import typingsSlinky.std.RequestInfo
import typingsSlinky.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class headers () extends Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class req protected () extends Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class res () extends Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  
  @js.native
  object fet extends js.Object {
    def apply(input: RequestInfo): js.Promise[org.scalajs.dom.experimental.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.experimental.Response] = js.native
  }
  
  @js.native
  object headers
    extends TopLevel[InstantiableHeaders with Instantiable0[org.scalajs.dom.experimental.Headers]]
  
  @js.native
  object req
    extends TopLevel[
          Instantiable with (Instantiable1[/* input */ RequestInfo, org.scalajs.dom.experimental.Request])
        ]
  
  @js.native
  object res
    extends TopLevel[Error with Instantiable0[org.scalajs.dom.experimental.Response]]
  
}

