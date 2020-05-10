package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFunctionRequest extends js.Object {
  /**
    * The GraphQL API ID.
    */
  var apiId: String = js.native
  /**
    * The Function ID.
    */
  var functionId: ResourceName = js.native
}

object DeleteFunctionRequest {
  @scala.inline
  def apply(apiId: String, functionId: ResourceName): DeleteFunctionRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], functionId = functionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFunctionRequest]
  }
  @scala.inline
  implicit class DeleteFunctionRequestOps[Self <: DeleteFunctionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunctionId(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

