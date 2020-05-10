package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignInstanceRequest extends js.Object {
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
  /**
    * The layer ID, which must correspond to a custom layer. You cannot assign a registered instance to a built-in layer.
    */
  var LayerIds: Strings = js.native
}

object AssignInstanceRequest {
  @scala.inline
  def apply(InstanceId: String, LayerIds: Strings): AssignInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LayerIds = LayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignInstanceRequest]
  }
  @scala.inline
  implicit class AssignInstanceRequestOps[Self <: AssignInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayerIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

