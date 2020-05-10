package typingsSlinky.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploySystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance. This value is returned by the CreateSystemInstance action. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:deployment:DEPLOYMENTNAME 
    */
  var id: js.UndefOr[Urn] = js.native
}

object DeploySystemInstanceRequest {
  @scala.inline
  def apply(): DeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploySystemInstanceRequest]
  }
  @scala.inline
  implicit class DeploySystemInstanceRequestOps[Self <: DeploySystemInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Urn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

