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
import typingsSlinky.std.HeadersInit
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cross-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Headers ()
    extends typingsSlinky.std.Headers {
    def this(init: HeadersInit) = this()
  }
  @js.native
  object Headers
    extends TopLevel[InstantiableHeaders with Instantiable0[org.scalajs.dom.experimental.Headers]]
  
  @js.native
  class Request protected ()
    extends typingsSlinky.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  @js.native
  object Request
    extends TopLevel[
          Instantiable with (Instantiable1[/* input */ RequestInfo, org.scalajs.dom.experimental.Request])
        ]
  
  @js.native
  class Response ()
    extends typingsSlinky.std.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    def this(body: Null, init: ResponseInit) = this()
  }
  @js.native
  object Response
    extends TopLevel[Error with Instantiable0[org.scalajs.dom.experimental.Response]]
  
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
