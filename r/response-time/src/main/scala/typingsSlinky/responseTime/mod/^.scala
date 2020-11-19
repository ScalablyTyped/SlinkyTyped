package typingsSlinky.responseTime.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("response-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  def apply(): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  def apply(
    fn: js.Function3[
      /* request */ Request_[ParamsDictionary, _, _, Query], 
      /* response */ Response_[_], 
      /* time */ Double, 
      _
    ]
  ): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
}
