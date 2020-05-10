package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
}

object DeleteCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteCoreDefinitionRequestOps[Self <: DeleteCoreDefinitionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoreDefinitionId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoreDefinitionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

