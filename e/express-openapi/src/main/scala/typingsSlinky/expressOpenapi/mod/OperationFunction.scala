package typingsSlinky.expressOpenapi.mod

import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationFunction
  extends RequestHandler[ParamsDictionary, js.Any, js.Any]
     with Operation {
  var apiDoc: js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Operation] = js.native
  /* InferMemberOverrides */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

