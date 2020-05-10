package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstanceRequest extends js.Object {
  /**
    * Whether to delete the instance Elastic IP address.
    */
  var DeleteElasticIp: js.UndefOr[Boolean] = js.native
  /**
    * Whether to delete the instance's Amazon EBS volumes.
    */
  var DeleteVolumes: js.UndefOr[Boolean] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: String = js.native
}

object DeleteInstanceRequest {
  @scala.inline
  def apply(InstanceId: String): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  @scala.inline
  implicit class DeleteInstanceRequestOps[Self <: DeleteInstanceRequest] (val x: Self) extends AnyVal {
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
    def withDeleteElasticIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteElasticIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteElasticIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteElasticIp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteVolumes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteVolumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteVolumes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteVolumes")(js.undefined)
        ret
    }
  }
  
}

