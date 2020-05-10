package typingsSlinky.expressOpenapi.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationHandlerArray
  extends /* index */ NumberDictionary[RequestHandler[ParamsDictionary, _, _, Query]]
     with Operation {
  var apiDoc: js.UndefOr[typingsSlinky.openapiTypes.mod.OpenAPI.Operation] = js.native
}

object OperationHandlerArray {
  @scala.inline
  def apply(): OperationHandlerArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationHandlerArray]
  }
  @scala.inline
  implicit class OperationHandlerArrayOps[Self <: OperationHandlerArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiDoc(value: typingsSlinky.openapiTypes.mod.OpenAPI.Operation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiDoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiDoc")(js.undefined)
        ret
    }
  }
  
}

