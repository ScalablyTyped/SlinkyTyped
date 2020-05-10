package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteQueryLoggingConfigRequest extends js.Object {
  /**
    * The ID of the configuration that you want to delete. 
    */
  var Id: QueryLoggingConfigId = js.native
}

object DeleteQueryLoggingConfigRequest {
  @scala.inline
  def apply(Id: QueryLoggingConfigId): DeleteQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
  }
  @scala.inline
  implicit class DeleteQueryLoggingConfigRequestOps[Self <: DeleteQueryLoggingConfigRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: QueryLoggingConfigId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

