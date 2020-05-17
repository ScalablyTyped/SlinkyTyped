package typingsSlinky.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody, ReqQuery]
  - typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]
  - js.Array[
(typingsSlinky.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any, typingsSlinky.expressServeStaticCore.mod.Query]) | (typingsSlinky.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any, typingsSlinky.expressServeStaticCore.mod.Query])]
*/
trait RequestHandlerParams[P /* <: Params */, ResBody, ReqBody, ReqQuery] extends js.Object

object RequestHandlerParams {
  @scala.inline
  implicit def apply[P, ResBody, ReqBody, ReqQuery](
    value: js.Array[
      (RequestHandler[P, js.Any, js.Any, Query]) | (ErrorRequestHandler[P, js.Any, js.Any, Query])
    ]
  ): RequestHandlerParams[P, ResBody, ReqBody, ReqQuery] = value.asInstanceOf[RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]]
  @scala.inline
  implicit def apply[P, ResBody, ReqBody, ReqQuery](value: ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery]): RequestHandlerParams[P, ResBody, ReqBody, ReqQuery] = value.asInstanceOf[RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]]
  @scala.inline
  implicit def apply[P, ResBody, ReqBody, ReqQuery](value: RequestHandler[P, ResBody, ReqBody, ReqQuery]): RequestHandlerParams[P, ResBody, ReqBody, ReqQuery] = value.asInstanceOf[RequestHandlerParams[P, ResBody, ReqBody, ReqQuery]]
}

