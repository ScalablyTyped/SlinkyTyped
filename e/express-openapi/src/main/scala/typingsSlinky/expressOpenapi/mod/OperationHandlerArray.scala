package typingsSlinky.expressOpenapi.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]]
     with Operation {
  var apiDoc: js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Operation] = js.undefined
}

object OperationHandlerArray {
  @scala.inline
  def apply(
    NumberDictionary: /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]] = null,
    apiDoc: typingsSlinky.openapiTypes.mod.OpenAPI.Operation = null
  ): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (apiDoc != null) __obj.updateDynamic("apiDoc")(apiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationHandlerArray]
  }
}

